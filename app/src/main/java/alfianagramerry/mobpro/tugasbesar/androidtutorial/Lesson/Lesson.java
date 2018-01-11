package alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.Demo.Demo1;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Learning.Learning;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;


public class Lesson extends Fragment implements View.OnClickListener, OnPageChangeListener, OnLoadCompleteListener {

    public static String pdf = "";
    public static String app = "KeyboardSample";
    public static String title = "Keyboard Sample";

    private PDFView pdfView;
    private Integer pageNumber = 0;
    private BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    public Lesson() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_lesson, container, false);
        pdf = getArguments().getString("pdf");
        title = getArguments().getString("title");
        app = getArguments().getString("app");
        getActivity().setTitle(title);

        bottomNavigation = (BottomNavigationView)rootView.findViewById(R.id.bottom_navigation);
        bottomNavigation.inflateMenu(R.menu.menu_learning);
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.viewnya, new Learning()).commit();

        bottomNavigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        int id = item.getItemId();
                        switch (id) {
                            case R.id.learning:
                                fragment = new Learning();
                                break;
                            case R.id.demo:
                                fragment = new Demo1();
                                break;
                        }
                        final FragmentTransaction transaction = fragmentManager.beginTransaction();
                        transaction.replace(R.id.viewnya, fragment).commit();
                        return true;
                    }
                });

        return rootView;

   /*     pdfView = rootView.findViewById(R.id.pdfView);
        displayFromAsset(pdf);
      //  FloatingActionButton demo = rootView.findViewById(R.id.menuju_demo);
        //demo.setOnClickListener(this);

        return rootView; */
    }

    public void onClick(View v) {
        Intent intent = null;
        try {
            String apaja = "alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain."
                    + app + "." + app;
            intent = new Intent(getActivity(), Class.forName(apaja));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        startActivity(intent);
    }

    private void displayFromAsset(String assetFileName) {
        String pdfFileName = assetFileName;

        pdfView.fromAsset(pdf)
                .defaultPage(pageNumber)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .load();
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        getActivity().setTitle(String.format("%s %s / %s", title, page + 1, pageCount));
    }

    @Override
    public void loadComplete(int nbPages) {
        PdfDocument.Meta meta = pdfView.getDocumentMeta();
        printBookmarksTree(pdfView.getTableOfContents(), "-");
    }

    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {
            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }
}

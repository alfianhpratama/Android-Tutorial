package alfianagramerry.mobpro.tugasbesar.androidtutorial.Learning;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Learning extends Fragment {

    public static String pdf = "KeyboardSamples";
    public static String title = "";
    private PDFView pdfView;

    public Learning() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_learning1, container, false);
        pdf = getArguments().getString("pdf");
        title = getArguments().getString("title");
        pdfView = rootView.findViewById(R.id.pdfView);
        displayFromAsset(pdf);
        // Inflate the layout for this fragment
        return rootView;
    }
    private void displayFromAsset(String assetFileName) {
        String pdfFileName = assetFileName;

        pdfView.fromAsset(pdf)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableAnnotationRendering(true)
                .load();
    }

}

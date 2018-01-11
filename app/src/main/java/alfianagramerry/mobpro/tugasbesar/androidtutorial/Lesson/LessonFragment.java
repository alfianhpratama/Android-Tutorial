package alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.Demo.Demo1;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Learning.Learning;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class LessonFragment extends Fragment {

    private BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private FragmentManager fragmentManager;
    public static String pdf_c = "";
    public static String title_c = "Keyboard Sample";
    public static String data_c[];

    public LessonFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_lesson, container, false);
        getActivity().setTitle("Lesson 1");
        title_c = getArguments().getString("title");
        pdf_c = getArguments().getString("pdf");
        data_c = getArguments().getStringArray("data");

        bottomNavigation = rootView.findViewById(R.id.bottom_navigation);
        bottomNavigation.inflateMenu(R.menu.menu_learning);
        fragmentManager = getFragmentManager();
        final Bundle key = new Bundle();
        final Fragment learning = new Learning();
        key.putString("title",title_c);
        key.putString("pdf",pdf_c);
        learning.setArguments(key);
        fragmentManager.beginTransaction().replace(R.id.viewnya, learning).commit();

        bottomNavigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        int id = item.getItemId();
                        switch (id) {
                            case R.id.learning:
                                fragment = learning;
                                break;
                            case R.id.demo:
                                Bundle keyDemo = new Bundle();
                                keyDemo.putStringArray("data",data_c);
                                fragment = new Demo1();
                                fragment.setArguments(keyDemo);
                                break;
                        }
                        final FragmentTransaction transaction = fragmentManager.beginTransaction();
                        transaction.replace(R.id.viewnya, fragment).commit();
                        return true;
                    }
                });

        return rootView;
    }
}

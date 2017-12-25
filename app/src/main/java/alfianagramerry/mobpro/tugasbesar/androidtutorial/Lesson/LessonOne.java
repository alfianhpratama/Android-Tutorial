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

import alfianagramerry.mobpro.tugasbesar.androidtutorial.Demo.DemoLessonOne;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Learning.LearningLessonOne;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class LessonOne extends Fragment {

    private BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    public LessonOne() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_lesson_one, container, false);

        bottomNavigation = rootView.findViewById(R.id.bottom_navigation);
        bottomNavigation.inflateMenu(R.menu.menu_learning);
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.viewnya, new LearningLessonOne()).commit();

        bottomNavigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        int id = item.getItemId();
                        switch (id) {
                            case R.id.learning:
                                fragment = new LearningLessonOne();
                                break;
                            case R.id.demo:
                                fragment = new DemoLessonOne();
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

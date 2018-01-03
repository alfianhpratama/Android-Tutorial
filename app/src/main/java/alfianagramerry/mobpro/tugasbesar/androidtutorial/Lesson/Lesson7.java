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

import alfianagramerry.mobpro.tugasbesar.androidtutorial.Demo.Demo2;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Learning.Learning1;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Learning.Learning2;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.TabLateral.TabLateral;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.WhoWriteApp.WhoWriteApp;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/**
 * Created by Agra on 26/12/2017.
 */

public class Lesson7 extends Fragment {
    private BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    public Lesson7() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_lesson2, container, false);
        getActivity().setTitle("Lesson 7");

        bottomNavigation = (BottomNavigationView) rootView.findViewById(R.id.bottom_navigation);
        bottomNavigation.inflateMenu(R.menu.menu_learning);
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.viewnya, new Learning1()).commit();

        bottomNavigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        int id = item.getItemId();
                        final Intent intent;
                        switch (id) {
                            case R.id.learning:
                                fragment = new Learning1();
                                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                                transaction.replace(R.id.viewnya, fragment).commit();
                                break;
                            case R.id.demo:
                                intent = new Intent(Lesson7.this.getActivity(), WhoWriteApp.class);
                                startActivity(intent);
                                break;
                        }

                        return true;
                    }
                });

        return rootView;
    }}

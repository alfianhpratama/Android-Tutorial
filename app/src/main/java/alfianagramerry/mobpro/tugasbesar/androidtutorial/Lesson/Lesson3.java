package alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.Learning.Learning1;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.AlertSample.AlertSample;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.KeyboardSamples.KeyboardSamples;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class Lesson3 extends Fragment implements View.OnClickListener {

    private FloatingActionButton demo;

    public Lesson3() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_lesson, container, false);
        getActivity().setTitle("Lesson 3 Alert Sample");

        demo = rootView.findViewById(R.id.menuju_demo);
        demo.setOnClickListener(this);

        return rootView;
    }

    public void onClick(View v) {
        Intent intent = new Intent(this.getActivity(), KeyboardSamples.class);
        startActivity(intent);
    }
    }

package alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson;

/**
 * Edited by Merry on 04/01/2018.
 */

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.DroidCafe.DroidCafe;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.TwoActivities.TwoActivities;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.DateTimePicker.DateTimePicker;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.DroidCafe.DroidCafe;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;


public class Lesson12 extends Fragment implements View.OnClickListener {

    private FloatingActionButton demo;

    public Lesson12() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_lesson, container, false);
        getActivity().setTitle("Lesson 12 TwoActivities");

        demo = rootView.findViewById(R.id.menuju_demo);
        demo.setOnClickListener(this);

        return rootView;
    }

    public void onClick(View v) {
        Intent intent = new Intent(this.getActivity(), TwoActivities.class);
        startActivity(intent);
    }
}

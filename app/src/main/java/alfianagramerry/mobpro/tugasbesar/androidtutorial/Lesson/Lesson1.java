package alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.KeyboardSamples.KeyboardSamples;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class Lesson1 extends Fragment implements View.OnClickListener {

    private FloatingActionButton demo;

    public Lesson1() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_lesson, container, false);
        getActivity().setTitle("Lesson 1 Keyboard Sample");

        demo = rootView.findViewById(R.id.menuju_demo);
        demo.setOnClickListener(this);

        return rootView;
    }

    public void onClick(View v) {
        Intent intent = new Intent(Lesson1.this.getActivity(), KeyboardSamples.class);
        startActivity(intent);
    }

}

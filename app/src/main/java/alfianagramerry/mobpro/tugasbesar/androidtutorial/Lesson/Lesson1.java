package alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.Toast;

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
        getActivity().setTitle("Lesson 1 KeyboardSample");

        demo = rootView.findViewById(R.id.menuju_demo);
        demo.setOnClickListener(this);

        return rootView;
    }

    public void onClick(View v) {
        PopupMenu popupMenu = new PopupMenu(this.getActivity(), demo);
        popupMenu.getMenuInflater().inflate(R.menu.git_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent(getActivity(), KeyboardSamples.class);
                startActivity(intent);
                return true;
            }
        });
        popupMenu.show();
    }
}

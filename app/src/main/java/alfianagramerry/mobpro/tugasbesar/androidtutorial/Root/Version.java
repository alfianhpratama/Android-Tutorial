package alfianagramerry.mobpro.tugasbesar.androidtutorial.Root;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class Version extends Fragment {

    public Version(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.version, container, false);
        getActivity().setTitle("Versions");

        return rootView;
    }
}

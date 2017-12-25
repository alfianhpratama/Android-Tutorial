package alfianagramerry.mobpro.tugasbesar.androidtutorial.Root;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/**
 * Created by Alfian Hadi Pratama on 25/12/2017.
 */

public class Utama extends Fragment {

    public Utama(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.utama, container, false);
        getActivity().setTitle("Android Tutorial");

        return rootView;
    }
}
package alfianagramerry.mobpro.tugasbesar.androidtutorial.Root;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class AboutUs extends Fragment {

    public AboutUs(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_about_us, container, false);
        getActivity().setTitle("Tentang Kami");

        return rootView;
    }
}

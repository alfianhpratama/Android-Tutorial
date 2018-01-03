package alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.TabLateral;

/**
 * Created by Agra on 03/01/2018.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment {

    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tablateral_tab_fragment1, container, false);
    }

}

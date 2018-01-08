package alfianagramerry.mobpro.tugasbesar.androidtutorial.Root;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/*
 * Created by Alfian Hadi Pratama on 25/12/2017.
 */

public class Version extends Fragment {

    private String myVersionName = "not available"; // initialize String

    public Version() {
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.version, container, false);
        getActivity().setTitle("Versions");

        Context context = getActivity().getApplicationContext();
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();

        try {
            myVersionName = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        TextView textView = rootView.findViewById(R.id.versin_mode);
        textView.setText("Version " + myVersionName);

        return rootView;
    }
}

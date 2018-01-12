package alfianagramerry.mobpro.tugasbesar.androidtutorial.Root;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/*
 * Created by Alfian Hadi Pratama on 11/01/2018.
 */

public class FragmentSlider extends Fragment {
    private static final String ARG_PARAM1 = "params";

    private String imageUrls;

    public FragmentSlider() {
    }

    public static FragmentSlider newInstance(String params) {
        FragmentSlider fragment = new FragmentSlider();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, params);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        imageUrls = getArguments().getString(ARG_PARAM1);
        View view = inflater.inflate(R.layout.slider_item, container, false);
        ImageView img = view.findViewById(R.id.img_for_slider);
        Glide.with(getActivity()).load(imageUrls).into(img);
        return view;
    }
}

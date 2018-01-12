package alfianagramerry.mobpro.tugasbesar.androidtutorial.Demo;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.Adapter.Data;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Adapter.ListData;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Demo1 extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<ListData> listData;
    public static String data[];
    public String noDemo;
    View rootView;
    FragmentManager fragmentManager;

    //sesuaikan dengan adapter
    private Data dataAdapter;

    public Demo1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_demo1, container, false);
        data = getArguments().getStringArray("data");
        fragmentManager = getFragmentManager();
        recyclerView = rootView.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        listData  = new ArrayList<>();
        dataAdapter = new Data(getActivity(), listData);
        recyclerView.setAdapter(dataAdapter);
        
        ambilData();

        return rootView;
    }

    private void ambilData() {
        String[] demoList = data;
        if (data==null || data.length==0){
            TextView test = rootView.findViewById(R.id.warning_demo);
            test.setText(getText(R.string.no_demo));
            getFragmentManager().popBackStack();
        }else {
            for (int i = 0; i < demoList.length; i++) {
                listData.add(new ListData(demoList[i]));
            }

            dataAdapter.notifyDataSetChanged();
        }
    }

}

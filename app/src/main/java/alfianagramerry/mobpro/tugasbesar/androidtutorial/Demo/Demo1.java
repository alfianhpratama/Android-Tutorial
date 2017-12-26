package alfianagramerry.mobpro.tugasbesar.androidtutorial.Demo;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.Adapter.Data1;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Adapter.ListData;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Demo1 extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<ListData> listData;

    //sesuaikan dengan adapter
    private Data1 dataAdapter;

    public Demo1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_demo1, container, false);

        recyclerView = rootView.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        listData  = new ArrayList<>();
        dataAdapter = new Data1(getActivity(), listData);
        recyclerView.setAdapter(dataAdapter);
        
        ambilData();

        return rootView;
    }

    private void ambilData() {
        String[] demoList = getResources().getStringArray(R.array.judul_demo1);

        listData.clear();

        for (int i = 0; i < demoList.length; i++) {
            listData.add(new ListData(demoList[i]));
        }

        dataAdapter.notifyDataSetChanged();
    }

}

package com.keshav.inmobi.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.keshav.inmobi.adapters.CustomAdapter;
import com.keshav.inmobi.DataModel;
import com.keshav.inmobi.R;

import java.util.ArrayList;

/**
 * Created by keshav.p on 4/8/17.
 */

public class TabFragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.tab_fragment_2,container,false);
        ListView lv= (ListView) rootView.findViewById(R.id.tab2ListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getDramaMovies());
        lv.setAdapter(adapter);
        return rootView;
    }
    private ArrayList<DataModel> getDramaMovies() {
        ArrayList<DataModel> movies=new ArrayList<>();
        DataModel DataModel=new DataModel("Star Wars",R.drawable.inmobi,"RESPONSE URL");
        movies.add(DataModel);
        DataModel=new DataModel("Ghost Rider",R.drawable.inmobi,"RESPONSE URL");
        movies.add(DataModel);
        DataModel=new DataModel("Game Of Thrones",R.drawable.inmobi,"RESPONSE URL");
        movies.add(DataModel);
        DataModel=new DataModel("Ghost",R.drawable.inmobi,"RESPONSE URL");
        movies.add(DataModel);
        return movies;
    }
    @Override
    public String toString() {
        return "Tab 2";
    }
}

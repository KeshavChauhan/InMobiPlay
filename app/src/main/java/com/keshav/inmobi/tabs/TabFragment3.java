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

public class TabFragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.tab_fragment_3,container,false);
        ListView lv= (ListView) rootView.findViewById(R.id.tab3ListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getDocumentaries());
        lv.setAdapter(adapter);
        return rootView;
    }
    private ArrayList<DataModel> getDocumentaries() {
        ArrayList<DataModel> movies=new ArrayList<>();
        DataModel movie=new DataModel("Columbia",R.drawable.inmobi,"RESPONSE URL");
        movies.add(movie);
        movie=new DataModel("How to Live to 100",R.drawable.inmobi,"RESPONSE URL");
        movies.add(movie);
        movie=new DataModel("Death of The Sun",R.drawable.inmobi,"RESPONSE URL");
        movies.add(movie);
        movie=new DataModel("Inventions",R.drawable.inmobi,"RESPONSE URL");
        movies.add(movie);
        movie=new DataModel("The Super Jumbo ",R.drawable.inmobi,"RESPONSE URL");
        movies.add(movie);
        return movies;
    }
    @Override
    public String toString() {
        return "Tab 3";
    }
}

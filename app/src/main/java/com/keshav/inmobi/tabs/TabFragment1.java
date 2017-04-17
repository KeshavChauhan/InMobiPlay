package com.keshav.inmobi.tabs;


import android.support.annotation.Nullable;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import android.support.v4.app.Fragment;

import com.keshav.inmobi.adapters.CustomAdapter;
import com.keshav.inmobi.DataModel;
import com.keshav.inmobi.R;

/**
 * Created by keshav.p on 4/8/17.
 */

public class TabFragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.tab_fragment_1,container,false);
        ListView lv= (ListView) rootView.findViewById(R.id.tab1ListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getCrimeMovies());
        lv.setAdapter(adapter);
        return rootView;
    }
    private ArrayList<DataModel> getCrimeMovies() {
        //COLECTION OF CRIME MOVIES
        ArrayList<DataModel> movies=new ArrayList<>();
        //SINGLE MOVIE
        DataModel DataModel=new DataModel("BLACKLIST",R.drawable.inmobi,"RESPONSE URL");
        //ADD ITR TO COLLECTION
        movies.add(DataModel);
        DataModel=new DataModel("Breaking Bad",R.drawable.inmobi,"RESPONSE URL");
        movies.add(DataModel);
        DataModel=new DataModel("Crisis",R.drawable.inmobi,"RESPONSE URL");
        movies.add(DataModel);
        DataModel=new DataModel("BlackList",R.drawable.inmobi,"RESPONSE URL");
        movies.add(DataModel);
        DataModel=new DataModel("Men In Black",R.drawable.inmobi,"RESPONSE URL");
        movies.add(DataModel);
        return movies;
    }
    @Override
    public String toString() {
        String title="Tab 1";
        return title;
    }

}


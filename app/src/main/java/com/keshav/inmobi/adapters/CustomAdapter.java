package com.keshav.inmobi.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.keshav.inmobi.DataModel;
import com.keshav.inmobi.R;

import java.util.ArrayList;

/**
 * Created by keshav.p on 4/8/17.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    ArrayList<DataModel> DataModels;
    LayoutInflater inflater;
    public CustomAdapter(Context c, ArrayList<DataModel> DataModels) {
        this.c = c;
        this.DataModels = DataModels;
    }
    @Override
    public int getCount() {
        return DataModels.size();
    }
    @Override
    public Object getItem(int position) {
        return DataModels.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.data_model,parent,false);
        }
        TextView nameTxt= (TextView) convertView.findViewById(R.id.nameTxt);
        ImageView img= (ImageView) convertView.findViewById(R.id.movieImage);
        final  String response= DataModels.get(position).getResponse();
        final String name=DataModels.get(position).getName();
        int image=DataModels.get(position).getImage();
        nameTxt.setText(name);
        img.setImageResource(image);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c,name,Toast.LENGTH_SHORT).show();
                Toast.makeText(c,response,Toast.LENGTH_LONG).show();
            }
        });
        return convertView;
    }
}


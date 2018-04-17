package com.example.sidhi.foodcham;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sidhi on 4/10/2018.
 */

public class customAdapter extends BaseAdapter {

    Context c;
    String[] name = {"item1","item2","item3","item4","item5","item6","item7"};
    String[] price = {"10000","12000","15000","30000","45000","70000","100000"};
    int[] images={R.drawable.dishes,R.drawable.dishes,R.drawable.dishes,R.drawable.dishes,R.drawable.dishes,R.drawable.dishes,R.drawable.dishes};

    public customAdapter (Context ctx)
    {
        this.c=ctx;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return name[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            LayoutInflater inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.dishes,null);

        }
        //get view
        TextView name1=convertView.findViewById(R.id.tv1);
        //TextView price1=convertView.findViewById(R.id.tv2);
        ImageView img=convertView.findViewById(R.id.img);

        //set text
        name1.setText(name[position]);
       // price1.setText(price[position]);
        img.setImageResource(images[position]);

        return convertView;
    }
}

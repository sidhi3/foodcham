package com.example.sidhi.foodcham;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Sidhi on 4/10/2018.
 */

public class fragmentb extends Fragment {

    TextView name1,price;
    ImageView img;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentb_layout, container, false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        img = getActivity().findViewById(R.id.img1);
        name1 = getActivity().findViewById(R.id.tv3);
        price = getActivity().findViewById(R.id.tv4);
    }

    public void changedata(String str, int i, ImageView img) {
        customAdapter adapter = new customAdapter(this.getActivity());

      //  String text = name1.getText().toString();

        img.setImageResource(adapter.images[i]);
        name1.setText(adapter.name[i]);
        price.setText(adapter.price[i]);
    }
}

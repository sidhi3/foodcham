package com.example.sidhi.foodcham;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by Sidhi on 4/10/2018.
 */

public class fragmenta  extends Fragment{

    ListView list;
    communicator com;
    ImageView img;
    String str;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmenta_layout, container, false);


    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = getActivity().findViewById(R.id.list);
        com =(communicator)getActivity();
        customAdapter adapter = new customAdapter(getActivity());

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                com.respond(str,i,img);
            }
        });


    }
}

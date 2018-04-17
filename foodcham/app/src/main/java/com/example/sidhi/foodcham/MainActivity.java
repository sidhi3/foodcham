package com.example.sidhi.foodcham;

import android.app.FragmentManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void respond(String str, int i,ImageView img) {
        FragmentManager manager=getFragmentManager();
        fragmentb f2= (fragmentb) manager.findFragmentById(R.id.fragment2);
        f2.changedata(str,i,img);
    }
}

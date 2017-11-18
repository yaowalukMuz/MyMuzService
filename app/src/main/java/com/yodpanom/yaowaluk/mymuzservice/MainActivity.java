package com.yodpanom.yaowaluk.mymuzservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yodpanom.yaowaluk.mymuzservice.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // saveInstanceState init page call fragment when first open app
//        Add Fragment to Activity
        if(savedInstanceState==null){
            //statue true
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragmentMain, new MainFragment()).commit();
        }

    }//Main Method


}//Main Class

package com.yodpanom.yaowaluk.mymuzservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.yodpanom.yaowaluk.mymuzservice.R;

/**
 * Created by Yaowaluk on 18/11/2560.
 */

public class MainFragment extends Fragment{
//    call method in Fragment Class

    //Create Main method run after createView success

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    //Button Controller
        buttonController();


    }// end Main method of Fragment


    //Find view by ativity and set event method in fragment
    private void buttonController() {
        Button button = getView().findViewById(R.id.btnGoToSecond);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Replace Fragment change mask
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentFragmentMain,new SecondFragment())
                        .addToBackStack(null).commit();

            }
        });
    }


    //create view -->create mask or call fragment main
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    } // End onCreateView method







} //End Main class

package com.yodpanom.yaowaluk.mymuzservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yodpanom.yaowaluk.mymuzservice.R;

/**
 * Created by Yaowaluk on 18/11/2560.
 */

public class SecondFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        return view;
    }


}// Main Class

package com.yodpanom.yaowaluk.mymuzservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yodpanom.yaowaluk.mymuzservice.R;
import com.yodpanom.yaowaluk.mymuzservice.utility.GetJSON;
import com.yodpanom.yaowaluk.mymuzservice.utility.MyConstant;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Yaowaluk on 18/11/2560.
 */

public class SecondFragment extends Fragment{

    //Explicit
    private String jsonString,rateString,dateString,answerString, usdString;
    private String jsonRateString;
    private Double rateADouble;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Read JSON
        readJSON();

        //show date from json data
        showDate();



    }// Main Method

    private void showDate() {
        TextView textView = getView().findViewById(R.id.txtShowDate);

        try {
            JSONArray jsonArray = new JSONArray("[" + jsonString + "]");
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            dateString = jsonObject.getString("date");
            Log.d("19NovV1", "Date____>" + " " + dateString);

            textView.setText(getText(R.string.date) + dateString);

            jsonRateString = "[" + jsonObject.getString("rates") + "]";

            Log.d("19NovV1", "jsonRateString____>" + " " + jsonRateString);

            JSONArray jsonArray1 = new JSONArray(jsonRateString);
            JSONObject jsonObject1 = jsonArray1.getJSONObject(0);
            rateString = jsonObject1.getString("THB");
            Log.d("19NovV1", "RateString____>" + " " + rateString);

            textV


        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    private void readJSON() {
        String tag="19NovV1";
        MyConstant myConstant = new MyConstant();
        try {
            GetJSON getJSON = new GetJSON(getActivity());
            getJSON.execute(myConstant.getUrlJSON());
            jsonString = getJSON.get();
            Log.d(tag, "JSON==>" + jsonString);

        } catch (Exception e) {
            e.printStackTrace();
            Log.d(tag, "e ==>" + e.toString());
        }

    }

    // Create view (Make Mask)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        return view;
    }


}// Main Class

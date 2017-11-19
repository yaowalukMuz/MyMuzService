package com.yodpanom.yaowaluk.mymuzservice.utility;

import android.content.Context;
import android.os.AsyncTask;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * Created by Yaowaluk on 19/11/2560.
 * thread get json
 */

public class GetJSON extends AsyncTask<String,Void,String> {
    // Create Context
    private Context context;

    public GetJSON(Context context) {
        this.context = context;
    }


    @Override
    protected String doInBackground(String... strings) {
        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(strings[0]).build();
            Response response = okHttpClient.newCall(request).execute();

            return response.body().string();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);



    }
}// main class

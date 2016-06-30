package com.jkxy.showdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject object = new JSONObject();
        try {
            object.get("");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

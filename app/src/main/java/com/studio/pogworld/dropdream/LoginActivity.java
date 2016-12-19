package com.studio.pogworld.dropdream;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Micheal on 12/16/2016.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //SharedPreferences someData;
    public static String myImgLog = "";
    //list.add("1");
    //list.add("2");
    //list.add("3");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (myImgLog.equals("")) {
            //Toast.makeText(this, "Please set your pattern", Toast.LENGTH_LONG).show();
            Thread timer = new Thread() {
                public void run() {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        Intent i = new Intent("com.studio.pogworld.dropdream.CREATELOGINACTIVITY");
                        startActivity(i);
                    }
                }

            };
            timer.start();
        }

        //someData = getSharedPreferences(myImgLog, 0);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        }

    }
}

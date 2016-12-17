package com.studio.pogworld.dropdream;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Micheal on 12/16/2016.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //SharedPreferences someData;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16;
    public static String myImgLog = "";
    //list.add("1");
    //list.add("2");
    //list.add("3");
    private void GetImages(){
        img1 = (ImageView)  findViewById(R.id.iv1);
        img2 = (ImageView)  findViewById(R.id.iv2);
        img3 = (ImageView)  findViewById(R.id.iv3);
        img4 = (ImageView)  findViewById(R.id.iv4);
        img5 = (ImageView)  findViewById(R.id.iv5);
        img6 = (ImageView)  findViewById(R.id.iv6);
        img7 = (ImageView)  findViewById(R.id.iv7);
        img8 = (ImageView)  findViewById(R.id.iv8);
        img9 = (ImageView)  findViewById(R.id.iv9);
        img10 = (ImageView)  findViewById(R.id.iv10);
        img11 = (ImageView)  findViewById(R.id.iv11);
        img12 = (ImageView)  findViewById(R.id.iv12);
        img13 = (ImageView)  findViewById(R.id.iv13);
        img14 = (ImageView)  findViewById(R.id.iv14);
        img15 = (ImageView)  findViewById(R.id.iv15);
        img16 = (ImageView)  findViewById(R.id.iv16);
    }
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
        GetImages();
        //listening to onclicklistener
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        img10.setOnClickListener(this);
        img11.setOnClickListener(this);
        img12.setOnClickListener(this);
        img13.setOnClickListener(this);
        img14.setOnClickListener(this);
        img15.setOnClickListener(this);
        img16.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv1:
                break;
            case R.id.iv2:
                break;
            case R.id.iv3:
                break;
            case R.id.iv4:
                break;
            case R.id.iv5:
                break;
            case R.id.iv6:
                break;
            case R.id.iv7:
                break;
            case R.id.iv8:
                break;
            case R.id.iv9:
                break;
            case R.id.iv10:
                break;
            case R.id.iv11:
                break;
            case R.id.iv12:
                break;
            case R.id.iv13:
                break;
            case R.id.iv14:
                break;
            case R.id.iv15:
                break;
            case R.id.iv16:
                break;

        }

    }
}

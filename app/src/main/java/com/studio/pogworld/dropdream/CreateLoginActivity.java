package com.studio.pogworld.dropdream;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Micheal on 12/16/2016.
 */

public class CreateLoginActivity extends AppCompatActivity implements View.OnClickListener {

    SharedPreferences someData;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16;
    Button btnCreate;
    GridLayout myShow;
    public static String myImgArray;

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
        btnCreate = (Button) findViewById(R.id.btnCreate);
        myShow = (GridLayout) findViewById(R.id.glShow);
    }
    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.create_pattern);
        GetImages();

        someData = getSharedPreferences(myImgArray, 0);
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

        btnCreate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCreate:
                if (!myImgArray.equals("")) {
                    btnCreate.setVisibility(view.INVISIBLE);
                    TextView somenote = (TextView) findViewById(R.id.somenote);
                    somenote.setVisibility(view.GONE);
                    TextView imageremind = (TextView) findViewById(R.id.imageremind);
                    imageremind.setVisibility(view.VISIBLE);
                    LinearLayout optionLay = (LinearLayout) findViewById(R.id.options);
                    optionLay.setVisibility(view.VISIBLE);

                }
                else Toast.makeText(this, "Please click some images before proceeding", Toast.LENGTH_SHORT).show();
            case R.id.iv1:
                myImgArray = myImgArray+"A";
                myShow.addView(img1);
                break;
            case R.id.iv2:
                myImgArray = myImgArray+"B";
                myShow.addView(img2);
                break;
            case R.id.iv3:
                myImgArray = myImgArray+"C";
                myShow.addView(img3);
                break;
            case R.id.iv4:
                myImgArray = myImgArray+"D";
                myShow.addView(img4);
                break;
            case R.id.iv5:
                myImgArray = myImgArray+"E";
                myShow.addView(img5);
                break;
            case R.id.iv6:
                myImgArray = myImgArray+"F";
                myShow.addView(img6);
                break;
            case R.id.iv7:
                myImgArray = myImgArray+"G";
                myShow.addView(img7);
                break;
            case R.id.iv8:
                myImgArray = myImgArray+"H";
                myShow.addView(img8);
                break;
            case R.id.iv9:
                myImgArray = myImgArray+"I";
                myShow.addView(img9);
                break;
            case R.id.iv10:
                myImgArray = myImgArray+"J";
                myShow.addView(img10);
                break;
            case R.id.iv11:
                myImgArray = myImgArray+"K";
                myShow.addView(img11);
                break;
            case R.id.iv12:
                myImgArray = myImgArray+"L";
                myShow.addView(img12);
                break;
            case R.id.iv13:
                myImgArray = myImgArray+"M";
                myShow.addView(img13);
                break;
            case R.id.iv14:
                myImgArray = myImgArray+"N";
                myShow.addView(img14);
                break;
            case R.id.iv15:
                myImgArray = myImgArray+"O";
                myShow.addView(img15);
                break;
            case R.id.iv16:
                myImgArray = myImgArray+"P";
                myShow.addView(img16);
                break;
        }
    }
}

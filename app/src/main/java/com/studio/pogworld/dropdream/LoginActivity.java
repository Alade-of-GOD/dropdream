package com.studio.pogworld.dropdream;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Micheal on 12/16/2016.
 */

public class LoginActivity extends AppCompatActivity {

    public static String filename = "MySharedString";
    public static String file = "MyShared";
    SharedPreferences someData, anotherData;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // gettign imag IDs.

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

        //listening to onclicklistener
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void ToastShow(ImageView i){
        Toast.makeText(this, "ImageView "+ i + " Clicked", Toast.LENGTH_LONG).show();
    }

}

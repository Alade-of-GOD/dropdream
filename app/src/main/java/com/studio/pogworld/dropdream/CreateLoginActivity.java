package com.studio.pogworld.dropdream;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Micheal on 12/16/2016.
 */

public class CreateLoginActivity extends AppCompatActivity {

    //SharedPreferences someData;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16;
    Button btnCreate;
    GridView myShow;
    public static String myImgArray = "";

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
        myShow = (GridView) findViewById(R.id.glShow);

    }
    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.create_pattern);
        GetImages();

        //someData = getSharedPreferences(myImgArray, 0);
        GetImages();
        //listening to onclicklistener
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImgArray = myImgArray+"A";
                myShow.addView(img1);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImgArray = myImgArray+"B";
                myShow.addView(img2);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImgArray = myImgArray+"B";
                myShow.addView(img3);
            }
        });

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (myImgArray.equals("")) {
                    btnCreate.setVisibility(view.GONE);
                    TextView somenote = (TextView) findViewById(R.id.somenote);
                    somenote.setVisibility(view.GONE);
                    TextView imageremind = (TextView) findViewById(R.id.imageremind);
                    imageremind.setVisibility(view.VISIBLE);
                    LinearLayout optionLay = (LinearLayout) findViewById(R.id.options);
                    optionLay.setVisibility(view.VISIBLE);

                }
                else Toast.makeText(CreateLoginActivity.this, "Please click some images before proceeding", Toast.LENGTH_SHORT).show();

            }
        });
    }

}

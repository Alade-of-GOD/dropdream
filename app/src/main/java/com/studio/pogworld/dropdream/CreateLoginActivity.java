package com.studio.pogworld.dropdream;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by Micheal on 12/16/2016.
 */

public class CreateLoginActivity extends AppCompatActivity implements View.OnClickListener {

    //SharedPreferences someData;
    Button btnCreate, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    ImageButton btnDel;
    EditText etPin;
    private void getButton(){
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnDel = (ImageButton) findViewById(R.id.btnDel);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        etPin = (EditText) findViewById(R.id.etPin);
    }
    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.create_pattern);
        getButton();
        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fireCustomDialog();
                //Toast.makeText(CreateLoginActivity.this, "this is your pin: "+etPin, Toast.LENGTH_LONG).show();
            }
        });

    }

    private void setPin (Button btn, EditText eT){
        eT.setText(eT.getText().toString()+btn.getText().toString());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn0:
                setPin(btn0, etPin);
                break;
            case R.id.btn1:
                setPin(btn2, etPin);
                break;
            case R.id.btn2:
                setPin(btn2, etPin);
                break;
            case R.id.btn3:
                setPin(btn3, etPin);
                break;
            case R.id.btn4:
                setPin(btn4, etPin);
                break;
            case R.id.btn5:
                setPin(btn5, etPin);
                break;
            case R.id.btn6:
                setPin(btn6, etPin);
                break;
            case R.id.btn7:
                setPin(btn7, etPin);
                break;
            case R.id.btn8:
                setPin(btn8, etPin);
                break;
            case R.id.btn9:
                setPin(btn9, etPin);
                break;
            case R.id.btnDel:
                etPin.setText("");
                break;
        }
    }

    private void fireCustomDialog() {
        new AlertDialog.Builder(CreateLoginActivity.this)
                .setTitle("your login pin is: "+etPin.getText().toString())
                .setPositiveButton("continue", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        CreateLoginActivity.this.finish();
                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                    }
                })
                .create();
        }

}

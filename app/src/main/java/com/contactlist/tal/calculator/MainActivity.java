package com.contactlist.tal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView outPutTv;
    Button number0,number1,number2,number3,number4,number5,number6,number7,number8,number9,
            btnPlus,btnMin,btnMult,btnDivide,btnEquals,btnClear;
    static boolean isPressedsPlus = false;
    static boolean isPressedsMinus = false;
    static boolean isPressedsMulti = false;
    static boolean isPressedsDivid = false;
      float x;
      float y;
      float z;
     String result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outPutTv = (TextView) findViewById(R.id.outPutTv);
        number0 = (Button) findViewById(R.id.number0btn);
        number1 = (Button) findViewById(R.id.number1btn);
        number2 = (Button) findViewById(R.id.number2btn);
        number3 = (Button) findViewById(R.id.number3btn);
        number4 = (Button) findViewById(R.id.number4btn);
        number5 = (Button) findViewById(R.id.number5btn);
        number6 = (Button) findViewById(R.id.number6btn);
        number7 = (Button) findViewById(R.id.number7btn);
        number8 = (Button) findViewById(R.id.number8btn);
        number9 = (Button) findViewById(R.id.number9btn);
        btnPlus = (Button) findViewById(R.id.plusbtn);
        btnMin = (Button) findViewById(R.id.minbtn);
        btnMult = (Button) findViewById(R.id.multbtn);
        btnDivide = (Button) findViewById(R.id.devidebtn);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        btnClear = (Button) findViewById(R.id.btnClear);


        number0.setOnClickListener(this);
        number1.setOnClickListener(this);
        number2.setOnClickListener(this);
        number3.setOnClickListener(this);
        number4.setOnClickListener(this);
        number5.setOnClickListener(this);
        number6.setOnClickListener(this);
        number7.setOnClickListener(this);
        number8.setOnClickListener(this);
        number9.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnClear.setOnClickListener(this);




    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.number0btn:
                outPutTv.append(number0.getText().toString());

                break;
            case R.id.number1btn:
                outPutTv.append(number1.getText().toString());


                break;
            case R.id.number2btn:
                outPutTv.append(number2.getText().toString());


                break;
            case R.id.number3btn:
                outPutTv.append(number3.getText().toString());


                break;
            case R.id.number4btn:
                outPutTv.append(number4.getText().toString());


                break;
            case R.id.number5btn:
                outPutTv.append(number5.getText().toString());

                break;
            case R.id.number6btn:
                outPutTv.append(number6.getText().toString());


                break;
            case R.id.number7btn:
                outPutTv.append(number7.getText().toString());


                break;
            case R.id.number8btn:
                outPutTv.append(number8.getText().toString());

                break;
            case R.id.number9btn:
                outPutTv.append(number9.getText().toString());

                break;


            case R.id.plusbtn:

                if (!outPutTv.getText().toString().equals("")) {

                    isPressedsPlus = true;

                    x = Float.parseFloat(outPutTv.getText().toString());
                    plus(x, 0);

                    if (result != null) {
                        float result2 = Float.parseFloat(result);
                        plus( result2, z);

                    }

                    btnDivide.setEnabled(false);
                    btnMult.setEnabled(false);
                    btnMin.setEnabled(false);


                    outPutTv.setText("");
                }else{
                    btnPlus.setActivated(false);
                }

                break;
            case R.id.minbtn:

                if (!outPutTv.getText().toString().equals("")) {
                    isPressedsMinus = true;

                    x = Float.parseFloat(outPutTv.getText().toString());
                    minus( x,0);

                    if (result != null){
                        float result2 = Float.parseFloat(result);
                        minus(result2, z);
                    }

                    btnDivide.setEnabled(false);
                    btnMult.setEnabled(false);
                    btnPlus.setEnabled(false);

                    outPutTv.setText("");
                }else{
                    outPutTv.setActivated(false);
                }


                break;
            case R.id.multbtn:
                if (!outPutTv.getText().toString().equals("")) {
                    isPressedsMulti = true;
                    x = Float.parseFloat(outPutTv.getText().toString());
                    multiple( x,0);

                    if(result != null){
                        float result2 = Float.parseFloat(result);
                        multiple( result2, z);
                    }

                    btnDivide.setEnabled(false);
                    btnPlus.setEnabled(false);
                    btnMin.setEnabled(false);

                    outPutTv.setText("");
                }else{
                    outPutTv.setActivated(false);
                }

                break;


            case R.id.devidebtn:
                if (!outPutTv.getText().toString().equals("")) {
                    isPressedsDivid = true;
                    x = Float.parseFloat(outPutTv.getText().toString());

                    if (result!= null){
                        float result2 = Float.parseFloat(result);
                        divide(result2, z);
                        v.setEnabled(true);
                    }
                    btnMin.setEnabled(false);
                    btnMult.setEnabled(false);
                    btnPlus.setEnabled(false);

                    outPutTv.setText("");
                }else{
                    outPutTv.setActivated(false);
                }

                break;


            case R.id.btnEquals:

                if (!outPutTv.getText().toString().equals("")) {
                    z = Float.parseFloat(outPutTv.getText().toString());


                    if (btnPlus.isEnabled()) {
                        plus(x, z);

                    }

                    if (btnMin.isEnabled()) {
                        minus(x, z);

                    }
                    if (btnMult.isEnabled()) {

                        multiple(x, z);


                    }
                    if (btnDivide.isEnabled()) {

                        divide(x, z);

                    }


                    result = String.valueOf(y);
                    outPutTv.setText(result);

                    if (outPutTv.getText().toString().equals("Infinity") || outPutTv.getText().toString().equals("NaN")) {
                        outPutTv.setText("Can't divide by 0");
                        number0.setEnabled(false);
                        number1.setEnabled(false);
                        number2.setEnabled(false);
                        number3.setEnabled(false);
                        number4.setEnabled(false);
                        number5.setEnabled(false);
                        number6.setEnabled(false);
                        number7.setEnabled(false);
                        number8.setEnabled(false);
                        number9.setEnabled(false);
                        btnPlus.setEnabled(false);
                        btnMin.setEnabled(false);
                        btnMult.setEnabled(false);
                        btnDivide.setEnabled(false);
                        btnEquals.setEnabled(false);
                    } else {
                        btnPlus.setEnabled(true);
                        btnMin.setEnabled(true);
                        btnMult.setEnabled(true);
                        btnDivide.setEnabled(true);
                        btnEquals.setEnabled(true);
                    }

                }else{
                    btnEquals.setActivated(false);
                }

                break;


            case R.id.btnClear:
                outPutTv.setText("");

                number0.setEnabled(true);
                number1.setEnabled(true);
                number2.setEnabled(true);
                number3.setEnabled(true);
                number4.setEnabled(true);
                number5.setEnabled(true);
                number6.setEnabled(true);
                number7.setEnabled(true);
                number8.setEnabled(true);
                number9.setEnabled(true);
                btnPlus.setEnabled(true);
                btnMin.setEnabled(true);
                btnMult.setEnabled(true);
                btnDivide.setEnabled(true);
                btnEquals.setEnabled(true);

                break;
        }
    }

    public void plus(float x, float z){

        y = x+z;
    }

    public void minus(float x, float z){

        y = x-z;
    }

    public void multiple(float x, float z){

        y = x*z;
    }

    public void divide(float x, float z) {

        y = x / z;




    }
}

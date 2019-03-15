package com.example.yagmurercan.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mButton0;
    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;
    Button mButton6;
    Button mButton7;
    Button mButton8;
    Button mButton9;
    Button mButtonDot;
    Button mButtonAdd;
    Button mButtonSub;
    Button mButtonMul;
    Button mButtonDiv;
    Button mButtonEqual;
    Button mButtonClear;

    TextView mTextViewResult;

    float value1;
    float value2;

    boolean mAddition;
    boolean mSubtraction;
    boolean mMultiplication;
    boolean mDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton0 = (Button) findViewById(R.id.button0);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);
        mButton7 = (Button) findViewById(R.id.button7);
        mButton8 = (Button) findViewById(R.id.button8);
        mButton9 = (Button) findViewById(R.id.button9);
        mButtonDot = (Button) findViewById(R.id.buttonDot);
        mButtonAdd = (Button) findViewById(R.id.buttonAdd);
        mButtonSub = (Button) findViewById(R.id.buttonSub);
        mButtonMul = (Button) findViewById(R.id.buttonMul);
        mButtonDiv = (Button) findViewById(R.id.buttonDiv);
        mButtonEqual = (Button) findViewById(R.id.buttonEqual);
        mButtonClear = (Button) findViewById(R.id.buttonClear);

        mTextViewResult = (TextView) findViewById(R.id.textViewResult);


        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + "0");
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + "1");
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + "2");
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + "3");
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mTextViewResult.setText(null);
                mTextViewResult.setText(mTextViewResult.getText() + "4");
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + "5");
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + "6");
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + "7");
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + "8");
            }
        });

        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + "9");
            }
        });

        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText(mTextViewResult.getText() + ".");
            }
        });

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTextViewResult == null){
                    mTextViewResult.setText("+");
                }
                else{
                    value1 = Float.parseFloat(mTextViewResult.getText() + "");
                    mAddition = true;
                    mTextViewResult.setText(null);
                }
            }
        });

        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(mTextViewResult.getText() + "");
                mSubtraction = true;
                mTextViewResult.setText("-");
            }
        });

        mButtonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(mTextViewResult.getText() + "");
                mMultiplication = true;
                mTextViewResult.setText("*");
            }
        });

        mButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(mTextViewResult.getText() + "");
                mDivision = true;
                mTextViewResult.setText("/");
            }
        });

        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(mTextViewResult.getText() + "");

                if(mAddition == true){
                    mTextViewResult.setText(value1 + value2 + "");
                    mAddition = false;
                }

                if(mSubtraction == true){
                    mTextViewResult.setText(value1 - value2 + "");
                    mSubtraction = false;
                }

                if(mMultiplication == true){
                    mTextViewResult.setText(value1 * value2 + "");
                    mMultiplication = false;
                }

                if(mDivision == true){
                    mTextViewResult.setText(value1 / value2 + "");
                    mDivision = false;
                }
            }
        });

        mButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewResult.setText("");
            }
        });

    }
}

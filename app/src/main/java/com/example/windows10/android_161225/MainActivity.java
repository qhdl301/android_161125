package com.example.windows10.android_161225;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    Switch sw1;
    RadioGroup rbg1;
    RadioButton rb1,rb2,rb3;
    Button bt1,bt2;
    ImageView iv1;
    LinearLayout l1;
    Image cat,dog,bunny;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbg1=(RadioGroup)findViewById(R.id.radioGroup1);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        sw1=(Switch)findViewById(R.id.switch1);
        bt1=(Button)findViewById(R.id.button);
        bt2=(Button)findViewById(R.id.button2);
        iv1=(ImageView)findViewById(R.id.imageView);
        l1=(LinearLayout)findViewById(R.id.linear);

        sw1.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b) {
                    l1.setVisibility(View.VISIBLE);
                }
                else{
                    l1.setVisibility(View.INVISIBLE);
                }
            }

        });
        rb1.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                iv1.setImageResource(R.drawable.bunny);

            }
        });
        rb2.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                iv1.setImageResource(R.drawable.cat);

            }
        });
        rb3.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                iv1.setImageResource(R.drawable.dog);
            }
        });

         bt1.setOnClickListener(new Button.OnClickListener() {
             @Override
             public void onClick(View view) {
                finish();
             }
         });

        bt2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                  sw1.setChecked(false);
                }

        });
    }
}


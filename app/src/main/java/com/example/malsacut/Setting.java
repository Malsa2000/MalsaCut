package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Setting extends AppCompatActivity implements View.OnClickListener {

    Button button1 , button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        button1 = findViewById(R.id.select_Activity);
        button2 = findViewById(R.id.location);



        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Setting.this , location.class);
//                startActivity(i);
//            }
//        });

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.select_Activity:
                Intent i = new Intent(Setting.this , Select_Langouge.class);
                startActivity(i);
                break;

            case R.id.location:
                Intent i1 = new Intent(Setting.this , location.class);
                startActivity(i1);
                break;

        }

    }
}

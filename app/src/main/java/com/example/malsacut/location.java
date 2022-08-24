package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class location extends AppCompatActivity {

    Button buttonturn , chancel;
    RelativeLayout relativeLayout;
    ImageView  imgelocation;
    TextView  titel , text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        buttonturn = findViewById(R.id.location_button);
        chancel = findViewById(R.id.chancel_butoon);
        relativeLayout = findViewById(R.id.relativelayout22);

        imgelocation = findViewById(R.id.imgelocation);
        titel = findViewById(R.id.titellocatin);
        text = findViewById(R.id.textlocation);



        buttonturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
//                Context context = location.this;
//                View layoutInflater = LayoutInflater.from(v.getContext()).inflate(R.layout.total_price,relativeLayout,false);
//                builder.setView(layoutInflater);
//                AlertDialog alertDialog = builder.create();
//                alertDialog.show();

               Context context = location.this;
                View dialogView = LayoutInflater.from(context).inflate(R.layout.sucsses_dailoge, relativeLayout, false);

                AlertDialog.Builder builder = new AlertDialog.Builder(context);

                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        });

        chancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = location.this;
                View dialogView = LayoutInflater.from(context).inflate(R.layout.reeor_dailoge, relativeLayout, false);

                AlertDialog.Builder builder = new AlertDialog.Builder(context);

                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });


    }
}

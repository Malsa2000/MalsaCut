package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class button_act extends AppCompatActivity implements View.OnClickListener{

    TextView shose, moblie , computer , food , electronic , office ,book , collection ,fation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_act);

        shose = findViewById(R.id.shose);
        moblie = findViewById(R.id.cellphone);
        computer = findViewById(R.id.computer);
        food = findViewById(R.id.foods);
        electronic = findViewById(R.id.electroin);
        office = findViewById(R.id.office);
        book = findViewById(R.id.books);
        collection = findViewById(R.id.collecton);
        fation = findViewById(R.id.fation);

        shose.setOnClickListener(this);
        moblie.setOnClickListener(this);
        computer.setOnClickListener(this);
        fation.setOnClickListener(this);
        food.setOnClickListener(this);
        electronic.setOnClickListener(this);
        office.setOnClickListener(this);
        book.setOnClickListener(this);
        collection.setOnClickListener(this);


        if(getIntent().hasExtra("shose")){

            moblie.setVisibility(View.GONE);
            computer.setVisibility(View.GONE);
            food.setVisibility(View.GONE);
            electronic.setVisibility(View.GONE);
            office.setVisibility(View.GONE);
            book.setVisibility(View.GONE);
            collection.setVisibility(View.GONE);
            fation.setVisibility(View.GONE);
        }
  else if(getIntent().hasExtra("foods")){
           shose.setVisibility(View.GONE);
            moblie.setVisibility(View.GONE);
            computer.setVisibility(View.GONE);
            electronic.setVisibility(View.GONE);
            office.setVisibility(View.GONE);
            book.setVisibility(View.GONE);
            collection.setVisibility(View.GONE);
            fation.setVisibility(View.GONE);
        }



    }
    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.shose:

                Intent i = new Intent(this , RecycellView.class);
                i.putExtra("shose",0);
                startActivity(i);
                break;

            case R.id.foods:
                Intent i1 = new Intent(this , RecycellView.class);
                i1.putExtra("foods",1);
                startActivity(i1);
                break;

            case R.id.collecton:
                Intent i2 = new Intent(this , RecycellView.class);
                i2.putExtra("collection",2);
                startActivity(i2);
                break;

            case R.id.computer:
                Intent i3 = new Intent(this , RecycellView.class);
                i3.putExtra("computer",3);
                startActivity(i3);
                break;

            case R.id.fation:
                Intent i4 = new Intent(this , RecycellView.class);
                i4.putExtra("fashion",4);
                startActivity(i4);
                break;

            case R.id.cellphone:
                Intent i5 = new Intent(this , RecycellView.class);
                i5.putExtra("cellphone",5);
                startActivity(i5);
                break;

            case R.id.books:
                Intent i6 = new Intent(this , RecycellView.class);
                i6.putExtra("books",6);
                startActivity(i6);
                break;

            case R.id.office:
                Intent i7 = new Intent(this, RecycellView.class);
                i7.putExtra("office",7);
                startActivity(i7);
                break;

            case R.id.electroin:
                Intent i8 = new Intent(this , RecycellView.class);
                i8.putExtra("electroin",8);
                startActivity(i8);
                break;

        }
    }
}

package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Select_Langouge extends AppCompatActivity {
    Button b;
    CheckBox cArabic, cEnglish , cChiness , cJapan ;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__langouge);

        cArabic = findViewById(R.id.arabic);
        cEnglish = findViewById(R.id.english);
        cChiness= findViewById(R.id.chines);
        cJapan = findViewById(R.id.japan);
        textView = findViewById(R.id.textlangugers);
        b = findViewById(R.id.done);

        Toast.makeText(getApplicationContext(),"Chose Languges !!!" , Toast.LENGTH_SHORT).show();

        if(cArabic.isChecked()){
            cArabic.setBackgroundColor(Color.BLUE);
        }

       else if(cEnglish.isChecked()){
            cEnglish.setBackgroundColor(Color.BLUE);
        }
      else   if(cChiness.isChecked()){
            cChiness.setBackgroundColor(Color.BLUE);
        }
     else if(cJapan.isChecked()){
            cJapan.setBackgroundColor(Color.BLUE);
        }

     b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             if(cArabic.isChecked()){
                 textView.setText("الرجاء اختيار لغتك ");
             }
             else if(cEnglish.isChecked()){
                 textView.setText("PLEASE CHOOSE YOUR LANGUAGE");
             }
             else   if(cChiness.isChecked()){
                 textView.setText("請選擇您的語言");
             }
             else if(cJapan.isChecked()){
                 textView.setText("कृपया अपनी भाषा चुनें");
             }
         }
     });
    }
}

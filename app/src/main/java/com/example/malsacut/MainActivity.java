package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.spl);
        setContentView(image);
        setContentView(R.layout.activity_main);
        Thread background = new Thread() {
            public void run() {

                try {
                    sleep(1 * 1000);

                    Intent i = new Intent(getBaseContext(), Main2Activity.class);
                    startActivity(i);

                    finish();

                } catch (Exception e) {
                }
            }
        };
        background.start();


    }
}

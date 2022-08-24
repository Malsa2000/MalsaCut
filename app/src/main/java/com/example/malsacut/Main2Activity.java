package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button login , singin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        login = findViewById(R.id.login);
        singin = findViewById(R.id.singup);

        login.setOnClickListener(this);
        singin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.login:
                Intent i = new Intent(this,Login_activity.class);
                startActivity(i);
                break;

            case  R.id.singup:
                Intent i1= new Intent(this,SingIn_Activity.class);
                startActivity(i1);
                break;
        }
    }
}

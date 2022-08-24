package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Login_activity extends AppCompatActivity implements View.OnClickListener {

    TextView login ,singin,logonw;
    Button gofacebook;
     EditText username , password;
     String name;
     int pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsh_);

        login =(TextView) findViewById(R.id.lodinText);
        singin = (TextView) findViewById(R.id.singupText);
        logonw =(TextView) findViewById(R.id.lodin_now_Text);
        gofacebook =(Button) findViewById(R.id.goto_facebook);
        username =(EditText) findViewById(R.id.username);
        password =(EditText) findViewById(R.id.password);

        name = username.getText().toString();

        try {
            pass = Integer.parseInt(password.getText().toString());
        } catch (NumberFormatException nfe) {
        }



        login.setOnClickListener(this);
        singin.setOnClickListener(this);
        logonw.setOnClickListener(this);
        gofacebook.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.lodinText:
                Toast.makeText(this,"this activity",Toast.LENGTH_SHORT).show();
                break;


            case R.id.singupText:
                Intent i = new Intent(this,SingIn_Activity.class);
                startActivity(i);
                break;


            case R.id.lodin_now_Text:
                Intent i1 = new Intent(Login_activity.this,tabedView.class);
                startActivity(i1);
//                if(name.equals("") && pass==2020){
//
//                }
//                else{
//                    Toast.makeText(this,"please inter corect password !",Toast.LENGTH_SHORT).show();
//                    Toast.makeText(this,"you dontn have account!",Toast.LENGTH_SHORT).show();
//
//                }

                break;
            case R.id.goto_facebook:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(i2);
                break;

        }
    }
}

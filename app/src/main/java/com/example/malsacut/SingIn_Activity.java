package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SingIn_Activity extends AppCompatActivity implements View.OnClickListener {

    TextView login, singin, logonw;
    Button gofacebook;
    EditText username, password, confrm;
    String name;
    int pass, passconfirm;
    Intent intent;
    TextView texterror;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsh_singin_);


        login = (TextView) findViewById(R.id.lodinText);
        texterror = (TextView) findViewById(R.id.texterror);
        singin = (TextView) findViewById(R.id.singupText);
        logonw = (TextView) findViewById(R.id.lodin_now_Text);
        gofacebook = (Button) findViewById(R.id.goto_facebook);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        confrm = (EditText) findViewById(R.id.passwordconf);


        name = username.getText().toString();

        try {
            pass = Integer.parseInt(password.getText().toString());
        } catch (NumberFormatException nfe) {
        }


        try {
            passconfirm = Integer.parseInt(confrm.getText().toString());
        } catch (NumberFormatException nfe) {
        }


        login.setOnClickListener(this);
        singin.setOnClickListener(this);
        logonw.setOnClickListener(this);
        gofacebook.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lodinText:
                Intent i = new Intent(this, Login_activity.class);
                startActivity(i);

                break;
            case R.id.singupText:
                Toast.makeText(this, "this activity", Toast.LENGTH_SHORT).show();
                break;


            case R.id.lodin_now_Text:
                if (pass == passconfirm) {

                    Toast.makeText(this, "save information", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(this, tabedView.class);
                    startActivity(i1);
                    overridePendingTransition(R.anim.left_in, R.anim.left_in);
                } else {
                    texterror.setVisibility(View.VISIBLE);
                    texterror.setText("please cheakeing the password");
                }


                break;
            case R.id.goto_facebook:

                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(i2);
                break;

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
       // overridePendingTransition(R.anim.right_in, R.anim.right_in);

    }
}

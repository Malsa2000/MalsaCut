package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class writeComment extends AppCompatActivity {

    EditText pername , des , per_price;
    Button button;
    String name , description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_comment);

        per_price = findViewById(R.id.price);
        pername = findViewById(R.id.personname);
        des = findViewById(R.id.description);
        button = findViewById(R.id.comm);

         String pri = per_price.getText().toString();
         name = pername.getText().toString();
         description = des.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), revirw_fragment.class);

                i.putExtra("name_person", name);
                i.putExtra("description", description);
                startActivity(i);
            }
        });



    }
}

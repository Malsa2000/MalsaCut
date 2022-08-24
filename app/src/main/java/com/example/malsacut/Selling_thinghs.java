package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Selling_thinghs extends AppCompatActivity {

    RecyclerView recyclerView_selling;
    ArrayList<buying> selling_product;
    Adapter1 adapter;

    Toolbar toolbar11;

    int postion1 =0;
    String name_product;
    String pricr;
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selling_thinghs);

        //toolbar11 = findViewById(R.id.toolbar_sellect);
       // setSupportActionBar(toolbar11);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("My Order");

        recyclerView_selling = findViewById(R.id.sellis_re);
        selling_product = new ArrayList<>();
        selling_product.add(new buying("android j4", "$2000", R.drawable.ph2));
        selling_product.add(new buying("android j5", "$2000", R.drawable.ph1));


        //Resived data from general fragment:

        if (getIntent().hasExtra("productname") && getIntent().hasExtra("price")
                && getIntent().hasExtra("img")) {

            name_product = getIntent().getStringExtra("productname");
            pricr = getIntent().getStringExtra("price");
            img = getIntent().getIntExtra("img", R.drawable.ph4);
        }

        // additem(postion1);

        adapter = new Adapter1(getApplicationContext(), selling_product);
        recyclerView_selling.setAdapter(adapter);
        recyclerView_selling.setHasFixedSize(true);
        Toast.makeText(getApplicationContext(), "Sucsses Add", Toast.LENGTH_LONG).show();
        RecyclerView.LayoutManager layoutManager = recyclerView_selling.getLayoutManager();
        recyclerView_selling.setLayoutManager(layoutManager);

    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.recycell, menu);
            return true;

        }


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {

            int id = item.getItemId();

            if (id == R.id.bagshpping) {

                Intent i = new Intent(this, Total.class);
                startActivity(i);


                return true;
            }
            return false;
        }

    public void additem(int postion) {
        selling_product.add(postion, new buying(name_product ,pricr ,img));
       // adapter.notifyItemInserted(postion);
//        adapter.notifyDataSetChanged();
    }
}

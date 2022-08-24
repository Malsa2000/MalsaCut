package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class lovelist extends AppCompatActivity {

    ListView listView;
   private SwipeRefreshLayout swipeRefreshLayout;
    String name;
    private  int refreshCount = 0;
    ArrayList<String> produc;


//Refresh.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lovelist);

        listView = findViewById(R.id.listlove);

        swipeRefreshLayout = findViewById(R.id.swipeRefresh);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                refresh();
            }
        });

         produc = new ArrayList<>();

        if(getIntent().hasExtra("name")) {
            name = getIntent().getStringExtra("name");



            produc.add(refreshCount++ +  "-"+ "Coffe" );
            produc.add(refreshCount++ +  "-"+ "Computer" );

        }
        ArrayAdapter<String> adep = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,produc);
        listView.setAdapter(adep);
        adep.notifyDataSetChanged();




    }

    private void refresh() {
        refreshCount++;
        produc.add(refreshCount++ +  "-"+ name );
        ArrayAdapter productAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,produc);
        listView.setAdapter(productAdapter);
        productAdapter.notifyDataSetChanged();
        swipeRefreshLayout.setRefreshing(false);

    }
}

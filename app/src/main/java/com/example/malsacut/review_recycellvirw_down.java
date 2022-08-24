package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Toolbar;

import java.util.ArrayList;

public class review_recycellvirw_down extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<product> product;
    review_down_Adapter review;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_recycellvirw_down);

        recyclerView = findViewById(R.id.recycell_view_shose);

        review = new review_down_Adapter(this, product);
        recyclerView.setAdapter(review);
        recyclerView.setHasFixedSize(true);


        product = new ArrayList<>();
        product.add(new product(R.drawable.sh1  , " Shose", "$25000", "652(.30%)"));
        product.add(new product(R.drawable.sh2    , "Running Shose", "$89600", "6666(.40%)"));
        product.add(new product(R.drawable.sh3    , "sport Shose", "$123000", "5666(.50%)"));
        product.add(new product(R.drawable.sh8  , " Shose", "$25000", "652(.30%)"));
        product.add(new product(R.drawable.sh5    , "Running Shose", "$89600", "6666(.40%)"));
        product.add(new product(R.drawable.sh6    , "sport Shose", "$123000", "5666(.50%)"));
        product.add(new product(R.drawable.sh3    , "sport Shose", "$123000", "5666(.50%)"));
        product.add(new product(R.drawable.sh5    , "Running Shose", "$89600", "6666(.40%)"));



        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);





    }
}

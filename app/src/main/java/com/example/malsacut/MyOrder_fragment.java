package com.example.malsacut;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyOrder_fragment extends Fragment {


    RecyclerView recyclerView;
    MyAdapter_order adapter;
    ArrayList<buying> buying;

    String name;
    String price;
    int img;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.activity_my_order, container, false);
  recyclerView = recyclerView.findViewById(R.id.recycellView_order);


        name = getActivity().getIntent().getStringExtra("");
        price = getActivity().getIntent().getStringExtra("");
        img = getActivity().getIntent().getIntExtra("",0);

        buying= new ArrayList<>();


        buying.add(new buying(name , price , img));

        adapter = new MyAdapter_order(getActivity().getApplicationContext(), buying);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));




        return v;
    }
    }


package com.example.malsacut;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter_order extends RecyclerView.Adapter<MyAdapter_order.MyViewHolder1> {

    ArrayList<buying> buyings;
    Context con;

    public MyAdapter_order(Context MyOrder_fragment, ArrayList<buying> bying) {
        con = MyOrder_fragment;
        bying = buyings;
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(con);
        View v = inflater.inflate(R.layout.activity_my_order, parent, false);
        return new MyViewHolder1(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder1 holder, final int position) {

//
//        final String name = p();
//        final String price = p.getPrice();
//        final String imge = p.getImg();
//
//        holder.text1.setText(name);
//        holder.text2.setText(price);
//
//        holder.imges1.setImageURI(Uri.parse(imge));





    }


    @Override
    public int getItemCount() {
        return buyings.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {
        TextView text1;
        TextView text2;
        ImageView imges1;
        RelativeLayout relativeLayout;

        public MyViewHolder1(View view) {
            super(view);
                text1 = view.findViewById(R.id.item_titel);
                text2 = view.findViewById(R.id.price);
              relativeLayout=view.findViewById(R.id.relative);
                imges1 = view.findViewById(R.id.imge1);

            }
        }
    }


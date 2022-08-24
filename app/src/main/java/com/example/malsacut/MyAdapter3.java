package com.example.malsacut;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder3> {

    ArrayList<qr> qr1;
    Context con;

    public MyAdapter3(FragmentActivity activity, ArrayList<com.example.malsacut.qr> qrs) {
        con = activity;
        this.qr1= qrs;
    }

    @NonNull
    @Override
    public MyViewHolder3  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(con);
        View v = inflater.inflate(R.layout.my_row_q_r, parent, false);
        return new MyAdapter3.MyViewHolder3(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder3 holder, int position) {
        qr p = qr1.get(position);
        final String name = p.getName();
        final String price = p.getDescreption();
        final int imge = p.getImg();

        holder.text1.setText(name);
        holder.text2.setText(price);
        holder.imges.setImageResource(imge);
    }

    @Override
    public int getItemCount() {
        return qr1.size();
    }

    public class MyViewHolder3 extends RecyclerView.ViewHolder{
        TextView text1;
        TextView text2;
        ImageView imges;
        RelativeLayout relativeLayout;

        public MyViewHolder3(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.item_titel);
            text2 = itemView.findViewById(R.id.des);
            imges = itemView.findViewById(R.id.pepole);
            relativeLayout = itemView.findViewById(R.id.relative_layout);


        }
    }
}

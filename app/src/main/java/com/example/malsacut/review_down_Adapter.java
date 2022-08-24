package com.example.malsacut;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class review_down_Adapter extends RecyclerView.Adapter<MyViewHolder11>{

     Context cont;
    ArrayList<product> revirw55;

    public review_down_Adapter(Context cont, ArrayList<product> product) {
        this.cont = cont;
        this.revirw55 = product;
    }

    @NonNull
    @Override
    public MyViewHolder11 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(cont);
        View view =  inflater.inflate(R.layout.product_myrow,parent,false);

        return new MyViewHolder11(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder11 holder, int position) {
        product itemData = revirw55.get(position);

        String name = itemData.getNameproduct();
        String price = itemData.getPrice();
        String ocasyo = itemData.getOcasyon();
        int img = itemData.getImg();

        holder.text.setText(name);
        holder.price.setText(price);
        holder.ocasyo.setText(ocasyo);

        holder.imageView.setImageResource(img);

    }


    @Override
    public int getItemCount() {
        return revirw55.size();
    }


}

class  MyViewHolder11 extends RecyclerView.ViewHolder{
    TextView text , price , ocasyo;
    ImageView imageView;
    LinearLayout l;

    public MyViewHolder11(@NonNull View itemView) {
        super(itemView);

        text = itemView.findViewById(R.id.name11);
        price = itemView.findViewById(R.id.price11);
        ocasyo = itemView.findViewById(R.id.ocasyo11);
        imageView = itemView.findViewById(R.id.imge);
        l = itemView.findViewById(R.id.liner);



    }
}
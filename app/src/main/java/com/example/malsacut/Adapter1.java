package com.example.malsacut;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class Adapter1 extends RecyclerView.Adapter<ViewHolder> {

    Context cont;
    ArrayList<buying> product2;

    public Adapter1(Context selling_thinghs, ArrayList<buying> selling_product1) {
        cont = selling_thinghs;
        product2 = selling_product1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(cont);
        View v = inflater.inflate(R.layout.my_row_order, parent);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {


        buying b = product2.get(position);

        String name = b.getNameproduct();
        int img = b.getImg();
        String prices = b.getPrice();

        holder.titel.setText(name);
        holder.price.setText(prices);
        holder.imageView1.setImageResource(img);




    }

    @Override
    public int getItemCount() {
        return product2.size();
    }

}

class ViewHolder extends RecyclerView.ViewHolder {

    TextView titel, price;
    ImageView imageView1;
    RelativeLayout relativeLayout;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        titel = itemView.findViewById(R.id.item_titel);
        price = itemView.findViewById(R.id.price);
        imageView1 = itemView.findViewById(R.id.imge1);
        relativeLayout = itemView.findViewById(R.id.relative);
    }
}
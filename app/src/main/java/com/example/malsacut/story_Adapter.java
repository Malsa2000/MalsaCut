package com.example.malsacut;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class story_Adapter extends RecyclerView.Adapter<MyViewHolder>{

     Context cont;
    ArrayList<product> Gproduct;

    public story_Adapter(Context cont, ArrayList<product> product) {
        this.cont = cont;
        this.Gproduct = product;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(cont);
        View view =  inflater.inflate(R.layout.product_myrow,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        product itemData = Gproduct.get(position);

        String name = itemData.getNameproduct();
        String price = itemData.getPrice();
        String ocasyo = itemData.getOcasyon();
        int img = itemData.getImg();

        holder.text.setText(name);
        holder.price.setText(price);
        holder.ocasyo.setText(ocasyo);

        holder.imageView.setImageResource(img);

        if(position==0){
        }
        else if(position == 1){

        }
        else if(position == 2){
        }
        else if(position == 3){
        }
        else if(position == 4){
        }
        else if(position == 5){
        }


    }

    @Override
    public int getItemCount() {
        return Gproduct.size();
    }


}
class  MyViewHolder extends RecyclerView.ViewHolder{
    TextView text , price , ocasyo;
    ImageView imageView;
    LinearLayout l;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        text = itemView.findViewById(R.id.name11);
        price = itemView.findViewById(R.id.price11);
        ocasyo = itemView.findViewById(R.id.ocasyo11);
        imageView = itemView.findViewById(R.id.imge);
        l = itemView.findViewById(R.id.liner);



    }
}
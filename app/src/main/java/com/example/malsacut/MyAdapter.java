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

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder1> {

    ArrayList<product> products;
    Context con;

    public MyAdapter(Context recycellView, ArrayList<product> product) {
        con = recycellView;
        products = product;
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(con);
        View v = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder1(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder1 holder, final int position) {

        product p = products.get(position);
        final String name = p.getNameproduct();
        final String price = p.getPrice();
        final String ocasyon = p.getOcasyon();
        final int imge = p.getImg();

        holder.text1.setText(name);
        holder.text2.setText(price);
        holder.text3.setText(ocasyon);
        holder.imges1.setImageResource(imge);


        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0) {

                    Intent i = new Intent(con, general_fragment.class);
                    i.putExtra("name",name);
                    i.putExtra("price",price);
                    i.putExtra("ocas",ocasyon);
                    i.putExtra("imge",imge);
                    con.startActivity(i);

                }

            }
        });


    }


    @Override
    public int getItemCount() {
        return products.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {
        TextView text1;
        TextView text2;
        TextView text3;
        ImageView imges1;
        RelativeLayout relativeLayout;

        public MyViewHolder1(View view) {
            super(view);
                text1 = view.findViewById(R.id.item_titel);
                text2 = view.findViewById(R.id.price);
                text3 = view.findViewById(R.id.ocasyo);
              relativeLayout=view.findViewById(R.id.relative);
                imges1 = view.findViewById(R.id.imge1);

            }
        }


}


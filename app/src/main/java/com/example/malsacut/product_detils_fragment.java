package com.example.malsacut;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class product_detils_fragment extends Fragment {

    TextView totalprice;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.product_det, container, false);

        totalprice = v.findViewById(R.id.totalprice);
        totalprice.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(getActivity(),"Total price",Toast.LENGTH_SHORT).show();
             Intent i = new Intent(getActivity(),Total.class);
             startActivity(i);

         }
     });


        return v;
    }

}


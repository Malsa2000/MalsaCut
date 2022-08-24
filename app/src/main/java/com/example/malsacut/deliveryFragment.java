package com.example.malsacut;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class deliveryFragment extends Fragment {

        ImageView imageView1 , imageView2 , imageView3 , imageView4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragmentdelivery_fragment, container, false);

        imageView1 = (ImageView) v.findViewById(R.id.img1_home);
        imageView2 = (ImageView) v.findViewById(R.id.img2_home);
        imageView3 = (ImageView) v.findViewById(R.id.img3_home);
        imageView4 = (ImageView) v.findViewById(R.id.img4_home);



        imageView1.setBackground(getActivity().getDrawable(R.drawable.shap_white));
        imageView2.setBackground(getActivity().getDrawable(R.drawable.shap_white));
        imageView3.setBackground(getActivity().getDrawable(R.drawable.shap));
        imageView4.setBackground(getActivity().getDrawable(R.drawable.shap_white));

        return v;
    }
    }


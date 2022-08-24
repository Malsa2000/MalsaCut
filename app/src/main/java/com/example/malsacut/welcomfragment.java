package com.example.malsacut;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class welcomfragment extends Fragment {

    Button home , searsh , help;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
          View v = inflater.inflate(R.layout.fragmenwelcom_fragment, container, false);

          home = (Button) v.findViewById(R.id.home);
        searsh =(Button) v.findViewById(R.id.searsh);
        help =(Button) v.findViewById(R.id.help);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Home.class);
                startActivity(i);
            }
        });

        searsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Searsh_activity.class);
                startActivity(i);
            }
        });


        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Home.class);
                startActivity(i);
            }
        });
        return v;
    }
    }


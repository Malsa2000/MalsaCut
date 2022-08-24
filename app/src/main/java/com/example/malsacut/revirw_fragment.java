package com.example.malsacut;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class revirw_fragment extends Fragment {

    RecyclerView recyclerView;
    myAdapter_comment myAdapter_comment;
    ArrayList<comment> comments;

    Button review ;
    int postion = 0;

    String name_person ,description;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.review_fragment, container, false);

        review = v.findViewById(R.id.wrireReview);

        recyclerView = v.findViewById(R.id.recycellView_Review_coment);


        if(getActivity().getIntent().hasExtra("name_person")
                && getActivity().getIntent().hasExtra("description")) {

            name_person = getActivity().getIntent().getStringExtra("name_person");
            description = getActivity().getIntent().getStringExtra("description");
        }

        myAdapter_comment = new myAdapter_comment(getActivity(),comments);
        comments = new ArrayList<>();

        comments.add(new comment("wow Shose!","Malsa O. Badwan" ,"No – one gets an iron – clad guarantee of success. Certainly, factors like opportunity, luck and timing are important. But the backbone of success is usually found in old – fashioned, basic concepts like hard work, determination, good planning and perseverance." ));
        comments.add(new comment("Good product, good cameras !","By Sunny Vo" ,"No – one gets an iron – clad guarantee of success. Certainly, factors like opportunity, luck and timing are important. But the backbone of success is usually found in old – fashioned, basic concepts like hard work, determination, good planning and perseverance." ));
        addcomment( postion);

        recyclerView.setAdapter(myAdapter_comment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),writeComment.class);
                startActivity(i);
            }
        });

        return v;
    }

    public void  addcomment(int postion ){
        comments.add( new comment("comment1",name_person ,description));
        myAdapter_comment.notifyItemInserted(postion);
    }
    }


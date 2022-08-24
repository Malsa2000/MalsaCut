package com.example.malsacut;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class QandR extends Fragment {
    RecyclerView recyclerView;
    MyAdapter3 myAdapter3;
    ArrayList<qr> qrs;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.qandr, container, false);

        recyclerView = v.findViewById(R.id.recycellView_Q_and_R);
        qrs = new ArrayList<>();

        qrs.add(new qr( R.drawable.person1 ,"Ollie Goldie" ,"Life isn’t about waiting for the storm to pass. It’s about learning to dance in the rain."));
        qrs.add(new qr( R.drawable.person2 ,"Scott Shepard" ,"Life isn’t about waiting for the storm to pass. It’s about learning to dance in the rain."));
        qrs.add(new qr( R.drawable.person1 ,"Russell Marlett" ,"Life isn’t about waiting for the storm to pass. It’s about learning to dance in the rain."));


        myAdapter3 = new MyAdapter3(getActivity(),qrs);
        recyclerView.setAdapter(myAdapter3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        new ItemTouchHelper(simpleCallback).attachToRecyclerView(recyclerView);

        return v;

    }
    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0 , ItemTouchHelper.LEFT |ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
           qrs.remove(viewHolder.getAdapterPosition());
           myAdapter3.notifyDataSetChanged();

        }
    };
}


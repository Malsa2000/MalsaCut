package com.example.malsacut;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter_comment  extends RecyclerView.Adapter<myAdapter_comment.MyViewh>{

    ArrayList<comment> comments1;
       Context context;


    public myAdapter_comment(FragmentActivity activity, ArrayList<comment> comments) {
         context = activity;
         comments1 = comments;
    }

    @NonNull
    @Override
    public MyViewh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.review_myrow, parent, false);
        return new MyViewh(v);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewh holder, int position) {
        comment p = comments1.get(position);
        final String titel = p.getTitel();
        final String personname1 = p.getName_person();
        final String comment_user = p.getDescreption();

        holder.title.setText(titel);
        holder.personnme.setText(personname1);
        holder.comment.setText(comment_user);


    }


    @Override
    public int getItemCount() {
        return 0;
        //return comments1.size();
    }

    public class MyViewh extends RecyclerView.ViewHolder {

        TextView title , data ,comment , personnme ;

        public MyViewh(View v) {
            super(v);

            title = v.findViewById(R.id.titel);
            data = v.findViewById(R.id.date);
            comment = v.findViewById(R.id.comment);
            personnme = v.findViewById(R.id.name_person);

        }
    }
}

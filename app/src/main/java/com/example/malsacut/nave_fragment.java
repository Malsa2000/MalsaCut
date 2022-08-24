package com.example.malsacut;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class nave_fragment extends Fragment implements View.OnClickListener{

    TextView shose, moblie , computer , food , electronic , office ,book , collection ,fation;
    ImageView imageView1 , imageView2 , imageView3 , imageView4;



    int[] imge = new int[]{R.drawable.img ,R.drawable.shose_home1 , R.drawable.shosehome2,R.drawable.shosehome3};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.nave_fragment, container, false);


        // to slide imge in home activity:

        ViewPager  viewPager = v.findViewById(R.id.viewpager_nav_fragment);
        Adapter_home adapter_home = new Adapter_home(getActivity() , imge );
       viewPager.setAdapter(adapter_home);


        //casting text in catorical

        shose = v.findViewById(R.id.shose);
        moblie = v.findViewById(R.id.cellphone);
        computer = v.findViewById(R.id.computer);
        food = v.findViewById(R.id.foods);
        electronic = v.findViewById(R.id.electroin);
        office = v.findViewById(R.id.office);
        book = v.findViewById(R.id.books);
        collection = v.findViewById(R.id.collecton);
        fation = v.findViewById(R.id.fation);

           shose.setOnClickListener(this);
        moblie.setOnClickListener(this);
        computer.setOnClickListener(this);
        fation.setOnClickListener(this);
        food.setOnClickListener(this);
        electronic.setOnClickListener(this);
        office.setOnClickListener(this);
        book.setOnClickListener(this);
        collection.setOnClickListener(this);

        if(getActivity().getIntent().hasExtra("shose")){

            moblie.setVisibility(View.GONE);
            computer.setVisibility(View.GONE);
            food.setVisibility(View.GONE);
            electronic.setVisibility(View.GONE);
            office.setVisibility(View.GONE);
            book.setVisibility(View.GONE);
            collection.setVisibility(View.GONE);
            fation.setVisibility(View.GONE);
        }
        else if(getActivity().getIntent().hasExtra("foods")){
            shose.setVisibility(View.GONE);
            moblie.setVisibility(View.GONE);
            computer.setVisibility(View.GONE);
            electronic.setVisibility(View.GONE);
            office.setVisibility(View.GONE);
            book.setVisibility(View.GONE);
            collection.setVisibility(View.GONE);
            fation.setVisibility(View.GONE);
        }


        return v;
    }




    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.shose:

                Intent i = new Intent(getActivity() , RecycellView.class);
                i.putExtra("shose",0);
                startActivity(i);
                break;

            case R.id.foods:
                Intent i1 = new Intent(getActivity() , RecycellView.class);
                i1.putExtra("foods",1);
                startActivity(i1);
                break;

                case R.id.collecton:
                    Intent i2 = new Intent(getActivity() , RecycellView.class);
                    i2.putExtra("collection",2);
                    startActivity(i2);
                break;

                case R.id.computer:
                    Intent i3 = new Intent(getActivity() , RecycellView.class);
                    i3.putExtra("computer",3);
                    startActivity(i3);
                break;

                case R.id.fation:
                    Intent i4 = new Intent(getActivity() , RecycellView.class);
                    i4.putExtra("fashion",4);
                    startActivity(i4);
                break;

                case R.id.cellphone:
                    Intent i5 = new Intent(getActivity() , RecycellView.class);
                    i5.putExtra("cellphone",5);
                    startActivity(i5);
                break;

                case R.id.books:
                    Intent i6 = new Intent(getActivity() , RecycellView.class);
                    i6.putExtra("books",6);
                    startActivity(i6);
                break;

                case R.id.office:
                    Intent i7 = new Intent(getActivity() , RecycellView.class);
                    i7.putExtra("office",7);
                    startActivity(i7);
                break;

                case R.id.electroin:
                    Intent i8 = new Intent(getActivity() , RecycellView.class);
                    i8.putExtra("electroin",8);
                    startActivity(i8);
                break;

        }
    }

    public void sliderm() {

 }
}


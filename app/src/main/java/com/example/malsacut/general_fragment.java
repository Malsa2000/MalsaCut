package com.example.malsacut;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.mikhaellopez.circularimageview.CircularImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class general_fragment extends Fragment {

    String name_p, pricr_p, ocsyo_p;
    int img;
    TextView name, price, ocasyo;
    ViewPager viewPager1 , viewPager2;
CircularImageView floatingActionButton;

    ImageView btn_share, but_hart;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.general_f, container, false);

        int [] imge = new int[]{R.drawable.img_g ,R.drawable.ipon1 , R.drawable.ipon2, R.drawable.iphon3};
        //int [] dots = new int[]{R.drawable.do1 ,R.drawable.do2 , R.drawable.do3, R.drawable.do4};

        //inflate content
        name = v.findViewById(R.id.name_product);
        price = v.findViewById(R.id.price_product);
        ocasyo = v.findViewById(R.id.ocasyo_product);
        viewPager1 = v.findViewById(R.id.viewpager_general);
        //viewPager2 = v.findViewById(R.id.view_sliderdots);
        but_hart = v.findViewById(R.id.icon_hatr);
        btn_share = v.findViewById(R.id.icon_share);
        floatingActionButton =(CircularImageView) v.findViewById(R.id.floting_button);



        Adapter_home adapter_home = new Adapter_home(getActivity() , imge);
        viewPager1.setAdapter(adapter_home);

//        Adapter_home dots_adapt = new Adapter_home(getActivity() , dots);
//        viewPager1.setAdapter(dots_adapt);


        // resived data from Resycell view:
        if (getActivity().getIntent().hasExtra("name") | getActivity().getIntent().hasExtra("price") |
                getActivity().getIntent().hasExtra("ocas") | getActivity().getIntent().hasExtra("imge")) {

            name_p = getActivity().getIntent().getStringExtra("name");
            ocsyo_p = getActivity().getIntent().getStringExtra("price");
            pricr_p = getActivity().getIntent().getStringExtra("ocas");

            img = Integer.parseInt(getActivity().getIntent().getStringExtra("imge"));

            name.setText(name_p);
            price.setText(pricr_p);
            ocasyo.setText(ocsyo_p);
        }




        //button share data :
        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_share.setBackground(getActivity().getDrawable(R.drawable.ic_share_black_24dp));

                sendEmail();
            }
        });

        //iconhart
        but_hart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "love product", Toast.LENGTH_SHORT).show();
                but_hart.setBackground(getActivity().getDrawable(R.drawable.ic_favorite_black_24dp));
                Intent i = new Intent(getActivity(), lovelist.class);
//                i.putExtra("productname", name_p);
//                i.putExtra("img", img);
                i.putExtra("name", "shose Male");
                i.putExtra("name", "shose Femail");
                startActivity(i);

            }
        });

        // to add product to bage selling:
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "add product sucsess", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), Selling_thinghs.class);

                i.putExtra("productname", "phone j5");
                i.putExtra("price", "$5000");
                i.putExtra("img", R.drawable.ph4);
                startActivity(i);

            }
        });

        return v;
    }

    public void data() {

    }

    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {""};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "....");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "share");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            Log.i("Finished sending email...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getActivity(), "There is no email client installed."
                    , Toast.LENGTH_SHORT).show();
        }
    }
}





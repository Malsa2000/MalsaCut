package com.example.malsacut;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter_home extends PagerAdapter {
    private  Context context;

    int[] imge ;

    ImageView i1 , i2 , i3 , i4;

    public Adapter_home(Context context, int[] imge) {
        this.context = context;
        this.imge = imge;
//        i1 = imageView1;
//        i2 = imageView2;
//        i3 = imageView3;
//        i4 = imageView4;
    }

    @Override
    public int getCount() {
        return imge.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view ==object ;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        Picasso.get().load(imge[position]).fit().centerCrop().
                into(imageView);
        if (imge[position]==0){
            i1.setBackground(context.getDrawable(R.drawable.shap));
            i2.setBackground(context.getDrawable(R.drawable.shap_gray));
            i3.setBackground(context.getDrawable(R.drawable.shap_gray));
            i4.setBackground(context.getDrawable(R.drawable.shap_gray));

        }
        else if(imge[position]==1){
            i1.setBackground(context.getDrawable(R.drawable.shap_gray));
            i2.setBackground(context.getDrawable(R.drawable.shap));
            i3.setBackground(context.getDrawable(R.drawable.shap_gray));
            i4.setBackground(context.getDrawable(R.drawable.shap_gray));
        }
        else if(imge[position]==2){
            i1.setBackground(context.getDrawable(R.drawable.shap_gray));
            i2.setBackground(context.getDrawable(R.drawable.shap_gray));
            i3.setBackground(context.getDrawable(R.drawable.shap));
            i4.setBackground(context.getDrawable(R.drawable.shap_gray));
        }
        else if(imge[position]==3){
            i1.setBackground(context.getDrawable(R.drawable.shap_gray));
            i2.setBackground(context.getDrawable(R.drawable.shap_gray));
            i3.setBackground(context.getDrawable(R.drawable.shap_gray));
            i4.setBackground(context.getDrawable(R.drawable.shap));
        }
        container.addView(imageView);
        return imageView ;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
  container.removeView((View) object);
    }
}

package com.example.mynewui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    public SliderAdapter(Context context){
        this.context=context;
    }

    public int[] images={
            R.drawable.game1sf,
            R.drawable.game2rb,
            R.drawable.game3ar,
            R.drawable.game4r
    };

    public String[] headings={
            "SCUDERIA FERRARI",
            "REDBULL RACING",
            "ALFA ROMEO",
            "RENAULT"
    };

    public String[] desc={
            "Lorem ipsum dolor sit amet, tale elit ipsum has an. Facete explicari mel an, simul impetus in duo. Per te persius mnesarchum. No modus habemus invidunt duo, ad autem simul periculis eos.",
            "Lorem ipsum dolor sit amet, tale elit ipsum has an. Facete explicari mel an, simul impetus in duo. Per te persius mnesarchum. No modus habemus invidunt duo, ad autem simul periculis eos.",
            "Lorem ipsum dolor sit amet, tale elit ipsum has an. Facete explicari mel an, simul impetus in duo. Per te persius mnesarchum. No modus habemus invidunt duo, ad autem simul periculis eos.",
            "Lorem ipsum dolor sit amet, tale elit ipsum has an. Facete explicari mel an, simul impetus in duo. Per te persius mnesarchum. No modus habemus invidunt duo, ad autem simul periculis eos."
    };
    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view== (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slider,container,false);

        ImageView slideimage=view.findViewById(R.id.imageView);
        TextView slideheading=view.findViewById(R.id.textView);
        TextView slidedesc=view.findViewById(R.id.textView2);

        slideimage.setImageResource(images[position]);
        slideheading.setText(headings[position]);
        slidedesc.setText(desc[position]);

        container.addView(view);

        return view;


    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}


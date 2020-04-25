package com.example.mynewui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ViewPager mvp;
    LinearLayout mll;
    SliderAdapter sliderAdapter;
    Button buy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mvp = findViewById(R.id.slideViewPager);
        mll = findViewById(R.id.dots);

        sliderAdapter = new SliderAdapter(this);
        mvp.setAdapter(sliderAdapter);

        buy=findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Pay.class);
                startActivity(i);
            }
        });

    }


}

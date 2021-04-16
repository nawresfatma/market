package com.example.market;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity156 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main156);

        ViewPager viewPager=findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(this );
        viewPager.setAdapter(adapter);
    }
}
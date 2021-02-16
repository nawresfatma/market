package com.example.market;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

public class sellProd extends AppCompatActivity {
    ImageView product ;
    RecyclerView recycler;
    private SnapHelper snapHelper;
    String s1[] , s2[];
    int images[]={R.drawable.rajell,R.drawable.rajelekher};
    ScaleCenterItemManager scaleCenterItemManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_prod);
        recycler = findViewById(R.id.recycler);
        product=findViewById(R.id.Product);

        s1 = getResources().getStringArray(R.array.shopName);
        s2 = getResources().getStringArray(R.array.description);

        myAdapter myAdapt = new myAdapter(this, s1, s2, images);
        recycler.setAdapter(myAdapt);
        snapHelper = new LinearSnapHelper();
        scaleCenterItemManager = new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL, false);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setLayoutManager(scaleCenterItemManager);
        snapHelper.attachToRecyclerView(recycler);



        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(sellProd.this, Produits.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
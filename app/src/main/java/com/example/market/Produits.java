package com.example.market;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;

public class Produits extends AppCompatActivity {
    RecyclerView recycler2;
    private SnapHelper snapHelper;
    String s1[] , s2[],s3[];
    int images[]={R.drawable.balgha,R.drawable.balghaokhra};
    ScaleCenterItemManager scaleCenterItemManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produits);



            recycler2=findViewById(R.id.recycler1);


            s1=getResources().getStringArray(R.array.products);
            s2=getResources().getStringArray(R.array.description2);
        s3=getResources().getStringArray(R.array.price);



        myAdapter myAdapt=new myAdapter(this,s1,s2,images);
            recycler2.setAdapter(myAdapt);
            snapHelper = new LinearSnapHelper();
            scaleCenterItemManager = new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL,false);
            recycler2.setLayoutManager(new LinearLayoutManager(this));
            recycler2.setLayoutManager(scaleCenterItemManager);
            snapHelper.attachToRecyclerView(recycler2);
    }
}
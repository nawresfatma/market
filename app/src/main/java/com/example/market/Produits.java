package com.example.market;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Produits extends AppCompatActivity {
    List<ProductClass> productList=new ArrayList<>();
    RecyclerView recycler2;
    private SnapHelper snapHelper;
    ScaleCenterItemManager scaleCenterItemManager;
 ProductClass prod=new ProductClass(R.drawable.balgha,"Balgha","comfortable to put on","25dt");
 ProductClass prod1=new ProductClass(R.drawable.balghaokhra,"balgha okhra","tooo comfortable to put on and walk ","30dt");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produits);

        productList.add(prod);
        productList.add(prod1);

            recycler2=findViewById(R.id.recycler1);
        MyAdapterprod myAdapt=new MyAdapterprod(productList,this);
            recycler2.setAdapter(myAdapt);
            snapHelper = new LinearSnapHelper();
            scaleCenterItemManager = new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL,false);
            recycler2.setLayoutManager(new LinearLayoutManager(this));
            recycler2.setLayoutManager(scaleCenterItemManager);
            snapHelper.attachToRecyclerView(recycler2);
    }
}
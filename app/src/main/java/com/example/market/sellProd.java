package com.example.market;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;
import android.widget.TextView;

import com.denzcoskun.imageslider.constants.ScaleTypes;

public class sellProd extends AppCompatActivity {
    RecyclerView recycler;
    private SnapHelper snapHelper;
    String s1[] , s2[];
    int images[]={R.drawable.rajell,R.drawable.rajelekher};
    ScaleCenterItemManager scaleCenterItemManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_prod);
        recycler=findViewById(R.id.recycler);


        s1=getResources().getStringArray(R.array.shopName);
        s2=getResources().getStringArray(R.array.description);

        myAdapter myAdapt=new myAdapter(this,s1,s2,images);
        recycler.setAdapter(myAdapt);
        snapHelper = new LinearSnapHelper();
        scaleCenterItemManager = new ScaleCenterItemManager(this,LinearLayoutManager.HORIZONTAL,false);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setLayoutManager(scaleCenterItemManager);
        snapHelper.attachToRecyclerView(recycler);
    }
}

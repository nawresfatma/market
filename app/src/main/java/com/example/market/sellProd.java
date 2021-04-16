package com.example.market;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class sellProd extends AppCompatActivity {
    ImageView product ;
    RecyclerView recycler;
    private SnapHelper snapHelper;
    //firebase
    private FirebaseDatabase db =FirebaseDatabase.getInstance();
    private DatabaseReference mreff = db.getReference().child("shops");

   List<StoreItem> StoreItems =new ArrayList<>();
    ScaleCenterItemManager scaleCenterItemManager;
   //StoreItem s=new StoreItem(R.drawable.rajel,"maison belgassem","best host in the medina , a coffee u would like to try in ur life");
   //StoreItem s1=new StoreItem(R.drawable.rajelekher,"hanout el Bey","best jebba in town and a handmade one");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_prod);
        recycler = findViewById(R.id.recycler);
        product=findViewById(R.id.Product);


        myAdapter myAdapt = new myAdapter(StoreItems,this);
        recycler.setAdapter(myAdapt);
        snapHelper = new LinearSnapHelper();
        scaleCenterItemManager = new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL, false);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setLayoutManager(scaleCenterItemManager);
        snapHelper.attachToRecyclerView(recycler);

        mreff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot:snapshot.getChildren()){
                    StoreItem storeItem=dataSnapshot.getValue(StoreItem.class);
                    StoreItems.add(storeItem);
                }
                myAdapt.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(sellProd.this, Produits.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
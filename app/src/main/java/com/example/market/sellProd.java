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
    RecyclerView recycler1;
     SnapHelper snapHelper , snapHelperM;

     myAdapter myAdapt;
     MoresellerAdapter MSadapt;
    //firebase

    DatabaseReference mreff ;
   List<MoresellersList> MoresellersLists;
   List<StoreItem> StoreItems;
    ScaleCenterItemManager scaleCenterItemManager , scaleCenterItemManagerM;
   //StoreItem s=new StoreItem(R.drawable.rajel,"maison belgassem","best host in the medina , a coffee u would like to try in ur life");
   //StoreItem s1=new StoreItem(R.drawable.rajelekher,"hanout el Bey","best jebba in town and a handmade one");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_prod);
        recycler1=findViewById(R.id.recyclerMS);
        recycler = findViewById(R.id.recycler);
        product=findViewById(R.id.Product);
        StoreItems=new ArrayList<>();
        MoresellersLists=new ArrayList<>();



        snapHelper = new LinearSnapHelper();
        scaleCenterItemManager = new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL, false);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setLayoutManager(scaleCenterItemManager);
        snapHelperM = new LinearSnapHelper();
        scaleCenterItemManagerM = new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL, false);
        recycler1.setLayoutManager(new LinearLayoutManager(this));
        recycler1.setLayoutManager(scaleCenterItemManagerM);
        snapHelper.attachToRecyclerView(recycler);
        snapHelperM.attachToRecyclerView(recycler1);
//Firebase(Stores)
        mreff= FirebaseDatabase.getInstance().getReference("shops");
        mreff.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds:dataSnapshot.getChildren()){
                    StoreItem data=ds.getValue(StoreItem.class);
                    StoreItems.add(data);

                }
             myAdapt = new myAdapter(StoreItems,sellProd.this);
                recycler.setAdapter(myAdapt);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        //Firebase(Moresellers)
        mreff= FirebaseDatabase.getInstance().getReference("MoreSellers");
        mreff.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds:dataSnapshot.getChildren()){
                    MoresellersList data=ds.getValue(MoresellersList.class);
                    MoresellersLists.add(data);

                }
                MSadapt=new MoresellerAdapter(MoresellersLists,sellProd.this);
                recycler1.setAdapter(MSadapt);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            } });



      /*  mreff.addValueEventListener(new ValueEventListener() {
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
        }); */


        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(sellProd.this, Produits.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
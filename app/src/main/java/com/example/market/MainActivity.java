package com.example.market;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.market.fragments.Home_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    RecyclerView recyclerView;

    ArrayList<Card> Mylist= new ArrayList<>();
    CardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //BottomBar

        BottomNavigationView bottomnav=findViewById(R.id.bottomnav);
        bottomnav.setOnNavigationItemSelectedListener(this);
        loadFragment(new Home_Fragment());


        recyclerView=findViewById(R.id.recyclerView);
        Mylist.add(new Card("title 1","soukberk"));
        Mylist.add(new Card("title 2","soukb"));
        Mylist.add(new Card("title 3","soukch"));
        adapter =new CardAdapter(Mylist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

  private boolean loadFragment(Fragment fragment){
        if(fragment!=null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
         }
       return false;
     }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment=null;
        switch(item.getItemId()){
            case R.id.home:
                fragment=new Home_Fragment();
        break;

        }
        return loadFragment(fragment);
    }
}
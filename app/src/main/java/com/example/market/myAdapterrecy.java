package com.example.market;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class myAdapterrecy extends RecyclerView.Adapter<myAdapterrecy.MyViewHolder> {
    List<ProductClass> productList;
    Context context;

    public myAdapterrecy(List<ProductClass> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public myAdapterrecy.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_products_recycler,parent,false);
        return new myAdapterrecy.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapterrecy.MyViewHolder holder, int position) {
        ProductClass product=productList.get(position);
        holder.myText6.setText(product.getProdName());
        holder.myText7.setText(product.getProdDescription());
        holder.myText8.setText(product.getProdPrice());
        Picasso.get().load(productList.get(position).getProd()).into(holder.myImage1);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myText6,myText7,myText8;
        ImageView myImage1;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myText6=itemView.findViewById(R.id.productname2);
            myText7=itemView.findViewById(R.id.description3);
            myText8=itemView.findViewById(R.id.price2);
            myImage1=itemView.findViewById(R.id.prod);

        }
    }
}

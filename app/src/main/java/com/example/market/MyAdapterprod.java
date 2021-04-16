package com.example.market;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

class MyAdapterprod extends RecyclerView.Adapter<MyAdapterprod.MyViewHolder> {
    List<ProductClass> productList;
    Context context;

    public MyAdapterprod(List<ProductClass> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapterprod.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_item_product,parent,false);
        return new MyAdapterprod.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterprod.MyViewHolder holder, int position) {
     ProductClass productClass=productList.get(position);
        holder.myText3.setText(productClass.getProdName());
        holder.myText4.setText(productClass.getProdDescription());
        holder.myText5.setText(productClass.getProdPrice());
        holder.myText6.setText(productClass.getProdRemise());
        Picasso.get().load(productList.get(position).getProd()).into(holder.myImage);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myText3,myText4,myText5,myText6;
        ImageView myImage;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myText3=itemView.findViewById(R.id.productname1);
            myText4=itemView.findViewById(R.id.description2);
            myText5=itemView.findViewById(R.id.price);
            myText6=itemView.findViewById(R.id.off);
            myImage=itemView.findViewById(R.id.balgha);

        }
    }
}
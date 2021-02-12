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

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {
    String data1[],data2[];
    int images[];
    Context context;
    public myAdapter(Context ct , String s1[],String s2[],int img[]){
        context=ct;
        data1=s1;
        data2=s2;
        images=img;
    }
    @NonNull
    @Override
    public myAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_item_seller,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.MyViewHolder holder, int position) {
        holder.myText.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myText,myText2;
        ImageView myImage;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myText=itemView.findViewById(R.id.shopname);
            myText2=itemView.findViewById(R.id.description);
            myImage=itemView.findViewById(R.id.imageView7);

        }
    }
}

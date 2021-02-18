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

public class myAdapterrecy extends RecyclerView.Adapter<myAdapterrecy.MyViewHolder> {
    String data6[], data7[],data8[];
    int images2[];
    Context context;
    public myAdapterrecy(Context ct, String s3[], String s4[], String s5[], int img1[]) {
        context = ct;
        data6 = s3;
        data7 = s4;
        data8 = s5;
        images2 = img1;
    }
    @NonNull
    @Override
    public myAdapterrecy.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_item_seller,parent,false);
        return new myAdapterrecy.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapterrecy.MyViewHolder holder, int position) {
        holder.myText6.setText(data6[position]);
        holder.myText7.setText(data7[position]);
        holder.myText8.setText(data8[position]);
        holder.myImage1.setImageResource(images2[position]);
    }

    @Override
    public int getItemCount() {
        return data8.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myText6,myText7,myText8;
        ImageView myImage1;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myText6=itemView.findViewById(R.id.productname2);
            myText7=itemView.findViewById(R.id.description3);
            myText8=itemView.findViewById(R.id.price2);

            myImage1=itemView.findViewById(R.id.prod);

        }
    }
}

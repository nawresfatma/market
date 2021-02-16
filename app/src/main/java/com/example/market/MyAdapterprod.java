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

class MyAdapterprod extends RecyclerView.Adapter<MyAdapterprod.MyViewHolder> {
    String data3[], data4[],data5[];
    int images1[];
    Context context;

    public MyAdapterprod(Context ct, String s3[], String s4[], String s5[],int img1[]) {
        context = ct;
        data3 = s3;
        data4 = s4;
        data5 = s5;
        images1 = img1;
    }

    @NonNull
    @Override
    public MyAdapterprod.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_item_seller,parent,false);
        return new MyAdapterprod.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterprod.MyViewHolder holder, int position) {
        holder.myText3.setText(data3[position]);
        holder.myText4.setText(data4[position]);
        holder.myText5.setText(data5[position]);
        holder.myImage.setImageResource(images1[position]);
    }

    @Override
    public int getItemCount() {
        return data3.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myText3,myText4,myText5;
        ImageView myImage;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myText3=itemView.findViewById(R.id.productname);
            myText4=itemView.findViewById(R.id.description2);
            myText5=itemView.findViewById(R.id.price);

            myImage=itemView.findViewById(R.id.balgha);

        }
    }
}
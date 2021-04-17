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

import java.util.ArrayList;
import java.util.List;

public class MoresellerAdapter extends RecyclerView.Adapter<MoresellerAdapter.MyViewHolder>{
    List<MoresellersList> MoresellersLists=new ArrayList<>();
    Context context;

    public MoresellerAdapter(List<MoresellersList> moresellersLists, Context Co) {
        MoresellersLists = moresellersLists;
        context = Co;
    }

    @NonNull
    @Override
    public MoresellerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.moresellers,parent,false);
        return new MoresellerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoresellerAdapter.MyViewHolder holder, int position) {
        MoresellersList MoresellerList=MoresellersLists.get(position);
        holder.myText.setText(MoresellerList.getMoreSellname());
        holder.myText2.setText(MoresellerList.getMoreselllocation());
        holder.myText3.setText(MoresellerList.getMoresellerdesc());
        // holder.myImage.setImageResource(StoreItem.getStoreImage());
      //  Picasso.get().load(StoreItems.get(position).getStoreImage()).into(holder.myImage);
        Picasso.get().load(MoresellersLists.get(position).getMoresellerImg()).into(holder.myImage);

    }

    @Override
    public int getItemCount() {
        return MoresellersLists.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myText,myText2,myText3;
        ImageView myImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText=itemView.findViewById(R.id.moresellername);
            myText2=itemView.findViewById(R.id.mslocation);
            myText3=itemView.findViewById(R.id.msdescription);
            myImage=itemView.findViewById(R.id.sellerImg);
        }
    }
}

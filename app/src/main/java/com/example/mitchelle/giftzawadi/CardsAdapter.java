package com.example.mitchelle.giftzawadi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elsis on 10/17/16.
 */
public class CardsAdapter extends RecyclerView.Adapter<FinalHolder> {
    Context context;
    ArrayList<FinalData> finalDatas;

    public CardsAdapter(ArrayList<FinalData> finalDatas, Context context) {
        this.finalDatas = finalDatas;
        this.context = context;
    }

    @Override
    public FinalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout,parent,false);
        FinalHolder holder=new FinalHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(FinalHolder holder, int position) {
        holder.itemdescription.setText(finalDatas.get(position).getDescription());
        holder.itemPrice.setText(finalDatas.get(position).getPrice());
        holder.itemName.setText(finalDatas.get(position).getName());
        PicassoClient.downloadImage(context,finalDatas.get(position).getImage(),holder.itemImage);

    }

    @Override
    public int getItemCount() {
        return finalDatas.size();
    }
}

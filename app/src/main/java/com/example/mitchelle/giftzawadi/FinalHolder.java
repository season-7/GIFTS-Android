package com.example.mitchelle.giftzawadi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mitchelle on 10/11/16.
 */
public class FinalHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView itemName,itemdescription,itemPrice;
    public ImageView itemImage;

    public FinalHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        itemImage=(ImageView) itemView.findViewById(R.id.contentImage);
        itemName=(TextView) itemView.findViewById(R.id.contentother);
        itemdescription=(TextView) itemView.findViewById(R.id.content);
        itemPrice=(TextView)itemView.findViewById(R.id.contenprice);


    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"You Clicked Item at: " + getAdapterPosition(),Toast.LENGTH_SHORT).show();

    }
}

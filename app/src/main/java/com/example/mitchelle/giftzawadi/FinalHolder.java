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

    public TextView titledescription,description;
    public ImageView titleimage;

    public FinalHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        titledescription=(TextView) itemView.findViewById(R.id.titleofchoice);
        description=(TextView) itemView.findViewById(R.id.describetitle);
        titleimage=(ImageView) itemView.findViewById(R.id.imagechoice);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"You Clicked Item at: " + getAdapterPosition(),Toast.LENGTH_SHORT).show();

    }
}

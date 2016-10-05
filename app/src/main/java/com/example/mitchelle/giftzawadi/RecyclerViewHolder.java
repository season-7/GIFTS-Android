package com.example.mitchelle.giftzawadi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mitchelle on 10/5/16.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView manPreference;
    public ImageView background;



    public RecyclerViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        manPreference=(TextView) itemView.findViewById(R.id.textdescriptioncat);
        background=(ImageView) itemView.findViewById(R.id.photodescriptioncat);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Description = " + getPosition(), Toast.LENGTH_SHORT).show();


    }
}

package com.example.mitchelle.giftzawadi.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mitchelle.giftzawadi.R;

/**
 * Created by mitchelle on 10/11/16.
 */
public class FinalHolder extends RecyclerView.ViewHolder {

    public TextView itemName,itemdescription,itemPrice;
    public ImageView itemImage;
    public ImageView likeImageView;
    public ImageView shareImageView;

    public FinalHolder(View itemView) {
        super(itemView);
       /* itemView.setOnClickListener(this);*/
        itemImage=(ImageView) itemView.findViewById(R.id.contentImage);
        itemName=(TextView) itemView.findViewById(R.id.contentother);
        itemdescription=(TextView) itemView.findViewById(R.id.content);
        itemPrice=(TextView)itemView.findViewById(R.id.contenprice);
        likeImageView = (ImageView) itemView.findViewById(R.id.likeImageView);
        shareImageView = (ImageView) itemView.findViewById(R.id.shareImageView);

        likeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int id = (int)likeImageView.getTag();
                if( id == R.drawable.ic_like){

                    likeImageView.setTag(R.drawable.ic_liked);
                    likeImageView.setImageResource(R.drawable.ic_liked);

                    Toast.makeText(v.getContext(),itemdescription.getText()+" added to favourites",Toast.LENGTH_SHORT).show();

                }else{

                    likeImageView.setTag(R.drawable.ic_like);
                    likeImageView.setImageResource(R.drawable.ic_like);
                    Toast.makeText(v.getContext(),itemdescription.getText()+" removed from favourites",Toast.LENGTH_SHORT).show();


                }

            }
        });


    }

    /*@Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"You Clicked Item at: " + getAdapterPosition(),Toast.LENGTH_SHORT).show();

    }*/
}

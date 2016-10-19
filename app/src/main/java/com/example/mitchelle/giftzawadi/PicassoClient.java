package com.example.mitchelle.giftzawadi;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by mitchelle on 10/17/16.
 */
public class PicassoClient {



    public static void downloadImage(Context context, String url, ImageView imageView)
    {
        if (url!=null&& url.length()>0){
            Picasso.with(context).load(url).placeholder(R.drawable.eventsperson).into(imageView);
        }

        else {

            Picasso.with(context).load(R.drawable.fashion).into(imageView);
        }
    }}

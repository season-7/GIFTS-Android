package com.example.mitchelle.giftzawadi.Fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mitchelle.giftzawadi.R;


public class FirsDescriptionsFragment extends Fragment implements AdapterView.OnItemClickListener {
    private int[] mImageResIds;
    private String[] mNames;
    private String[] mDescriptions;
    private String[] mUrls;

    private OnDescriptionSeclected mListener;

    public static FirsDescriptionsFragment newInstance() {
        return new FirsDescriptionsFragment();
    }

    public FirsDescriptionsFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof OnDescriptionSeclected) {
            mListener = (OnDescriptionSeclected) context;
        } else {
            throw new ClassCastException(context.toString() + " must implement OnDescriptionSeclected");
        }

        // Get rage face names and descriptions.
        final Resources resources = context.getResources();
        mNames = resources.getStringArray(R.array.names);
        mDescriptions = resources.getStringArray(R.array.descriptions);
        mUrls = resources.getStringArray(R.array.urls);

        // Get rage face images.
        final TypedArray typedArray = resources.obtainTypedArray(R.array.images);
        final int imageCount = mNames.length;
        mImageResIds = new int[imageCount];
        for (int i = 0; i < imageCount; i++) {
            mImageResIds[i] = typedArray.getResourceId(i, 0);
        }
        typedArray.recycle();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_firs_descriptions, container, false);

        final Activity activity = getActivity();
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(activity, 2));
        recyclerView.setAdapter(new DescriptionAdapter(activity));
        return view;
    }



    class DescriptionAdapter extends RecyclerView.Adapter<ViewHolder> {

        private LayoutInflater mLayoutInflater;

        public DescriptionAdapter(Context context) {
            mLayoutInflater = LayoutInflater.from(context);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            return new ViewHolder(mLayoutInflater
                    .inflate(R.layout.card_item, viewGroup, false));
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, final int position) {
            final int imageResId = mImageResIds[position];
            final String name = mNames[position];
            final String description = mDescriptions[position];
            final String url = mUrls[position];
            viewHolder.setData(imageResId, name);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onDescriptionSeclected(imageResId, name, description, url);

                }
            });
        }

        @Override
        public int getItemCount() {
            return mNames.length;
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        // Views
        private ImageView mImageView;
        private TextView mNameTextView;

        private ViewHolder(View itemView) {
            super(itemView);

            // Get references to image and name.
            mImageView = (ImageView) itemView.findViewById(R.id.photodescriptioncat);
            mNameTextView = (TextView) itemView.findViewById(R.id.textdescriptioncat);
        }

        private void setData(int imageResId, String name) {
            mImageView.setImageResource(imageResId);
            mNameTextView.setText(name);
        }
    }

    public interface OnDescriptionSeclected {
        void onDescriptionSeclected(int imageResId, String name, String description, String url);
    }

          public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) { //check third argument it automatically get the selected item POSITION
              // TODO Auto-generated method stub
              Toast.makeText(v.getContext(),"You Clicked Item at: " + getId(),Toast.LENGTH_SHORT).show();
              Intent i;
              switch (position)
              {
                /*  case 0: // first one of the list
                      i = new Intent(this, anActivity.class);
                      startActivity(i);
                      break;
                  case 1: // second one of the list.
                      i = new Intent(this, anActivity2.class);
                      startActivity(i);
                      break;
                  // and so on...
              }*/

          }

}}
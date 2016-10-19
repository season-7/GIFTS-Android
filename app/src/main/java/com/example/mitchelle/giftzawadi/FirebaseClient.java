package com.example.mitchelle.giftzawadi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;

/**
 * Created by mitchelle on 10/17/16.
 */
public class FirebaseClient {
    Context context;
    String DataBaseUrl;
    RecyclerView recyclerView;
    CardsAdapter cardsAdapter;

    ArrayList<FinalData> finalDataArrayList=new ArrayList<>();

   Firebase firebase;

    public FirebaseClient(Context context, String dataBaseUrl, RecyclerView recyclerView) {
        this.context = context;
        DataBaseUrl = dataBaseUrl;
        this.recyclerView = recyclerView;
        //initialize

        firebase.setAndroidContext(context);


        //instantiate
        firebase=new Firebase(DataBaseUrl);


    }

    public void retrieveData(){
        firebase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(com.firebase.client.DataSnapshot dataSnapshot, String s) {
                getUpdates(dataSnapshot);
            }

            @Override
            public void onChildChanged(com.firebase.client.DataSnapshot dataSnapshot, String s) {
                getUpdates(dataSnapshot);

            }

            @Override
            public void onChildRemoved(com.firebase.client.DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(com.firebase.client.DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                Log.i("The read has failed", firebaseError.getMessage());

            }
        });



    }




    public void getUpdates(com.firebase.client.DataSnapshot dataSnapshot){
        finalDataArrayList.clear();

        for (com.firebase.client.DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){



            FinalData data=new FinalData();

            data.setImage(dataSnapshot1.getValue(FinalData.class).getImage());
            data.setName(dataSnapshot1.getValue(FinalData.class).getName());
            data.setDescription(dataSnapshot1.getValue(FinalData.class).getDescription());

            data.setPrice(dataSnapshot1.getValue(FinalData.class).getPrice());
            finalDataArrayList.add(data);
        }

        if(finalDataArrayList.size()>0){
            cardsAdapter=new CardsAdapter(finalDataArrayList,context);
            recyclerView.setAdapter(cardsAdapter);
        }
        else {
            Toast.makeText(context,"Nothing to show",Toast.LENGTH_SHORT).show();
        }

    }

    public void saveOnline(String name, String url, String itemdescription, String price) {
        FinalData fdata=new FinalData();
        fdata.setImage(url);
        fdata.setName(name);
        fdata.setDescription(itemdescription);
        fdata.setPrice(price);
        firebase.child("sweets").push().setValue(fdata);
    }
}

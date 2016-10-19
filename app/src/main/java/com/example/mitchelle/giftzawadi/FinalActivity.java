package com.example.mitchelle.giftzawadi;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DialogTitle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.wenchao.cardstack.CardStack;

public class FinalActivity extends AppCompatActivity {
    final static String DataBaseUrl="https://giftzawadi-e0345.firebaseio.com/";
   private TextInputEditText imgurl;
   private TextInputEditText price;
   private TextInputEditText description;
   private TextInputEditText giftname;
   private Button giftsubmit;
    RecyclerView recyclerView;

    FirebaseClient firebaseClient;


    CardsAdapter mCardAdapter;
    CardStack mCardStack;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
   /* private GoogleApiClient client;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
       /* mCardStack = (CardStack) findViewById(R.id.container);
//        mCardStack.setContentResource(R.drawable.chain3);

        mCardStack.setContentResource(R.layout.cardlayout);

        mCardStack.setStackMargin(20);*/



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
       /* client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();*/

        recyclerView=(RecyclerView)findViewById(R.id.cardstackrecyclerview);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       /* Firebase.setAndroidContext(this);
        Firebase firebase=new Firebase(DataBaseUrl);*/

        firebaseClient=new FirebaseClient(this,DataBaseUrl,recyclerView);
        firebaseClient.retrieveData();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                displayDialog();
            }
        });
    }

    //show dialog
    private void displayDialog(){

        Dialog dialog=new Dialog(this);
        dialog.setTitle("Save online");
        dialog.setContentView(R.layout.actvlayoutitem);

        giftname= (TextInputEditText) dialog.findViewById(R.id.nameofgift);
        imgurl= (TextInputEditText) dialog.findViewById(R.id.gifturl);
        description= (TextInputEditText) dialog.findViewById(R.id.giftdescription);
        price= (TextInputEditText) dialog.findViewById(R.id.priceofgift);
        giftsubmit=(Button) dialog.findViewById(R.id.btn_upload);
        giftsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseClient.saveOnline(
                        description.getText().toString(),
                        imgurl.getText().toString(),
                        giftname.getText().toString(),
                        price.getText().toString());

                description.setText("");
                imgurl.setText("");
                giftname.setText("");
                price.setText("");

            }
        });
//to show
        dialog.show();


    }


  /* @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        firebaseClient.retrieveData();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Final Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.mitchelle.giftzawadi/http/host/path")
        );

    }

   @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Final Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.mitchelle.giftzawadi/http/host/path")
        );

    }*/



}

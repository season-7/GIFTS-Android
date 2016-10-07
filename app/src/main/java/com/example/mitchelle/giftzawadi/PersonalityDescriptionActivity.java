package com.example.mitchelle.giftzawadi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class PersonalityDescriptionActivity extends AppCompatActivity {
    private GridLayoutManager lLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_description);
        List<MYObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(PersonalityDescriptionActivity.this, 2);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(PersonalityDescriptionActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);

        AnimatedText writer=(AnimatedText) findViewById(R.id.desctext);
        writer.setCharacterDelay(150);
        writer.animateText("Which Category best suits them?");

    }



    private List<MYObject> getAllItemList(){

        List<MYObject> allItems = new ArrayList<MYObject>();
        allItems.add(new MYObject("Foodie", R.drawable.foodiepeople));
        allItems.add(new MYObject("Gadget Lover", R.drawable.gadgetpeople));
        allItems.add(new MYObject("Fashion Freak", R.drawable.fashion));
        allItems.add(new MYObject("Reader", R.drawable.bookmanfinal));
        allItems.add(new MYObject("Movieholic", R.drawable.newmovies));
        allItems.add(new MYObject("Sporty", R.drawable.finalactiveman));
        allItems.add(new MYObject("Event Goer", R.drawable.eventsperson));
        allItems.add(new MYObject("Artistic", R.drawable.artsperson));




        return allItems;
    }
}

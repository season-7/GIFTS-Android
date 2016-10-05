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

    }



    private List<MYObject> getAllItemList(){

        List<MYObject> allItems = new ArrayList<MYObject>();
        allItems.add(new MYObject("Foodie", R.drawable.foodiepeople));
        allItems.add(new MYObject("Gadget Lover", R.drawable.gadgetpeople));
        allItems.add(new MYObject("Fashion Freak", R.drawable.fashionman));
        allItems.add(new MYObject("Reader", R.drawable.bookmanfinal));
        allItems.add(new MYObject("Movieholic", R.drawable.moviepeople));
        allItems.add(new MYObject("Sporty", R.drawable.finalactiveman));


        return allItems;
    }
}

package com.example.mitchelle.giftzawadi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class PersonalityDescriptionActivity extends AppCompatActivity implements FirsDescriptionsFragment.OnDescriptionSeclected {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_description);
        /*List<MYObject> rowListItem = getAllItemList();*/
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.root_layout, FirsDescriptionsFragment.newInstance(), "rageComicList")
                    .commit();
        }


    }


    @Override
    public void onDescriptionSeclected(int imageResId, String name, String description, String url) {

        final FurtherDesFragment furtherDesFragment = new FurtherDesFragment();

        Bundle bundle = new Bundle();
        bundle.putString("category", name);
        bundle.putString("desc", description);
        furtherDesFragment.setArguments(bundle);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root_layout, furtherDesFragment, "DescriptionDetails")
                .addToBackStack(null)
                .commit();
    }
}

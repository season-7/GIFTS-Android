package com.example.mitchelle.somasoma;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class CoolText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_text);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

       /* TextText writer = new TextText(this);
        setContentView(writer);*/

        //Add a character every 150ms
        TextText writer = (TextText) findViewById(R.id.typewriter);

        writer.setCharacterDelay(150);
        writer.animateText("We give you the best gift ideas Ever");
    }
}

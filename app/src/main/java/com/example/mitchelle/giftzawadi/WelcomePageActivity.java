package com.example.mitchelle.giftzawadi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class WelcomePageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
       /* AnimatedText writer=new AnimatedText(this);
        setContentView(writer);*/

        //Add a character every 150ms

        AnimatedText writer=(AnimatedText) findViewById(R.id.typewriter);
        writer.setCharacterDelay(150);
        writer.animateText("We give you the best gift ideas Ever");

    }



}


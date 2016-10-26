package com.example.mitchelle.giftzawadi.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mitchelle.giftzawadi.Extra.AnimatedText;
import com.example.mitchelle.giftzawadi.R;

public class ThanksNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks_note);
        AnimatedText writer=(AnimatedText) findViewById(R.id.thanksnote);
        writer.setCharacterDelay(150);
        writer.animateText("Thanks for using this app,would tou like to;");
    }
}

package com.example.mitchelle.giftzawadi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SweetorsmackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweetorsmack);

        AnimatedText writer=(AnimatedText) findViewById(R.id.sweetorsnack);
        writer.setCharacterDelay(150);
        writer.animateText("How would you further describe them as?");
    }
}

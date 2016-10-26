package com.example.mitchelle.giftzawadi.Activities;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.mitchelle.giftzawadi.Adapters.ImageAdapter;
import com.example.mitchelle.giftzawadi.R;

public class SlideshowActivity extends AppCompatActivity {
    private Button swipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slideshow);
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        ImageAdapter adapterView = new ImageAdapter(this);
        mViewPager.setAdapter(adapterView);
        swipe=(Button)findViewById(R.id.taptocontinue);
        swipe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    // Go to loginActivity

                    startActivity(new Intent(SlideshowActivity.this,ActivityLogin.class));
                    return true;
                }
                return false;


            }
        });
    }
}

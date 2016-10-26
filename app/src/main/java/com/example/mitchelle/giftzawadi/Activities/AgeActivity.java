package com.example.mitchelle.giftzawadi.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitchelle.giftzawadi.R;

public class AgeActivity extends AppCompatActivity {
    private Button teenie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        teenie=(Button)findViewById(R.id.buttonteenageman);
        teenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgeActivity.this,PersonalityDescriptionActivity.class));
            }
        });
    }
}

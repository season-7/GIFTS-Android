package com.example.andrew.zawadi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class Activity2 extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setDragEdge(SwipeBackLayout.DragEdge.RIGHT);
    }
}

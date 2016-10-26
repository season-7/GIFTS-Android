package com.example.mitchelle.giftzawadi.Extra;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by mitchelle on 9/30/16.
 */
public class AnimatedText extends TextView {
    private CharSequence mText;
    private int mIndex;
    private long mDelay = 500; //Default 500ms delay

    public AnimatedText(Context context) {
        super(context);
    }

    public AnimatedText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    private Handler mHandler = new Handler();
    private Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            setText(mText.subSequence(0, mIndex++));
            if(mIndex <= mText.length()) {
                mHandler.postDelayed(characterAdder, mDelay);
            }
        }
    };
    public void animateText(CharSequence text) {
        mText = text;
        mIndex = 0;

        setText("");
        mHandler.removeCallbacks(characterAdder);
        mHandler.postDelayed(characterAdder, mDelay);
    }

    public void setCharacterDelay(long millis) {
        mDelay = millis;
    }
}

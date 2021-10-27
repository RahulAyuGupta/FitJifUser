package com.fitjifuser.ui.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;


public class MyTextViewOleoScriptBold extends AppCompatTextView {

    public MyTextViewOleoScriptBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewOleoScriptBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewOleoScriptBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OleoScript-Bold.ttf");
            setTypeface(tf);
        }
    }

}
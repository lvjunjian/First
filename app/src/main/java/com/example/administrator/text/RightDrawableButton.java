package com.example.administrator.text;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by ljj on 2018/8/21.
 * Description:
 */
public class RightDrawableButton extends android.support.v7.widget.AppCompatButton {
    private final static String TAG = "RightDrawableButton";
    private Drawable [] drawables;
    private float textWidth;
    private float bodyWidth;


    public RightDrawableButton(Context context) {
        super(context);
        init();
    }


    public RightDrawableButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RightDrawableButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        drawables = getCompoundDrawables();
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        textWidth = getPaint().measureText(getText().toString());
        Drawable drawableRight = drawables[2];
    }
}

package com.tcn.vendingappplugin;

import android.content.Context;
import android.util.AttributeSet;

import com.tcn.romate.skin.SkinTextView;

public class MyTextView extends SkinTextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected int getStringId() {
        return R.string.skin_test_name;
    }

    @Override
    protected int getTextSizeId() {
        return R.dimen.skin_test11;
    }

    @Override
    protected int getTextColorId() {
        return R.color.skin_red;
    }

    @Override
    protected int getTextBackgroundId() {
        return 0;
    }

    @Override
    protected int getTextBackgroundColorId() {
        return R.color.skin_green;
    }
}

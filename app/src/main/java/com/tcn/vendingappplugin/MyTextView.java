package com.tcn.vendingappplugin;

import android.content.Context;
import android.util.AttributeSet;

import com.tcn.romate.skin.CustomTextHelper;

import skin.support.widget.SkinCompatTextView;

public class MyTextView extends SkinCompatTextView {
    CustomTextHelper customTextHelper;

    public MyTextView(Context context) {
        this(context, null);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        customTextHelper = CustomTextHelper.create(this);
        customTextHelper.loadFromAttributes(attrs, defStyleAttr);
    }

    @Override
    public void applySkin() {
        super.applySkin();
        if (customTextHelper != null)
            customTextHelper.applySkin();
    }
}

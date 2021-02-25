package com.tcn.romate.skin;

import android.content.Context;
import android.util.AttributeSet;

import skin.support.widget.SkinCompatEditText;

public class TcnSkinEditText extends SkinCompatEditText {
    CustomTextHelper customTextHelper;

    public TcnSkinEditText(Context context) {
        this(context, null);
    }

    public TcnSkinEditText(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public TcnSkinEditText(Context context, AttributeSet attrs, int defStyleAttr) {
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

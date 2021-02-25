package com.tcn.romate.skin;

import android.content.Context;
import android.util.AttributeSet;

import skin.support.widget.SkinCompatTextView;

public class TcnSkinTextView extends SkinCompatTextView {
    CustomTextHelper customTextHelper;

    public TcnSkinTextView(Context context) {
        this(context, null);
    }

    public TcnSkinTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public TcnSkinTextView(Context context, AttributeSet attrs, int defStyleAttr) {
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

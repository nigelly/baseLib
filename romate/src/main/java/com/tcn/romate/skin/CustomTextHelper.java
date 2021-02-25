package com.tcn.romate.skin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import com.tcn.romate.R;

import skin.support.content.res.SkinCompatResources;
import skin.support.widget.SkinCompatHelper;
import skin.support.widget.SkinCompatTextHelper;
import skin.support.widget.SkinCompatTextHelperV17;

public class CustomTextHelper extends SkinCompatHelper {

    private int mTextContentResId = INVALID_ID;
    private int mTextSizeResId = INVALID_ID;

    public static CustomTextHelper create(TextView textView) {
        if (Build.VERSION.SDK_INT >= 17) {
            return new CustomTextHelper(textView);
        }
        return new CustomTextHelper(textView);
    }

    final TextView mView;

    public CustomTextHelper(TextView view) {
        mView = view;
    }


    public void loadFromAttributes(AttributeSet attrs, int defStyleAttr) {
        final Context context = mView.getContext();
        // First read the TextAppearance style id
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SkinTextContentHelper, defStyleAttr, 0);
        if (a.hasValue(R.styleable.SkinTextContentHelper_android_text)) {
            mTextContentResId = a.getResourceId(R.styleable.SkinTextContentHelper_android_text, INVALID_ID);
        }
        if (a.hasValue(R.styleable.SkinTextContentHelper_android_textSize)) {
            mTextSizeResId = a.getResourceId(R.styleable.SkinTextContentHelper_android_textSize, INVALID_ID);
        }
        a.recycle();
        applySkin();
    }

    private void applyTextContentResource() {
        mTextContentResId = checkResourceId(mTextContentResId);
        if (mTextContentResId != INVALID_ID) {
            String skinString = Util.getSkinText(mView.getContext(), mTextContentResId);
            if (!TextUtils.isEmpty(skinString)) {
                mView.setText(skinString);
            } else {
                mView.setText(mView.getContext().getResources().getText(mTextContentResId));
            }
        }
        mTextSizeResId = checkResourceId(mTextSizeResId);
        if (mTextSizeResId != INVALID_ID) {
            int skinSize = Util.getSkinSize(mView.getContext(), mTextSizeResId);
            if (skinSize != 0) {
                mView.setTextSize(skinSize);
            } else {
                mView.setTextSize(mView.getResources().getDimensionPixelSize(mTextSizeResId));
            }
        }
    }

    @Override
    public void applySkin() {
        applyTextContentResource();
    }
}

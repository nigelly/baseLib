package com.tcn.romate.skin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;

import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;
import skin.support.widget.SkinCompatTextHelper;

public abstract class SkinEditText extends AppCompatEditText implements SkinCompatSupportable {

    private int INVALID_STRING_ID = getStringId();

    protected abstract int getStringId();

    private int INVALID_SIZE_ID = getTextSizeId();

    protected abstract int getTextSizeId();

    private int INVALID_TEXT_COLOR_ID = getTextColorId();

    protected abstract int getTextColorId();

    private int INVALID_TEXT_BACKGROUND_ID = getTextBackgroundId();

    protected abstract int getTextBackgroundId();

    private int INVALID_TEXT_BACKGROUND_COLOR_ID = getTextBackgroundColorId();

    protected abstract int getTextBackgroundColorId();

    private SkinCompatTextHelper mTextHelper;

    private SkinCompatBackgroundHelper mBackgroundTintHelper;

    public SkinEditText(Context context) {
        super(context);
    }

    public SkinEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SkinEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyDropDownBackgroundResource();
        mTextHelper = SkinCompatTextHelper.create(this);
        mTextHelper.loadFromAttributes(attrs, defStyleAttr);
    }

    private void applyDropDownBackgroundResource() {
        if (checkResIdNot0(INVALID_STRING_ID)) {
            String skinString = Util.getSkinText(getContext(), INVALID_STRING_ID);
            if (!TextUtils.isEmpty(skinString)) {
                setText(skinString);
            } else {
                setText(getResources().getText(INVALID_STRING_ID));
            }
        }
        if (checkResIdNot0(INVALID_SIZE_ID)) {
            int skinSize = Util.getSkinSize(getContext(), INVALID_SIZE_ID);
            if (skinSize != 0) {
                setTextSize(skinSize);
            } else {
                setTextSize(getResources().getDimensionPixelSize(INVALID_SIZE_ID));
            }
        }
        if (checkResIdNot0(INVALID_TEXT_BACKGROUND_ID)) {
            Drawable drawable = Util.getSkinDrawable(getContext(), INVALID_TEXT_BACKGROUND_ID);
            if (drawable != null) {
                setBackground(drawable);
            } else {
                setBackground(getResources().getDrawable(INVALID_TEXT_BACKGROUND_ID));
            }
        }
        if (checkResIdNot0(INVALID_TEXT_COLOR_ID)) {
            int skinColor = Util.getSkinColor(getContext(), INVALID_TEXT_COLOR_ID);
            if (skinColor != 0) {
                setTextColor(skinColor);
            } else {
                setTextColor(getResources().getColor(INVALID_TEXT_COLOR_ID));
            }
        }
        if(checkResIdNot0(INVALID_TEXT_BACKGROUND_COLOR_ID)){
            int skinColor = Util.getSkinColor(getContext(), INVALID_TEXT_BACKGROUND_COLOR_ID);
            if (skinColor != 0) {
                setBackgroundColor(skinColor);
            } else {
                setBackgroundColor(getResources().getColor(INVALID_TEXT_BACKGROUND_COLOR_ID));
            }
        }
    }


    @Override
    public void setTextAppearance(int resId) {
        setTextAppearance(getContext(), resId);
    }

    @Override
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        if (mTextHelper != null) {
            mTextHelper.onSetTextAppearance(context, resId);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(
            @DrawableRes int start, @DrawableRes int top, @DrawableRes int end, @DrawableRes int bottom) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        if (mTextHelper != null) {
            mTextHelper.onSetCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        }
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(
            @DrawableRes int left, @DrawableRes int top, @DrawableRes int right, @DrawableRes int bottom) {
        super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        if (mTextHelper != null) {
            mTextHelper.onSetCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        }
    }

    @Override
    public void applySkin() {
        if (mTextHelper != null) {
            mTextHelper.applySkin();
        }
        applyDropDownBackgroundResource();
    }

    private boolean checkResIdNot0(int id) {
        if (id == 0) {
            return false;
        }
        return true;
    }
}

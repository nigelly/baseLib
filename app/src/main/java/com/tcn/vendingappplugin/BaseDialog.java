package com.tcn.vendingappplugin;

import android.content.Context;


import skin.support.widget.SkinCompatSupportable;

public class BaseDialog extends LoginDialog1 implements SkinCompatSupportable {


    public BaseDialog(Context context) {
        super(context);
    }

    public BaseDialog(Context context, int ResouceId) {
        super(context, ResouceId);
    }

    @Override
    public void applySkin() {

    }


}

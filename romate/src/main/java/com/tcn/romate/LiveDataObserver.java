package com.tcn.romate;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.lifecycle.Observer;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.tcn.romate.skin.CustomSDCardLoader;

import skin.support.SkinCompatManager;
import skin.support.app.SkinAppCompatViewInflater;
import skin.support.app.SkinCardViewInflater;
import skin.support.constraint.app.SkinConstraintViewInflater;
import skin.support.design.app.SkinMaterialViewInflater;


public class LiveDataObserver {

    private static LiveDataObserver instance;

    private Context context;

    public static LiveDataObserver getInstance() {
        if (instance == null) {
            instance = new LiveDataObserver();
        }
        return instance;
    }

    public void init(final Context context,TcnDataListener listener) {
        this.context = context;
        LiveEventBus.config().setContext(context);
        LiveEventBus.get("AppData", String.class).observeStickyForever(new Observer<String>() {
            @SuppressLint("WrongConstant")
            @Override
            public void onChanged(String s) {
                Log.d("print", "data --- >" + s);
                listener.VendEvent(s);
            }
        });

        SkinCompatManager.withoutActivity((Application) context)
                .addInflater(new SkinAppCompatViewInflater()) // 基础控件换肤初始化
                .addInflater(new SkinMaterialViewInflater()) // material design 控件换肤初始化[可选]
                .addInflater(new SkinConstraintViewInflater()) // ConstraintLayout 控件换肤初始化[可选]
                .addInflater(new SkinCardViewInflater()) // CardView v7 控件换肤初始化[可选]
                .setSkinStatusBarColorEnable(false) // 关闭状态栏换肤，默认打开[可选]
                .setSkinWindowBackgroundEnable(false) // 关闭windowBackground换肤，默认打开[可选]
                .addStrategy(new CustomSDCardLoader())
                .loadSkin();
    }

    public  void querySlotInfo() {
        LiveEventBus.get("VendingApp", String.class).broadcast("querySlotInfo", false, false);
    }


}

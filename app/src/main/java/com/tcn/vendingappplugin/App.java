package com.tcn.vendingappplugin;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import com.tcn.romate.LiveDataObserver;
import com.tcn.romate.TcnDataListener;

import skin.support.SkinCompatManager;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String externalStorageDirectory = Environment.getExternalStorageState();

        LiveDataObserver.getInstance().init(this, new TcnDataListener() {
            @Override
            public void VendEvent(String s) {

            }
        });
      //  SkinCompatManager.withoutActivity(this)
//                .addInflater(SkinAppCompatViewInflater()) // 基础控件换肤初始化
//                .addInflater(SkinMaterialViewInflater()) // material design 控件换肤初始化[可选]
//                .addInflater(SkinConstraintViewInflater()) // ConstraintLayout 控件换肤初始化[可选]
//                .addInflater(SkinCardViewInflater()) // CardView v7 控件换肤初始化[可选]
//                .setSkinStatusBarColorEnable(false) // 关闭状态栏换肤，默认打开[可选]
//                .setSkinWindowBackgroundEnable(false) // 关闭windowBackground换肤，默认打开[可选]
//                .addStrategy(CustomSDCardLoader())
//                .loadSkin();
    }
}

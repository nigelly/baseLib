package com.tcn.vendingappplugin;

import android.app.Application;

import com.tcn.romate.Coil_info;
import com.tcn.romate.LiveDataObserver;
import com.tcn.romate.TcnDataListener;

import java.util.List;

public class AppJava extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LiveDataObserver.getInstance().init(this, new TcnDataListener() {
            @Override
            public void VendEvent(String s) {

            }

            @Override
            public void VendEventCoilInfo(List<Coil_info> data) {

            }
        });
    }
}

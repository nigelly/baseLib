package com.tcn.vendingappplugin;

import android.app.Application;

import com.tcn.romate.Coil_info;
import com.tcn.romate.LiveDataObserver;
import com.tcn.romate.TcnDataListener;
import com.tcn.romate.TcnVendIF;
import com.tcn.romate.VendEventInfo;

import java.util.List;

public class AppJava extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TcnVendIF.getInstance().registerListener(tcnDataListener);
    }




    TcnDataListener tcnDataListener = new TcnDataListener() {
        @Override
        public void VendEvent(String s) {

        }

        @Override
        public void VendEventCoilInfo(List<Coil_info> data) {

        }

        @Override
        public void VendEventInfo(VendEventInfo vendEventInfo) {

        }

        @Override
        public void VendEventMachineId(String id) {

        }
    };
}

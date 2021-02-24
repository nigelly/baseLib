package com.tcn.romate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;

import androidx.lifecycle.Observer;

import com.google.gson.Gson;
import com.jeremyliao.liveeventbus.LiveEventBus;

import java.util.Map;


public class LiveDataObserver {

    private static LiveDataObserver instance;

    private Context context;

    private Gson gson = new Gson();

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
    }

    public  void querySlotInfo() {
        LiveEventBus.get("VendingApp", String.class).broadcast("querySlotInfo", false, false);
    }

    public void sendJson2App(Map map){
        String s = gson.toJson(map);
        LiveEventBus.get("VendingApp", String.class).broadcast(s, false, false);
    }

    public void sendString2App(String s){
        LiveEventBus.get("VendingApp", String.class).broadcast(s, false, false);
    }


}

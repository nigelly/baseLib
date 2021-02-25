package com.tcn.romate;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import androidx.lifecycle.Observer;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.tcn.romate.skin.CustomSDCardLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import skin.support.SkinCompatManager;
import skin.support.app.SkinAppCompatViewInflater;
import skin.support.app.SkinCardViewInflater;
import skin.support.constraint.app.SkinConstraintViewInflater;
import skin.support.design.app.SkinMaterialViewInflater;


public class LiveDataObserver {

    private static LiveDataObserver instance;

    private Context context;

    private TcnDataListener listener;

    private Gson gson = new Gson();

    public static LiveDataObserver getInstance() {
        if (instance == null) {
            instance = new LiveDataObserver();
        }
        return instance;
    }

    public void init(final Context context, TcnDataListener listener) {
        this.context = context;
        this.listener = listener;
        LiveEventBus.config().setContext(context);
        LiveEventBus.get("AppData", String.class).observeStickyForever(new Observer<String>() {
            @SuppressLint("WrongConstant")
            @Override
            public void onChanged(String jsonData) {
                JsonObject json = null;
                if (!TextUtils.isEmpty(jsonData)) {
                    json = new JsonParser().parse(jsonData).getAsJsonObject();
                }
                int id = json.get("value").getAsInt();
                switch (id) {
                    case TcnVendEventID.QUERY_ALIVE_COIL:
                        ParserJsonCoilInfo(json.getAsJsonArray("json"));
                        break;
                    default:
                        break;
                }
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


    private void ParserJsonCoilInfo(JsonArray json) {
        List<Coil_info> dataList = gson.fromJson(json.toString(), new TypeToken<List<Coil_info>>() {
        }.getType());
        listener.VendEventCoilInfo(dataList);
    }


    public void querySlotInfo() {
        LiveEventBus.get("VendingApp", String.class).broadcast("querySlotInfo", false, false);
    }

    public void selectSlot(int slot) {
        String[] datas = new String[2];
        datas[0] = "selectSlot";
        datas[1] = String.valueOf(slot);
        postData(datas);
    }

    private void postData(String[] datas) {
        LiveEventBus.get("VendingApp", String.class).broadcast(getData(datas), false, false);
    }

    private String getData(String... data) {
        Map<String, String> jsonMap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            jsonMap.put("value" + i, data[i]);
        }
        return gson.toJson(jsonMap);
    }


}

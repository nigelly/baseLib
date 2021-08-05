package com.tcn.romate;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;


import androidx.lifecycle.Observer;

import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.tcn.romate.log.TcnLog;
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

    private static final String TAG = "LiveDataObserver";

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

        TcnLog.LoggerInfo(TAG, "init 初始化基础组件");

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
                        //  TcnLog.LoggerInfo(TAG, "货道信息" + jsonData);
                        ParserJsonCoilInfo(json.getAsJsonArray("json"));
                        break;
                    case TcnVendEventID.CONTROL_TO_VEND_SHOP_GOODS:
                        // TcnLog.LoggerInfo(TAG, "商品编码货道信息" + jsonData);
                        ParserJsonGoodsCoilInfo(json.getAsJsonArray("json"));
                        break;
                    case TcnVendEventID.VENDING_APP_GET_MACHINE_ID:
                        String machineId = json.get("json").getAsString();
                        TcnLog.LoggerInfo(TAG, "机器号查询" + machineId);
                        listener.VendEventMachineId(machineId);
                        TcnVendIF.getInstance().sendVendDataID(machineId);
                        break;
                    default:
                        ParserJsonDefault(json.getAsJsonObject("json"));
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

        initLog();
    }

    private void ParserJsonDefault(JsonObject json) {
        try {
            VendEventInfo vendEventInfo = gson.fromJson(json.toString(), VendEventInfo.class);
            listener.VendEventInfo(vendEventInfo);
            TcnVendIF.getInstance().sendVendEventInfo(vendEventInfo);
        } catch (Exception e) {
            TcnLog.LoggerInfo(TAG, "解析消息失败 error msg : " + e.getMessage());
        }
    }


    private void ParserJsonCoilInfo(JsonArray json) {
        List<Coil_info> dataList = gson.fromJson(json.toString(), new TypeToken<List<Coil_info>>() {
        }.getType());
        listener.VendEventCoilInfo(dataList);
        TcnVendIF.getInstance().sendVendCoilInfo(dataList);
    }

    private void ParserJsonGoodsCoilInfo(JsonArray json) {
        List<UIGoodsInfo> dataList = gson.fromJson(json.toString(), new TypeToken<List<UIGoodsInfo>>() {
        }.getType());
        listener.VendEventGoodsInfo(dataList);
        TcnVendIF.getInstance().sendVendGoodsInfo(dataList);
    }


    /**
     * 查询所有货道信息
     */
    public void querySlotInfo() {
        String[] datas = new String[2];
        datas[0] = TcnMsgType.QUERY_SLOT_INFO;
        postData(datas);
    }

    /***
     * 选货
     * @param slot 货道号
     */
    public void selectSlot(int slot) {
        String[] datas = new String[2];
        datas[0] = TcnMsgType.SELECT_SLOT;
        datas[1] = String.valueOf(slot);
        postData(datas);
    }

    /**
     * 获取机器号
     */
    public void getMachineID() {
        String[] datas = new String[2];
        datas[0] = TcnMsgType.GET_MACHINE;
        postData(datas);
    }

    public void postData(String[] datas) {
        LiveEventBus.get("VendingApp", String.class).broadcast(getData(datas), false, false);
    }

    private String getData(String... data) {
        Map<String, String> jsonMap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            jsonMap.put("value" + i, data[i]);
        }
        return gson.toJson(jsonMap);
    }


    //发送数据到控制中心APP
    public void sendJsonDataToControl(String json) {
        LiveEventBus.get("VendingApp", String.class).broadcast(json, false, false);
    }


    public void initLog() {

        String path = Environment.getExternalStorageDirectory().getPath() + "/" + "TcnLog/";
        FileUtils.createOrExistsDir(path);

        ALog.Config config = ALog.init(context)
                .setLogSwitch(true)// 设置log总开关，包括输出到控制台和文件，默认开
                .setConsoleSwitch(true)// 设置是否输出到控制台开关，默认开
                .setGlobalTag("TcnVendingSkinApp")// 设置log全局标签，默认为空
                // 当全局标签不为空时，我们输出的log全部为该tag，
                // 为空时，如果传入的tag为空那就显示类名，否则显示tag
                .setLogHeadSwitch(false)// 设置log头信息开关，默认为开
                .setLog2FileSwitch(true)// 打印log时是否存到文件的开关，默认关
                .setDir(path)// 当自定义路径为空时，写入应用的/cache/log/目录中
                .setFilePrefix("tcn-skin")// 当文件前缀为空时，默认为"util"，即写入文件为"util-MM-dd.txt"
                .setBorderSwitch(true)// 输出日志是否带边框开关，默认开
                .setSingleTagSwitch(true)
                .setConsoleFilter(ALog.V)// log的控制台过滤器，和logcat过滤器同理，默认Verbose
                .setFileFilter(ALog.V)// log文件过滤器，和logcat过滤器同理，默认Verbose
                .setSaveDays(30)//保存天数
                .setStackDeep(1);// log栈深度，默认为1
        // LogUtils.d(config.toString());
    }

}

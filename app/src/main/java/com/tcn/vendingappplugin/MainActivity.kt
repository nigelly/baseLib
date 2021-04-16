package com.tcn.vendingappplugin

import android.os.Bundle
import android.util.Log
import android.view.View
import com.tcn.romate.*
import com.tcn.romate.skin.TcnSkinActivity


class MainActivity : TcnSkinActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val my = findViewById<MyTextView>(R.id.myTextView1);
//        my.setText(R.string.skin_test_name)
    }

    override fun onResume() {
        super.onResume()
        TcnVendIF.getInstance().registerListener(tcnDataListener)

    }


    override fun onPause() {
        super.onPause()
        TcnVendIF.getInstance().unregisterListener(tcnDataListener)

    }

    fun querySlot(view: View) {
      //  LiveDataObserver.getInstance().selectSlot(1)
        LiveDataObserver.getInstance().querySlotInfo()
        // SkinCompatManager.getInstance().loadSkin("app-debug.skin", null, CustomSDCardLoader.SKIN_LOADER_STRATEGY_SDCARD);
        //  SkinCompatManager.getInstance().loadSkin("app-debug.apk", SkinCompatManager.SKIN_LOADER_STRATEGY_ASSETS);
    }


    fun getMachineId(view: View) {
        LiveDataObserver.getInstance().getMachineID()
    }
    fun selectNo(view: View) {
        LiveDataObserver.getInstance().selectSlot(1)
    }


    var tcnDataListener: TcnDataListener = object : TcnDataListener {
        override fun VendEvent(s: String) {}
        override fun VendEventCoilInfo(data: List<Coil_info>) {

        }
        override fun VendEventInfo(vendEventInfo: VendEventInfo) {
            if(vendEventInfo.m_iEventID != 34)
            Log.d("print","activity = " + vendEventInfo)
        }
        override fun VendEventMachineId(id: String) {}
    }

}
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

    }


    override fun onPause() {
        super.onPause()

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


}
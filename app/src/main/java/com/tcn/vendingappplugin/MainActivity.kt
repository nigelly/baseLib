package com.tcn.vendingappplugin

import android.os.Bundle
import android.view.View
import com.tcn.romate.skin.TcnSkinActivity
import skin.support.SkinCompatManager


class MainActivity : TcnSkinActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val my = findViewById<MyTextView>(R.id.myTextView1);
//        my.setText(R.string.skin_test_name)
    }


    fun querySlot(view: View) {
      //  LiveDataObserver.getInstance().selectSlot(1)
        // SkinCompatManager.getInstance().loadSkin("app-debug.skin", null, CustomSDCardLoader.SKIN_LOADER_STRATEGY_SDCARD);
          SkinCompatManager.getInstance().loadSkin("app-debug.apk", SkinCompatManager.SKIN_LOADER_STRATEGY_ASSETS);
    }

    fun startPlug(view: View) {

        SkinCompatManager.getInstance().restoreDefaultTheme();
    }

}
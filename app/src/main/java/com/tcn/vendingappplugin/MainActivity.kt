package com.tcn.vendingappplugin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.SkinAppCompatDelegateImpl
import com.tcn.cpt_dialog.LoginDialog
import skin.support.SkinCompatManager


class MainActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun querySlot(view: View) {
       // SkinCompatManager.getInstance().loadSkin("app-debug.skin", null, CustomSDCardLoader.SKIN_LOADER_STRATEGY_SDCARD);
        SkinCompatManager.getInstance().loadSkin("app-debug.apk", SkinCompatManager.SKIN_LOADER_STRATEGY_ASSETS);
    }

    fun startPlug(view: View) {
//        val l = LoginDialog(
//            this
//        )
//        l.show()
        SkinCompatManager.getInstance().restoreDefaultTheme();
    }

    override fun getDelegate(): AppCompatDelegate {
        return SkinAppCompatDelegateImpl.get(this, this)
    }
}
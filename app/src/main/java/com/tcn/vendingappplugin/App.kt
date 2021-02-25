package com.tcn.vendingappplugin

import com.qihoo360.replugin.RePluginApplication
import com.tcn.romate.Coil_info
import com.tcn.romate.LiveDataObserver
import com.tcn.romate.TcnDataListener


open class App() : RePluginApplication() {

    override fun onCreate() {
        super.onCreate()
        LiveDataObserver.getInstance().init(this, object : TcnDataListener {
            override fun VendEvent(s: String) {}
            override fun VendEventCoilInfo(data: List<Coil_info>) {}
        })
    }
}
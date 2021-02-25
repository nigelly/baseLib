package com.tcn.vendingappplugin

import android.app.Application
import com.tcn.romate.Coil_info
import com.tcn.romate.LiveDataObserver
import com.tcn.romate.TcnDataListener
import com.tcn.romate.VendEventInfo


open class App() : Application() {

    override fun onCreate() {
        super.onCreate()
        LiveDataObserver.getInstance().init(this, object : TcnDataListener {
            override fun VendEvent(s: String) {
            }
            override fun VendEventMachineId(id: String?) {
            }

            override fun VendEventCoilInfo(data: List<Coil_info>) {
            }
            override fun VendEventInfo(vendEventInfo: VendEventInfo?) {
            }
        })
    }
}
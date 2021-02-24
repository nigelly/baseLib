package com.tcn.vendingappplugin

import com.qihoo360.replugin.RePluginApplication
import com.tcn.romate.LiveDataObserver
import skin.support.SkinCompatManager
import skin.support.app.SkinAppCompatViewInflater
import skin.support.app.SkinCardViewInflater
import skin.support.constraint.app.SkinConstraintViewInflater
import skin.support.design.app.SkinMaterialViewInflater


open class App() : RePluginApplication() {

    override fun onCreate() {
        super.onCreate()

        LiveDataObserver.getInstance()
            .init(this) { }
            }

}
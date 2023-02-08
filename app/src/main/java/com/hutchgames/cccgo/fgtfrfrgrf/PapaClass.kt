package com.hutchgames.cccgo.fgtfrfrgrf

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class PapaClass:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(gtjigtijgtjigt)
        Hawk.init(this).build()
    }

    companion object {
        const val gtjigtijgtjigt = "f7ad23a6-e4c1-4711-92e5-a027314abc14c"
        var gtngtgtgt = "appsChecker"
        var gtgthu: String? = "c11"
        var gthgthgt = "link"
        var bkgnkbgngihgtih: String? = "mainid"
        var hykpokkhykkhy: String? = "d11"
        var gtngtugthugt: String? = "countryCode"
        var gtgth = "geo"

    }
}
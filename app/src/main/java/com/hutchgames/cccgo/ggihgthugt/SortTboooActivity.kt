package com.hutchgames.cccgo.ggihgthugt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.hutchgames.cccgo.guhthtghugt.VevevvevvbbActivity2
import com.hutchgames.cccgo.databinding.ActivitySortTboooBinding
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.gtgthu
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.hykpokkhykkhy
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.gtngtgtgt
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.gtngtugthugt
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.gtgth
import com.hutchgames.cccgo.gtigthtighigthtgh.GaaaaammymymymyActivity2
import com.orhanobut.hawk.Hawk
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class SortTboooActivity : AppCompatActivity() {


    private fun ghtyytyt() {
        val fgfgtededte = Intent(this@SortTboooActivity, GaaaaammymymymyActivity2::class.java)
        Hawk.put(gtgth, null)
        Hawk.put(gtngtugthugt, null)
        Hawk.put(PapaClass.gtngtgtgt, null)
        startActivity(fgfgtededte)
        finish()
    }

    lateinit var bindAsf: ActivitySortTboooBinding

    private val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(gtgthu, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        bindAsf = ActivitySortTboooBinding.inflate(layoutInflater)
        setContentView(bindAsf.root)

        val appsCh: String? = Hawk.get(gtngtgtgt, "null")

        if (appsCh == "1") {
            AppsFlyerLib.getInstance()
                .init("vSn9htyuJAbikqcFeTC8sH", conversionDataListener, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        gtugthgthugt()

    }


    private fun gtjgtjigtjitgj() {
        val intent = Intent(this@SortTboooActivity, VevevvevvbbActivity2::class.java)
        Hawk.put(gtgth, null)
        Hawk.put(gtngtugthugt, null)
        Hawk.put(PapaClass.gtngtgtgt, null)
        startActivity(intent)
        finish()
    }


    private fun gtugthgthugt() {

        val ftgtt: String = Hawk.get(gtgth)
        val gtghylp: String = Hawk.get(gtngtugthugt, "null")

        val gthgt: String? = Hawk.get(hykpokkhykkhy, "null")
        val vnfbyg: String? = Hawk.get(gtngtgtgt, "null")
        var dfedfredr: String? = Hawk.get(gtgthu)

        if (vnfbyg == "1") {
            val hyohyitutu = Executors.newSingleThreadScheduledExecutor()
            hyohyitutu.scheduleAtFixedRate({
                if (dfedfredr != null) {

                    if (dfedfredr!!.contains("tdb2") || ftgtt.contains(gtghylp) || gthgt!!.contains(
                            "tdb2"
                        )
                    ) {
                        hyohyitutu.shutdown()

                        gtjgtjigtjitgj()
                    } else {
                        hyohyitutu.shutdown()

                        ghtyytyt()
                    }
                } else {
                    dfedfredr = Hawk.get(gtgthu)
                }
            }, 0, 1, TimeUnit.SECONDS)
        } else if (ftgtt.contains(gtghylp)) {

            gtjgtjigtjitgj()
        } else {
            ghtyytyt()
        }

    }


}

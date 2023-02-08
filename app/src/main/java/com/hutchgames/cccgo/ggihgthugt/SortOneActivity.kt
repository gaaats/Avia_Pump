package com.hutchgames.cccgo.ggihgthugt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.hutchgames.cccgo.R
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.bkgnkbgngihgtih
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.gtngtgtgt
import com.hutchgames.cccgo.gtigthtighigthtgh.GaaaaammymymymyActivity2
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SortOneActivity : AppCompatActivity() {
    private fun gtijgtjgtjjigtji() {
        val intentgtgttg = Intent(this@SortOneActivity, GaaaaammymymymyActivity2::class.java)
        Hawk.put(PapaClass.gtgth, null)
        Hawk.put(PapaClass.gtngtugthugt, null)
        Hawk.put(PapaClass.gtngtgtgt, null)
        startActivity(intentgtgttg)
        finish()
    }

    private fun intAfbgtgtt() {
        val intent = Intent(this@SortOneActivity, SortTboooActivity::class.java)
        startActivity(intent)
        finish()
    }


    private fun checkCountrygtgttg() {

        val check = jgtgtugthggt()

        if (check == "0") {
            gtijgtjgtjjigtji()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                getAdIdgttg()
            }

            intAfbgtgtt()
        }
    }

    private fun getAdIdgttg(){
        val frfrrf = AdvertisingIdClient(applicationContext)
        frfrrf.start()
        val gtjigtjigtjgtj = frfrrf.info.id
        Hawk.put(bkgnkbgngihgtih, gtjigtjigtjgtj)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort_one)
        checkCountrygtgttg()
    }

    private fun jgtgtugthggt(): String? {
        val gtjigtjigtjgti: String? = Hawk.get(gtngtgtgt)
        return gtjigtjigtjgti
    }



}
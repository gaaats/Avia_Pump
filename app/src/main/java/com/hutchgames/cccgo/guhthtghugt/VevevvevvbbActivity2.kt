package com.hutchgames.cccgo.guhthtghugt

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.hutchgames.cccgo.R
import com.hutchgames.cccgo.databinding.ActivityVevevvevvbb2Binding
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.gtgthu
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.hykpokkhykkhy
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.bkgnkbgngihgtih
import com.hutchgames.cccgo.fgtfrfrgrf.PapaClass.Companion.gthgthgt
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class VevevvevvbbActivity2 : AppCompatActivity() {



    private fun gjigtjigtjigt() {
        val gthugthugt = gtjigtht.settings
        gthugthugt.javaScriptEnabled = true

        gthugthugt.useWideViewPort = true

        gthugthugt.loadWithOverviewMode = true
        gthugthugt.allowFileAccess = true
        gthugthugt.domStorageEnabled = true
        gthugthugt.userAgentString = gthugthugt.userAgentString.replace("; wv", "")

        gthugthugt.javaScriptCanOpenWindowsAutomatically = true
        gthugthugt.setSupportMultipleWindows(false)

        gthugthugt.displayZoomControls = false
        gthugthugt.builtInZoomControls = true
        gthugthugt.setSupportZoom(true)

        gthugthugt.pluginState = WebSettings.PluginState.ON
        gthugthugt.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        gthugthugt.cacheMode = WebSettings.LOAD_DEFAULT

        gthugthugt.allowContentAccess = true
    }

    private fun gtjgtjigtjijtgi(uri: String): Boolean {

        val gtjgtjigtjitg = packageManager
        try {

            gtjgtjigtjitg.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private val gjigtjgtji = 1

    var frfrrf: ValueCallback<Array<Uri>>? = null
    lateinit var gtjigtht: WebView
    lateinit var frrgtttghhyhy: ActivityVevevvevvbb2Binding
    var ikioiol: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frrgtttghhyhy = ActivityVevevvevvbb2Binding.inflate(layoutInflater)
        setContentView(frrgtttghhyhy.root)

        gtjigtht = frrgtttghhyhy.viviviviiveeee
        Snackbar.make(
            frrgtttghhyhy.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val nbgtgtgthugt = CookieManager.getInstance()
        nbgtgtgthugt.setAcceptCookie(true)
        nbgtgtgthugt.setAcceptThirdPartyCookies(gtjigtht, true)
        gjigtjigtjigt()
        val acrgtgt: Activity = this
        gtjigtht.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (gtjgtjigtjijtgi(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                gthyyhy(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(acrgtgt, description, Toast.LENGTH_SHORT).show()
            }


        }
        gtjigtht.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                frfrrf?.onReceiveValue(null)
                frfrrf = filePathCallback
                var frgthyju: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (frgthyju!!.resolveActivity(packageManager) != null) {

                    var drfrgtt: File? = null
                    try {
                        drfrgtt = jukiloo()
                        frgthyju.putExtra("PhotoPath", ikioiol)
                    } catch (ex: IOException) {
                    }

                    if (drfrgtt != null) {
                        ikioiol = "file:" + drfrgtt.absolutePath
                        frgthyju.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(drfrgtt)
                        )
                    } else {
                        frgthyju = null
                    }
                }
                val vgbbhfr = Intent(Intent.ACTION_GET_CONTENT)
                vgbbhfr.addCategory(Intent.CATEGORY_OPENABLE)
                vgbbhfr.type = "image/*"
                val tgtgt: Array<Intent?> =
                    frgthyju?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val gtgthyhhy = Intent(Intent.ACTION_CHOOSER)
                gtgthyhhy.putExtra(Intent.EXTRA_INTENT, vgbbhfr)
                gtgthyhhy.putExtra(Intent.EXTRA_TITLE, getString(R.string.dfgtimage_chooserefrgtgttt))
                gtgthyhhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, tgtgt)
                startActivityForResult(
                    gtgthyhhy, gjigtjgtji
                )
                return true
            }

            @Throws(IOException::class)
            private fun jukiloo(): File {
                var frgtgy = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frgtgy.exists()) {
                    frgtgy.mkdirs()
                }

                frgtgy =
                    File(frgtgy.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frgtgy
            }

        }

        gtjigtht.loadUrl(ftgtt())
    }


    private fun gthgthgt(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val gtthynnmmnn = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gtthynnmmnn"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val nbbnbm =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $nbbnbm"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val mjmjjhhgf = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $mjmjjhhgf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    private fun ftgtt(): String {

        val spoontgt = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val hyjuuu = "com.hutchgames.cccgo"

        val defrr:String? = Hawk.get(gtgthu, "null")
        val thyy: String? = Hawk.get(bkgnkbgngihgtih, "null")
        val dpOnedeefr: String? = Hawk.get(hykpokkhykkhy, "null")

        val afIdfrftg = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)



        val ghughugt = "deviceID="
        val gtjitgjitg = "sub_id_1="
        val puouou = "ad_id="
        val nmnhk = "sub_id_4="
        val mnhjkjk = "sub_id_5="
        val mnhkyihky = "sub_id_6="


        val hykhykhyij = "naming"
        val nbugthugt = "deeporg"


        val gthyy = Build.VERSION.RELEASE

        val gthtghugt = Hawk.get(gthgthgt, "null")

        var gthugthugt = ""
        if (defrr != "null"){
            gthugthugt = "$gthtghugt$gtjitgjitg$defrr&$ghughugt$afIdfrftg&$puouou$thyy&$nmnhk$hyjuuu&$mnhjkjk$gthyy&$mnhkyihky$hykhykhyij"
            gthgthgt(afIdfrftg.toString())
        } else {
            gthugthugt = "$gthtghugt$gtjitgjitg$dpOnedeefr&$ghughugt$afIdfrftg&$puouou$thyy&$nmnhk$hyjuuu&$mnhjkjk$gthyy&$mnhkyihky$nbugthugt"
            gthgthgt(afIdfrftg.toString())
        }
        Log.d("lolo", "res is $gthugthugt")

        return spoontgt.getString("SAVED_URL", gthugthugt).toString()
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gjigtjgtji || frfrrf == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var rerererer: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                rerererer = arrayOf(Uri.parse(ikioiol))
            } else {
                val gtgtggttg = data.dataString
                if (gtgtggttg != null) {
                    rerererer = arrayOf(Uri.parse(gtgtggttg))
                }
            }
        }
        frfrrf?.onReceiveValue(rerererer)
        frfrrf = null
    }




    var urlfififif = ""
    fun gthyyhy(gtjigtjigtji: String?) {
        if (!gtjigtjigtji!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    gtjigtjigtji
                ).toString()

                val gtgyhyj = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val defr = gtgyhyj.edit()
                defr.putString("SAVED_URL", gtjigtjigtji)
                defr.apply()
            }
        }
    }

    private var yhygttt6 = false
    override fun onBackPressed() {


        if (gtjigtht.canGoBack()) {
            if (yhygttt6) {
                gtjigtht.stopLoading()
                gtjigtht.loadUrl(urlfififif)
            }
            this.yhygttt6 = true
            gtjigtht.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                yhygttt6 = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}


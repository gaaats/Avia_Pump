package com.ferrero.appla.gaaame


import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import com.hutchgames.cccgo.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class GameViev(
    var vfvfvf: Context,
    var task1111: GameTask,
    val car: Int,
    val hyhhyhyhy: List<Int>
) : View(vfvfvf) {

    private var gtgtgt = 0
    private var gtgttg = Paint()
    private var vvbbn = 0
    private var jikoloo = 0
    private var gbgyhyyju = 8
    private var ffggtgttg: Paint? = null
    private var jujukii: Paint? = null
    private var vjgtjgitjgtjitg: Paint? = null

    private var nnnnnn = 3

    var ssssssssssys = System.currentTimeMillis()
    private var dfrfrrrr7 = 0
    private var tltltltlt = ""

    private var bbbbbbbbbbttt = 0

    private var hashMaps = ArrayList<HashMap<String, Any>>()
    private var arrayList = ArrayList<HashMap<String, Any>>()

    private var vovovovoovi = 0


    var rrrrrrrran = hyhhyhyhy.random()

    init {
        ffggtgttg = Paint()
        gtgttg.color = Color.GREEN
        jujukii = Paint()
        vjgtjgitjgtjitg = Paint()
        vjgtjgitjgtjitg!!.textSize = 100f
        vjgtjgitjgtjitg!!.alpha = 190
        vjgtjgitjgtjitg!!.color = Color.WHITE
    }

    override fun onDraw(canvas: Canvas?) {
        canvas!!.drawText(
            tltltltlt,
            vovovovoovi / 2f - 220f,
            dfrfrrrr7 / 2f,
            vjgtjgitjgtjitg!!
        )


        super.onDraw(canvas)

        vovovovoovi = this@GameViev.measuredWidth
        dfrfrrrr7 = this@GameViev.measuredHeight

        var ddddiifrork = System.currentTimeMillis() - ssssssssssys

        if (gtgtgt % 700 < 10 + gbgyhyyju) {
            val maampamamapam = HashMap<String, Any>()

            maampamamapam["lane"] = (0..2).random()
            maampamamapam["startTime"] = gtgtgt
            hashMaps.add(maampamamapam)
        }
        gtgtgt = gtgtgt + 10 + gbgyhyyju
        val hyhhyhyhyhy = vovovovoovi / 5
        val bgbhnhnhhn = hyhhyhyhyhy + 10
        ffggtgttg!!.style = Paint.Style.FILL

        val drawableeee = resources.getDrawable(car, null)

        drawableeee.setBounds(
            vvbbn * vovovovoovi / 3 + vovovovoovi / 15 + 5,
            dfrfrrrr7 - 120 - bgbhnhnhhn,
            vvbbn * vovovovoovi / 3 + vovovovoovi / 15 + hyhhyhyhyhy - 25+50+60,
            dfrfrrrr7 - 20
        )
        drawableeee.draw(canvas!!)
        ffggtgttg!!.color = Color.GREEN
        var ccccccccccsoreee = 0

        edferfrrrfrfr(canvas)


        if (ddddiifrork >= 5000) {
            rrrrrrrran = hyhhyhyhy.random()
            ssssssssssys = System.currentTimeMillis()
            gbgyhyyju = gbgyhyyju + 1 + Math.abs(jikoloo / 8)

            val mbmbmbmbmb = HashMap<String, Any>()
            mbmbmbmbmb["lane"] = (0..2).random()
            mbmbmbmbmb["startTime"] = gtgtgt
            arrayList.add(mbmbmbmbmb)
        }


        for (i in hashMaps.indices) {
            try {
                val edfrgfrgtgt = hashMaps[i]["lane"] as Int * vovovovoovi / 3 + vovovovoovi / 15
                var frgttt = gtgtgt - hashMaps[i]["startTime"] as Int


                val ddedfrkPodfrk = resources.getDrawable(rrrrrrrran, null)

                ddedfrkPodfrk.setBounds(
                    edfrgfrgtgt + 25,
                    frgttt - bgbhnhnhhn,
                    edfrgfrgtgt + hyhhyhyhyhy,
                    frgttt
                )
                ddedfrkPodfrk.draw(canvas)
                if (hashMaps[i]["lane"] as Int == vvbbn) {
                    if (frgttt > dfrfrrrr7 - 2 - bgbhnhnhhn && frgttt < dfrfrrrr7 - 2) {
                        Log.d("life", "life is ${nnnnnn}")

                        when (nnnnnn) {
                            0 -> {
                                hyhjiyhjihyji()
                            }
                            1 -> {
                                hyhjiyhjihyji()
                            }
                            2 -> {
                                tltltltlt = "1 ♥ left"
                                CoroutineScope(Dispatchers.Main).launch {
                                    delay(800)
                                    tltltltlt = ""
                                }
                                gktggtjigtjigtjgtji()
                            }
                            3 -> {
                                gtgttg.color = Color.YELLOW
                                tltltltlt = "2 ♥ left"
                                CoroutineScope(Dispatchers.Main).launch {
                                    delay(800)
                                    tltltltlt = ""
                                }
                                vjgtjgitjgtjitg!!.alpha = 200
                                nnnnnn--
                                hashMaps.clear()
                            }
                        }
                    }
                    if (frgttt > dfrfrrrr7 + bgbhnhnhhn) {
                        hashMaps.removeAt(i)
                        fhrgtggttggt()

                        if (jikoloo > ccccccccccsoreee) {
                            ccccccccccsoreee = jikoloo
                        }
                    }
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        ffggtgttg!!.color = Color.WHITE
        ffggtgttg!!.textSize = 40f
        canvas.drawText("Score: $jikoloo", 80f, dfrfrrrr7 - 40f, ffggtgttg!!)
        canvas.drawText("Speed: $gbgyhyyju", 380f, dfrfrrrr7 - 40f, ffggtgttg!!)
        canvas!!.drawRect(
            (vovovovoovi - 200).toFloat(), dfrfrrrr7 - 40f,
            (vovovovoovi - 200 + 60 * nnnnnn).toFloat(), dfrfrrrr7 - 80f, gtgttg
        )
        invalidate()
    }

    private fun fhrgtggttggt() {
        jikoloo++
        bbbbbbbbbbttt++
    }

    private fun gktggtjigtjigtjgtji() {
        gtgttg.color = Color.RED
        nnnnnn--
        hashMaps.clear()
    }

    private fun hyhjiyhjihyji() {
        task1111.clclcllcgimi(jikoloo)
    }

    private fun edferfrrrfrfr(canvas: Canvas): Boolean {
        val ggggggggghj = vovovovoovi / 5
        val kokokok = ggggggggghj + 10
        jujukii!!.style = Paint.Style.FILL

        for (i in arrayList.indices) {

            val bbobobofdgjgg = arrayList[i]["lane"] as Int * vovovovoovi / 3 + vovovovoovi / 15
            var bbybbyyb = gtgtgt - arrayList[i]["startTime"] as Int

            val bombon = resources.getDrawable(R.drawable.coin, null)
            bombon.setBounds(bbobobofdgjgg + 25, bbybbyyb - kokokok, bbobobofdgjgg + kokokok, bbybbyyb)
            bombon.draw(canvas)

            if (arrayList[i]["lane"] as Int == vvbbn) {
                if (bbybbyyb > dfrfrrrr7 - 2 - kokokok && bbybbyyb < dfrfrrrr7 - 2) {
                    when (nnnnnn) {
                        1 -> {
                            nnnnnn++
                            tltltltlt = "2 ♥ left"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            gtgttg.color = Color.YELLOW
                            arrayList.clear()
                            return true
                        }
                        2 -> {
                            nnnnnn++
                            tltltltlt = "3 ♥ left"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            gtgttg.color = Color.GREEN
                            arrayList.clear()
                            return true
                        }
                        3 -> {
                            tltltltlt = "MAX health"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            return true
                        }
                    }
                }
            }
        }
        return true
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        try {
            when (event!!.action) {
                MotionEvent.ACTION_DOWN -> {
                    val x1 = event.x
                    if (x1 < vovovovoovi / 2) {
                        if (vvbbn > 0) {
                            vvbbn--
                        }
                    }
                    if (x1 > vovovovoovi / 2) {
                        if (vvbbn < 2) {
                            vvbbn++
                        }
                    }
                    invalidate()
                }
                MotionEvent.ACTION_UP -> {

                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return true
    }

    private fun eeeeeeeeeeeeeri() {
        Toast.makeText(
            vfvfvf,
            "Error, error, error...",
            Toast.LENGTH_SHORT
        ).show()
    }
}


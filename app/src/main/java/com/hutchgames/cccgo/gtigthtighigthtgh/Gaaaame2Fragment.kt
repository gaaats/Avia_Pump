package com.hutchgames.cccgo.gtigthtighigthtgh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.ferrero.appla.gaaame.GameTask
import com.ferrero.appla.gaaame.GameViev
import com.hutchgames.cccgo.R
import com.hutchgames.cccgo.databinding.FragmentGaaaame2Binding


class Gaaaame2Fragment : Fragment(), GameTask {

    val intList = listOf(
        R.drawable.meteorite,
    )

    private var fragmentStartyBinding: FragmentGaaaame2Binding? = null
    private val startyBinding get() = fragmentStartyBinding ?: throw RuntimeException("FragmentStartyBinding = null")

    private var gameViev: GameViev? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStartyBinding = FragmentGaaaame2Binding.inflate(inflater, container, false)
        return startyBinding.root
    }



    override fun onDestroy() {
        fragmentStartyBinding = null
        super.onDestroy()
    }

    override fun clclcllcgimi(score: Int) {
        val jujuujuj = "Score : $score"
        startyBinding.root.removeView(gameViev)
        startyBinding.tvScoreGame1.text = jujuujuj
        startyBinding.btnStart.visibility = View.VISIBLE
        gtjgtjigtjigt()
        gameViev = null

        gtkgtkgkogtk()
    }

    private fun gtjgtjigtjigt() {
        startyBinding.tvScoreGame1.visibility = View.VISIBLE
        startyBinding.imgLogoGame1.visibility = View.VISIBLE
    }

    private fun gtkgtkgkogtk() {
        findNavController().navigate(R.id.action_gaaaame2Fragment_to_gaaaameee3Fragment)
    }

    private fun eepepepep() {
        Toast.makeText(
            requireContext(),
            "Oops error, please try again...",
            Toast.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        try {
            startyBinding.btnStart.setOnClickListener {
                gameViev =
                    GameViev(requireContext(), this, R.drawable.airrrr, intList)
                gameViev!!.setBackgroundResource(R.drawable.baaaaccjcjc)
                gameViev!!.background.alpha = 230
                startyBinding.root.addView(gameViev)
                startyBinding.btnStart.visibility = View.GONE
                gtkktgtk()
            }
        } catch (e: Exception) {
            eepepepep()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtkktgtk() {
        startyBinding.tvScoreGame1.visibility = View.GONE
        startyBinding.imgLogoGame1.visibility = View.GONE
    }

}
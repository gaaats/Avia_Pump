package com.hutchgames.cccgo.gtigthtighigthtgh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.hutchgames.cccgo.R
import com.hutchgames.cccgo.databinding.FragmentGaaaame1Binding


class Gaaaame1Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaame1Binding = FragmentGaaaame1Binding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onDestroy() {
        fragmentGaaaame1Binding = null
        super.onDestroy()
    }

    private fun gjtigtjigt() {
        Snackbar.make(
            binding.root,
            "I have error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentGaaaame1Binding: FragmentGaaaame1Binding? = null
    private val binding
        get() = fragmentGaaaame1Binding ?: throw RuntimeException("FragmentFirrrrrtstBinding = null")


    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            frjorfoijrfjfrj()


        } catch (e: Exception) {
            gjtigtjigt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun frjorfoijrfjfrj() {
        binding.btnPlayGame.setOnClickListener {
            frrfjfrjrfj()
        }
    }

    private fun frrfjfrjrfj() {
        findNavController().navigate(R.id.action_gaaaame1Fragment_to_gaaaame2Fragment)
    }


}
package com.hutchgames.cccgo.gtjigtjigtjggt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.hutchgames.cccgo.R
import com.hutchgames.cccgo.databinding.FragmentGaaaameee3Binding
import kotlinx.coroutines.delay
import kotlin.random.Random


class Gaaaameee3Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaameee3Binding = FragmentGaaaameee3Binding.inflate(inflater, container, false)
        return binding.root
    }

    private var fragmentGaaaameee3Binding: FragmentGaaaameee3Binding? = null
    private val binding get() = fragmentGaaaameee3Binding ?: throw RuntimeException("FragmentGaaaameee3Binding = null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            lifecycleScope.launchWhenCreated {
                val num = Random.nextInt(from = 100, until = 1000)
                Toast.makeText(requireContext(), "Earned $num points", Toast.LENGTH_SHORT).show()
                delay(3000)
                findNavController().navigate(R.id.action_gaaaameee3Fragment_to_gaaaame1Fragment)
            }

        } catch (e: Exception){
            efrfrgtgttg5()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        fragmentGaaaameee3Binding = null
        super.onDestroy()
    }

    private fun efrfrgtgttg5() {
        Toast.makeText(
            requireContext(),
            "Oops something bad, please try again...",
            Toast.LENGTH_SHORT
        ).show()
        requireActivity().onBackPressed()
    }
}
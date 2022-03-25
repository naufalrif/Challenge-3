package com.example.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_fourth.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FourthFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FourthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_backto3.setOnClickListener {
            val nama = arguments?.getString("DataNama")
            val usia = input_usia.text.toString()
            val alamat = input_alamat.text.toString()
            val kerjaan = input_kerja.text.toString()
            val data = bundleOf("USIA" to usia, "ALAMAT" to alamat, "KERJA" to kerjaan, "NAMA" to nama)

            Navigation.findNavController(view).navigate(R.id.action_fourthFragment_to_thirdFragment, data)
        }

    }
}
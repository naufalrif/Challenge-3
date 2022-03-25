package com.example.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_third.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ThirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments?.containsKey("ALAMAT") == true){
            val datanama = arguments?.getString("NAMA")
            show_nama.text = datanama

            val datausia = arguments?.getString("USIA")?.toInt()
            val ganjilgenap = if (datausia?.rem(2) == 0){
                "Genap"
            }else{
                "Ganjil"
            }
            show_usia.text = "$datausia, bernilai $ganjilgenap"


            val dataalamat = arguments?.getString("ALAMAT")
            show_alamat.text = dataalamat

            val datakerja = arguments?.getString("KERJA")
            show_kerja.text = datakerja
        }else{
            val datanama = arguments?.getString("NAMA")
            show_nama.text = datanama
        }

        btn_screen4.setOnClickListener {
            val datanama = arguments?.getString("NAMA")
            val datauser = bundleOf("DataNama" to datanama)
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_fourthFragment, datauser)
        }
    }
}
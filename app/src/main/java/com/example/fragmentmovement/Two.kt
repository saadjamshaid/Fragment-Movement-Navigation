package com.example.fragmentmovement


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class Two : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_two, container, false)

        val button: Button = view.findViewById(R.id.button)


        button.setOnClickListener(View.OnClickListener {


            Navigation.findNavController(view).navigate(R.id.three)

        })


        return view
    }


}

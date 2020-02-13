package com.example.fragmentmovement


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fragmentmovement.databinding.FragmentOneBinding
import java.lang.Exception

/**
 * A simple [Fragment] subclass.
 */
class One : Fragment() {

    private lateinit var binding: FragmentOneBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_one, container, false)





        val button: Button = view.findViewById(R.id.button)

        button.setOnClickListener(View.OnClickListener {


            try {Navigation.findNavController(view).navigate(R.id.two)}
            catch (e: Exception) { Log.i("Saad", "Failing")}

        })

        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)




    }
}

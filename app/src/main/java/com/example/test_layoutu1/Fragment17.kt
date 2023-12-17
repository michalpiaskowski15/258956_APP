package com.example.test_layoutu1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.NestedScrollView


class Fragment17 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_17, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll16)
        setUpTableOfContentsLinks()
    }

    private fun setUpTableOfContentsLinks() {
        val odnosnik1b = view?.findViewById<Button>(R.id.F17R1O1)
        val odnosnik1o = view?.findViewById<TextView>(R.id.F6R1T)
        val odnosnik2b = view?.findViewById<Button>(R.id.F17R1O2)
        val odnosnik2o = view?.findViewById<TextView>(R.id.F7R1T)

        odnosnik1b?.setOnClickListener {
            nestedScrollView.post {
                val przejscie = requireActivity().supportFragmentManager.beginTransaction()
                przejscie.replace(R.id.fragment_container, Fragment6())
                przejscie.commit()
                if (odnosnik1o != null){nestedScrollView.smoothScrollTo(0, odnosnik1o.top)}
            }
        }
        odnosnik2b?.setOnClickListener {
            nestedScrollView.post {
                val przejscie = requireActivity().supportFragmentManager.beginTransaction()
                przejscie.replace(R.id.fragment_container, Fragment7())
                przejscie.commit()
                if (odnosnik2o != null){nestedScrollView.smoothScrollTo(0, odnosnik2o.top)}
            }
        }

    }
}
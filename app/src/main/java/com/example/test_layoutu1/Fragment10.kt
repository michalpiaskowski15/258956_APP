package com.example.test_layoutu1

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.widget.NestedScrollView
import java.io.IOException
import java.io.InputStream

class Fragment10 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_10, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll9)
        setUpTableOfContentsLinks()

        val imageView107 = view.findViewById<ImageView>(R.id.IMG107)
        val imageView108 = view.findViewById<ImageView>(R.id.IMG108)
        val imageView109 = view.findViewById<ImageView>(R.id.IMG109)
        val imageView110 = view.findViewById<ImageView>(R.id.IMG110)
        val imageView111 = view.findViewById<ImageView>(R.id.IMG111)
        val imageView112 = view.findViewById<ImageView>(R.id.IMG112)
        val imageView113 = view.findViewById<ImageView>(R.id.IMG113)
        val imageView114 = view.findViewById<ImageView>(R.id.IMG114)


        bitmapToIMGView(requireContext(), imageView107, "lab2_1.png")
        bitmapToIMGView(requireContext(), imageView108, "lab2_2.png")
        bitmapToIMGView(requireContext(), imageView109, "lab2_3.png")
        bitmapToIMGView(requireContext(), imageView110, "lab2_4.png")
        bitmapToIMGView(requireContext(), imageView111, "lab2_5.png")
        bitmapToIMGView(requireContext(), imageView112, "lab2_6.png")
        bitmapToIMGView(requireContext(), imageView113, "lab2_7.png")
        bitmapToIMGView(requireContext(), imageView114, "lab2_8.png")

    }

    fun bitmapToIMGView(context: Context, imageView: ImageView, filename: String){
        try {
            val inputStream: InputStream = context.assets.open("IMG_PNG/$filename")
            val bitmap: Bitmap = BitmapFactory.decodeStream(inputStream)
            inputStream.close()
            imageView.setImageBitmap(bitmap)
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
    private fun setUpTableOfContentsLinks() {
        val odnosnik1 = view?.findViewById<Button>(R.id.F10R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F10R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F10R3)
        val odnosnik4 = view?.findViewById<Button>(R.id.F10R4)
        val odnosnik5 = view?.findViewById<Button>(R.id.F10R5)
        val odnosnik3b = view?.findViewById<Button>(R.id.F10R1O1)
        val odnosnik4b = view?.findViewById<Button>(R.id.F10R1O2)
        val odnosnik5b = view?.findViewById<Button>(R.id.F10R1O3)


        val rozdzial1 = view?.findViewById<TextView>(R.id.F10R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F10R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F10R3T)
        val rozdzial4 = view?.findViewById<TextView>(R.id.F10R4T)
        val rozdzial5 = view?.findViewById<TextView>(R.id.F10R5T)
        val odnosnik3o = view?.findViewById<TextView>(R.id.F1R3T)
        val odnosnik4o = view?.findViewById<TextView>(R.id.F4R2T)
        val odnosnik5o = view?.findViewById<TextView>(R.id.F4R3T)




        odnosnik1?.setOnClickListener {
            nestedScrollView.post {
                if (rozdzial1 != null){nestedScrollView.smoothScrollTo(0, rozdzial1.top)}
            }
        }
        odnosnik2?.setOnClickListener {
            nestedScrollView.post {
                if (rozdzial2 != null){nestedScrollView.smoothScrollTo(0, rozdzial2.top)}
            }
        }
        odnosnik3?.setOnClickListener {
            nestedScrollView.post {
                if (rozdzial3 != null){nestedScrollView.smoothScrollTo(0, rozdzial3.top)}
            }
        }
        odnosnik4?.setOnClickListener {
            nestedScrollView.post {
                if (rozdzial4 != null){nestedScrollView.smoothScrollTo(0, rozdzial4.top)}
            }
        }
        odnosnik5?.setOnClickListener {
            nestedScrollView.post {
                if (rozdzial5 != null){nestedScrollView.smoothScrollTo(0, rozdzial5.top)}
            }
        }
        odnosnik3b?.setOnClickListener {
            nestedScrollView.post {
                val przejscie = requireActivity().supportFragmentManager.beginTransaction()
                przejscie.replace(R.id.fragment_container, Fragment2())
                przejscie.commit()
                if (odnosnik3o != null){nestedScrollView.smoothScrollTo(0, odnosnik3o.top)}
            }
        }
        odnosnik4b?.setOnClickListener {
            nestedScrollView.post {
                val przejscie = requireActivity().supportFragmentManager.beginTransaction()
                przejscie.replace(R.id.fragment_container, Fragment4())
                przejscie.commit()
                if (odnosnik4o != null){nestedScrollView.smoothScrollTo(0, odnosnik4o.top)}
            }
        }
        odnosnik5b?.setOnClickListener {
            nestedScrollView.post {
                val przejscie = requireActivity().supportFragmentManager.beginTransaction()
                przejscie.replace(R.id.fragment_container, Fragment4())
                przejscie.commit()
                if (odnosnik5o != null){nestedScrollView.smoothScrollTo(0, odnosnik5o.top)}
            }
        }

    }
}
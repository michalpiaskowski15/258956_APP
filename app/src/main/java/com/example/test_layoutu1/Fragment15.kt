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

class Fragment15 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_15, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll14)
        setUpTableOfContentsLinks()

        val imageView146 = view.findViewById<ImageView>(R.id.IMG146)

        bitmapToIMGView(requireContext(), imageView146, "lab6_11.png")

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
        val odnosnik1 = view?.findViewById<Button>(R.id.F15R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F15R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F15R3)
        val odnosnik4 = view?.findViewById<Button>(R.id.F15R4)
        val odnosnik5 = view?.findViewById<Button>(R.id.F15R5)
        val odnosnik3b = view?.findViewById<Button>(R.id.F15R1O1)

        val link_download11 = view?.findViewById<TextView>(R.id.link_download11)
        link_download11?.movementMethod = LinkMovementMethod.getInstance()

        val link_download12 = view?.findViewById<TextView>(R.id.link_download12)
        link_download12?.movementMethod = LinkMovementMethod.getInstance()

        val link_download13 = view?.findViewById<TextView>(R.id.link_download13)
        link_download13?.movementMethod = LinkMovementMethod.getInstance()

        val link_download14 = view?.findViewById<TextView>(R.id.link_download14)
        link_download14?.movementMethod = LinkMovementMethod.getInstance()


        val rozdzial1 = view?.findViewById<TextView>(R.id.F15R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F15R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F15R3T)
        val rozdzial4 = view?.findViewById<TextView>(R.id.F15R4T)
        val rozdzial5 = view?.findViewById<TextView>(R.id.F15R5T)
        val odnosnik3o = view?.findViewById<TextView>(R.id.F14R1T)





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
                przejscie.replace(R.id.fragment_container, Fragment14())
                przejscie.commit()
                if (odnosnik3o != null){nestedScrollView.smoothScrollTo(0, odnosnik3o.top)}
            }
        }

    }
}
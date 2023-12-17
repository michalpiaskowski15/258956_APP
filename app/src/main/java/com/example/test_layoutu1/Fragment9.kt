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
import androidx.fragment.app.setFragmentResult
import java.io.IOException
import java.io.InputStream

class Fragment9 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_9, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll8)
        setUpTableOfContentsLinks()

        val imageView103 = view.findViewById<ImageView>(R.id.IMG103)
        val imageView104 = view.findViewById<ImageView>(R.id.IMG104)
        val imageView105 = view.findViewById<ImageView>(R.id.IMG105)
        val imageView106 = view.findViewById<ImageView>(R.id.IMG106)

        bitmapToIMGView(requireContext(), imageView103, "lab1_1.png")
        bitmapToIMGView(requireContext(), imageView104, "lab1_2.png")
        bitmapToIMGView(requireContext(), imageView105, "lab1_3.png")
        bitmapToIMGView(requireContext(), imageView106, "lab1_4.png")

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
        val odnosnik1 = view?.findViewById<Button>(R.id.F9R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F9R2)
        val odnosnik3b = view?.findViewById<Button>(R.id.F9R1O1)
        val odnosnik4b = view?.findViewById<Button>(R.id.F9R1O2)
        val odnosnik5b = view?.findViewById<Button>(R.id.F9R1O3)



        val link_download2 = view?.findViewById<TextView>(R.id.link_download2)
        val link_download3 = view?.findViewById<TextView>(R.id.link_download3)

        val rozdzial1 = view?.findViewById<TextView>(R.id.F9R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F9R2T)
        val odnosnik3o = view?.findViewById<TextView>(R.id.F1R2T1)
        val odnosnik4o = view?.findViewById<TextView>(R.id.F3H)
        val odnosnik5o = view?.findViewById<TextView>(R.id.F5R2T)


        link_download2?.movementMethod = LinkMovementMethod.getInstance()
        link_download3?.movementMethod = LinkMovementMethod.getInstance()


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
        odnosnik3b?.setOnClickListener {
            nestedScrollView.post {
                val przejscie = requireActivity().supportFragmentManager.beginTransaction()
                przejscie.replace(R.id.fragment_container, Fragment2())
                przejscie.commit()
                if (odnosnik3o != null){
                    nestedScrollView.smoothScrollTo(0, odnosnik3o.top)}
            }
        }
        odnosnik4b?.setOnClickListener {
            nestedScrollView.post {
                val przejscie = requireActivity().supportFragmentManager.beginTransaction()
                przejscie.replace(R.id.fragment_container, Fragment3())
                przejscie.commit()
                if (odnosnik4o != null){nestedScrollView.smoothScrollTo(0, odnosnik4o.top)}
            }
        }
        odnosnik5b?.setOnClickListener {
            nestedScrollView.post {
                val przejscie = requireActivity().supportFragmentManager.beginTransaction()
                przejscie.replace(R.id.fragment_container, Fragment5())
                przejscie.commit()
                if (odnosnik5o != null){nestedScrollView.smoothScrollTo(0, odnosnik5o.top)}
            }
        }

    }
}
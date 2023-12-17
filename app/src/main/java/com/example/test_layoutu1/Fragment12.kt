package com.example.test_layoutu1

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
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

class Fragment12 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_12, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll11)
        setUpTableOfContentsLinks()

        val imageView130 = view.findViewById<ImageView>(R.id.IMG130)
        val imageView131 = view.findViewById<ImageView>(R.id.IMG131)
        val imageView132 = view.findViewById<ImageView>(R.id.IMG132)
        val imageView133 = view.findViewById<ImageView>(R.id.IMG133)
        val imageView134 = view.findViewById<ImageView>(R.id.IMG134)
        val imageView135 = view.findViewById<ImageView>(R.id.IMG135)
        val imageView136 = view.findViewById<ImageView>(R.id.IMG136)
        val imageView137 = view.findViewById<ImageView>(R.id.IMG137)
        val imageView138 = view.findViewById<ImageView>(R.id.IMG138)
        val imageView139 = view.findViewById<ImageView>(R.id.IMG139)
        val imageView140 = view.findViewById<ImageView>(R.id.IMG140)
        val imageView141 = view.findViewById<ImageView>(R.id.IMG141)
        val imageView142 = view.findViewById<ImageView>(R.id.IMG142)

        bitmapToIMGView(requireContext(), imageView130, "lab4_1.png")
        bitmapToIMGView(requireContext(), imageView131, "lab4_2.png")
        bitmapToIMGView(requireContext(), imageView132, "lab4_3.png")
        bitmapToIMGView(requireContext(), imageView133, "lab4_4.png")
        bitmapToIMGView(requireContext(), imageView134, "lab4_5.png")
        bitmapToIMGView(requireContext(), imageView135, "lab4_6.png")
        bitmapToIMGView(requireContext(), imageView136, "lab4_7.png")
        bitmapToIMGView(requireContext(), imageView137, "lab4_8.png")
        bitmapToIMGView(requireContext(), imageView138, "lab4_13.png")
        bitmapToIMGView(requireContext(), imageView139, "lab4_9.png")
        bitmapToIMGView(requireContext(), imageView140, "lab4_10.png")
        bitmapToIMGView(requireContext(), imageView141, "lab4_11.png")
        bitmapToIMGView(requireContext(), imageView142, "lab4_12.png")


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
        val odnosnik1 = view?.findViewById<Button>(R.id.F12R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F12R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F12R3)
        val odnosnik4 = view?.findViewById<Button>(R.id.F12R4)



        val rozdzial1 = view?.findViewById<TextView>(R.id.F12R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F12R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F12R3T)
        val rozdzial4 = view?.findViewById<TextView>(R.id.F12R4T)





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

    }
}
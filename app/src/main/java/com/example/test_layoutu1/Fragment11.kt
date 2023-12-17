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

class Fragment11 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_11, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll10)
        setUpTableOfContentsLinks()

        val imageView115 = view.findViewById<ImageView>(R.id.IMG115)
        val imageView116 = view.findViewById<ImageView>(R.id.IMG116)
        val imageView117 = view.findViewById<ImageView>(R.id.IMG117)
        val imageView118 = view.findViewById<ImageView>(R.id.IMG118)
        val imageView119 = view.findViewById<ImageView>(R.id.IMG119)
        val imageView120 = view.findViewById<ImageView>(R.id.IMG120)
        val imageView121 = view.findViewById<ImageView>(R.id.IMG121)
        val imageView122 = view.findViewById<ImageView>(R.id.IMG122)
        val imageView123 = view.findViewById<ImageView>(R.id.IMG123)
        val imageView124 = view.findViewById<ImageView>(R.id.IMG124)
        val imageView125 = view.findViewById<ImageView>(R.id.IMG125)
        val imageView126 = view.findViewById<ImageView>(R.id.IMG126)
        val imageView127 = view.findViewById<ImageView>(R.id.IMG127)
        val imageView128 = view.findViewById<ImageView>(R.id.IMG128)
        val imageView129 = view.findViewById<ImageView>(R.id.IMG129)


        bitmapToIMGView(requireContext(), imageView115, "lab3_1.png")
        bitmapToIMGView(requireContext(), imageView116, "lab3_2.png")
        bitmapToIMGView(requireContext(), imageView117, "lab3_3.png")
        bitmapToIMGView(requireContext(), imageView118, "lab3_4.png")
        bitmapToIMGView(requireContext(), imageView119, "lab3_5.png")
        bitmapToIMGView(requireContext(), imageView120, "lab3_6.png")
        bitmapToIMGView(requireContext(), imageView121, "lab3_7.png")
        bitmapToIMGView(requireContext(), imageView122, "lab3_8.png")
        bitmapToIMGView(requireContext(), imageView123, "lab3_9.png")
        bitmapToIMGView(requireContext(), imageView124, "lab3_10.png")
        bitmapToIMGView(requireContext(), imageView125, "lab3_11.png")
        bitmapToIMGView(requireContext(), imageView126, "lab3_12.png")
        bitmapToIMGView(requireContext(), imageView127, "lab3_13.png")
        bitmapToIMGView(requireContext(), imageView128, "lab3_14.png")
        bitmapToIMGView(requireContext(), imageView129, "lab3_15.png")


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
        val odnosnik1 = view?.findViewById<Button>(R.id.F11R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F11R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F11R3)
        val odnosnik4 = view?.findViewById<Button>(R.id.F11R4)

        //DODAĆ ODNOSNIK DO LOGIKI val odnosnik4b = view?.findViewById<Button>(R.id.F10R1O2)


        val rozdzial1 = view?.findViewById<TextView>(R.id.F11R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F11R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F11R3T)
        val rozdzial4 = view?.findViewById<TextView>(R.id.F11R4T)


        //DODAĆ val odnosnik4o = view?.findViewById<TextView>(R.id.F4R3T)



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
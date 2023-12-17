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


class Fragment4 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_4, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll3)
        setUpTableOfContentsLinks()

        val imageView31 = view.findViewById<ImageView>(R.id.IMG31)
        val imageView32 = view.findViewById<ImageView>(R.id.IMG32)
        val imageView33 = view.findViewById<ImageView>(R.id.IMG33)
        val imageView34 = view.findViewById<ImageView>(R.id.IMG34)
        val imageView35 = view.findViewById<ImageView>(R.id.IMG35)
        val imageView36 = view.findViewById<ImageView>(R.id.IMG36)
        val imageView37 = view.findViewById<ImageView>(R.id.IMG37)
        val imageView38 = view.findViewById<ImageView>(R.id.IMG38)
        val imageView39 = view.findViewById<ImageView>(R.id.IMG39)
        val imageView40 = view.findViewById<ImageView>(R.id.IMG40)
        val imageView41 = view.findViewById<ImageView>(R.id.IMG41)
        val imageView42 = view.findViewById<ImageView>(R.id.IMG42)
        val imageView43 = view.findViewById<ImageView>(R.id.IMG43)
        val imageView44 = view.findViewById<ImageView>(R.id.IMG44)
        val imageView45 = view.findViewById<ImageView>(R.id.IMG45)
        val imageView46 = view.findViewById<ImageView>(R.id.IMG46)
        val imageView47 = view.findViewById<ImageView>(R.id.IMG47)



        bitmapToIMGView(requireContext(), imageView31, "layout_1.png")
        bitmapToIMGView(requireContext(), imageView32, "layout_2.png")
        bitmapToIMGView(requireContext(), imageView33, "design.png")
        bitmapToIMGView(requireContext(), imageView34, "linear.png")
        bitmapToIMGView(requireContext(), imageView35, "linear_vertical.png")
        bitmapToIMGView(requireContext(), imageView36, "linear_horizontal.png")
        bitmapToIMGView(requireContext(), imageView37, "relative1.png")
        bitmapToIMGView(requireContext(), imageView38, "relative2.png")
        bitmapToIMGView(requireContext(), imageView39, "tablelayout.png")
        bitmapToIMGView(requireContext(), imageView40, "tablelayout2.png")
        bitmapToIMGView(requireContext(), imageView41, "constraint0.png")
        bitmapToIMGView(requireContext(), imageView42, "constraint1.png")
        bitmapToIMGView(requireContext(), imageView43, "constraint11.png")
        bitmapToIMGView(requireContext(), imageView44, "constraintmenu1.png")
        bitmapToIMGView(requireContext(), imageView45, "constraintmenu2.png")
        bitmapToIMGView(requireContext(), imageView46, "constraint3.png")
        bitmapToIMGView(requireContext(), imageView47, "constraintkod.png")


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
        val odnosnik1 = view?.findViewById<Button>(R.id.F4R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F4R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F4R3)
        val link_download = view?.findViewById<TextView>(R.id.link_download)

        val rozdzial1 = view?.findViewById<TextView>(R.id.F4R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F4R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F4R3T)


        link_download?.movementMethod = LinkMovementMethod.getInstance()


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


    }
}
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

class Fragment6 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_6, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll5)
        setUpTableOfContentsLinks()

        val imageView61 = view.findViewById<ImageView>(R.id.IMG61)
        val imageView62 = view.findViewById<ImageView>(R.id.IMG62)
        val imageView63 = view.findViewById<ImageView>(R.id.IMG63)
        val imageView65 = view.findViewById<ImageView>(R.id.IMG65)
        val imageView67 = view.findViewById<ImageView>(R.id.IMG67)
        val imageView68 = view.findViewById<ImageView>(R.id.IMG68)
        val imageView69 = view.findViewById<ImageView>(R.id.IMG69)
        val imageView70 = view.findViewById<ImageView>(R.id.IMG70)
        val imageView71 = view.findViewById<ImageView>(R.id.IMG71)
        val imageView72 = view.findViewById<ImageView>(R.id.IMG72)
        val imageView73 = view.findViewById<ImageView>(R.id.IMG73)
        val imageView74 = view.findViewById<ImageView>(R.id.IMG74)
        val imageView75 = view.findViewById<ImageView>(R.id.IMG75)
        val imageView76 = view.findViewById<ImageView>(R.id.IMG76)
        val imageView77 = view.findViewById<ImageView>(R.id.IMG77)
        val imageView78 = view.findViewById<ImageView>(R.id.IMG78)
        val imageView79 = view.findViewById<ImageView>(R.id.IMG79)
        val imageView80 = view.findViewById<ImageView>(R.id.IMG80)



        bitmapToIMGView(requireContext(), imageView61, "intent1.png")
        bitmapToIMGView(requireContext(), imageView62, "intent2.png")
        bitmapToIMGView(requireContext(), imageView63, "intent3.png")
        bitmapToIMGView(requireContext(), imageView65, "intent5.png")
        bitmapToIMGView(requireContext(), imageView67, "intent7.png")
        bitmapToIMGView(requireContext(), imageView68, "intent8.png")
        bitmapToIMGView(requireContext(), imageView69, "intent9.png")
        bitmapToIMGView(requireContext(), imageView70, "intent10.png")
        bitmapToIMGView(requireContext(), imageView71, "buildFeatures.png")
        bitmapToIMGView(requireContext(), imageView72, "fragmenty1.png")
        bitmapToIMGView(requireContext(), imageView73, "fragmenty2.png")
        bitmapToIMGView(requireContext(), imageView74, "fragmenty3.png")
        bitmapToIMGView(requireContext(), imageView75, "fragmenty4.png")
        bitmapToIMGView(requireContext(), imageView76, "fragmenty5.png")
        bitmapToIMGView(requireContext(), imageView77, "fragmenty6.png")
        bitmapToIMGView(requireContext(), imageView78, "fragmenty7.png")
        bitmapToIMGView(requireContext(), imageView79, "fragmenty8.png")
        bitmapToIMGView(requireContext(), imageView80, "fragmenty9.png")


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
        val odnosnik1 = view?.findViewById<Button>(R.id.F6R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F6R2)
        val link_download = view?.findViewById<TextView>(R.id.link_download)

        val rozdzial1 = view?.findViewById<TextView>(R.id.F6R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F6R2T)


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


    }
}
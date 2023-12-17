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

class Fragment8 : Fragment() {

    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_8, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll7)
        setUpTableOfContentsLinks()

        val imageView184 = view.findViewById<ImageView>(R.id.IMG184)
        val imageView185 = view.findViewById<ImageView>(R.id.IMG185)
        val imageView186 = view.findViewById<ImageView>(R.id.IMG186)
        val imageView187 = view.findViewById<ImageView>(R.id.IMG187)
        val imageView188 = view.findViewById<ImageView>(R.id.IMG188)
        val imageView189 = view.findViewById<ImageView>(R.id.IMG189)
        val imageView190 = view.findViewById<ImageView>(R.id.IMG190)
        val imageView191 = view.findViewById<ImageView>(R.id.IMG191)
        val imageView192 = view.findViewById<ImageView>(R.id.IMG192)

        bitmapToIMGView(requireContext(), imageView184, "bind_1.png")
        bitmapToIMGView(requireContext(), imageView185, "bind_2.png")
        bitmapToIMGView(requireContext(), imageView186, "bind_3.png")
        bitmapToIMGView(requireContext(), imageView187, "bind_4.png")
        bitmapToIMGView(requireContext(), imageView188, "bind_5.png")
        bitmapToIMGView(requireContext(), imageView189, "bind_6.png")
        bitmapToIMGView(requireContext(), imageView190, "bind_7.png")
        bitmapToIMGView(requireContext(), imageView191, "bind_8.png")
        bitmapToIMGView(requireContext(), imageView192, "bind_9.png")

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

        val odnosnik1 = view?.findViewById<Button>(R.id.F7R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F7R2)


        val rozdzial1 = view?.findViewById<TextView>(R.id.F7R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F7R2T)



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
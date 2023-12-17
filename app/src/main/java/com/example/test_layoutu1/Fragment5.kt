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

class Fragment5 : Fragment() {

    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_5, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll4)
        setUpTableOfContentsLinks()

        val imageView48 = view.findViewById<ImageView>(R.id.IMG48)
        val imageView49 = view.findViewById<ImageView>(R.id.IMG49)
        val imageView50 = view.findViewById<ImageView>(R.id.IMG50)
        val imageView51 = view.findViewById<ImageView>(R.id.IMG51)
        val imageView52 = view.findViewById<ImageView>(R.id.IMG52)
        val imageView53 = view.findViewById<ImageView>(R.id.IMG53)
        val imageView54 = view.findViewById<ImageView>(R.id.IMG54)
        val imageView55 = view.findViewById<ImageView>(R.id.IMG55)
        val imageView56 = view.findViewById<ImageView>(R.id.IMG56)
        val imageView57 = view.findViewById<ImageView>(R.id.IMG57)
        val imageView58 = view.findViewById<ImageView>(R.id.IMG58)
        val imageView59 = view.findViewById<ImageView>(R.id.IMG59)
        val imageView60 = view.findViewById<ImageView>(R.id.IMG60)
        val imageView61 = view.findViewById<ImageView>(R.id.IMG61)


        bitmapToIMGView(requireContext(), imageView48, "manifest.png")
        bitmapToIMGView(requireContext(), imageView49, "themes.png")
        bitmapToIMGView(requireContext(), imageView50, "themes1.png")
        bitmapToIMGView(requireContext(), imageView51, "themes2.png")
        bitmapToIMGView(requireContext(), imageView52, "daynight.png")
        bitmapToIMGView(requireContext(), imageView53, "daynight1.png")
        bitmapToIMGView(requireContext(), imageView54, "edittext.png")
        bitmapToIMGView(requireContext(), imageView55, "tabela.png")
        bitmapToIMGView(requireContext(), imageView56, "hidekeyboard.png")
        bitmapToIMGView(requireContext(), imageView57, "vectorasset.png")
        bitmapToIMGView(requireContext(), imageView58, "ikona.png")
        bitmapToIMGView(requireContext(), imageView59, "ikona1.png")
        bitmapToIMGView(requireContext(), imageView60, "ikona3.png")
        bitmapToIMGView(requireContext(), imageView61, "ikona4.png")



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
        val odnosnik1 = view?.findViewById<Button>(R.id.F5R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F5R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F5R3)
        val link_download = view?.findViewById<TextView>(R.id.link_download)

        val rozdzial1 = view?.findViewById<TextView>(R.id.F5R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F5R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F5R3T)


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
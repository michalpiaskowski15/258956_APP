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

class Fragment14 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_14, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll13)
        setUpTableOfContentsLinks()

        val imageView143 = view.findViewById<ImageView>(R.id.IMG143)
        val imageView144 = view.findViewById<ImageView>(R.id.IMG144)
        val imageView145 = view.findViewById<ImageView>(R.id.IMG145)

        bitmapToIMGView(requireContext(), imageView143, "lab6_1.png")
        bitmapToIMGView(requireContext(), imageView144, "lab6_2.png")
        bitmapToIMGView(requireContext(), imageView145, "lab6_3.png")

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
        val odnosnik1 = view?.findViewById<Button>(R.id.F14R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F14R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F14R3)

        val link_download6 = view?.findViewById<TextView>(R.id.link_download6)
        link_download6?.movementMethod = LinkMovementMethod.getInstance()

        val link_download7 = view?.findViewById<TextView>(R.id.link_download7)
        link_download7?.movementMethod = LinkMovementMethod.getInstance()

        val link_download8 = view?.findViewById<TextView>(R.id.link_download8)
        link_download8?.movementMethod = LinkMovementMethod.getInstance()

        val link_download9 = view?.findViewById<TextView>(R.id.link_download9)
        link_download9?.movementMethod = LinkMovementMethod.getInstance()

        val link_download10 = view?.findViewById<TextView>(R.id.link_download10)
        link_download10?.movementMethod = LinkMovementMethod.getInstance()


        val rozdzial1 = view?.findViewById<TextView>(R.id.F14R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F14R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F14R3T)






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
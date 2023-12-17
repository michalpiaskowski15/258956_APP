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

class Fragment18 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_18, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll17)
        setUpTableOfContentsLinks()


        val imageView182 = view.findViewById<ImageView>(R.id.IMG182)
        val imageView183 = view.findViewById<ImageView>(R.id.IMG183)

        bitmapToIMGView(requireContext(), imageView182, "lab8_1.png")
        bitmapToIMGView(requireContext(), imageView183, "lab8_2.png")


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

        val odnosnik1 = view?.findViewById<Button>(R.id.F18R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F18R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F18R3)
        val odnosnik4 = view?.findViewById<Button>(R.id.F18R4)



        val rozdzial1 = view?.findViewById<TextView>(R.id.F18R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F18R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F18R3T)
        val rozdzial4 = view?.findViewById<TextView>(R.id.F18R4T)





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

        val link_download15 = view?.findViewById<TextView>(R.id.link_download15)
        link_download15?.movementMethod = LinkMovementMethod.getInstance()

        val link_download16 = view?.findViewById<TextView>(R.id.link_download16)
        link_download16?.movementMethod = LinkMovementMethod.getInstance()

        val link_download17 = view?.findViewById<TextView>(R.id.link_download17)
        link_download17?.movementMethod = LinkMovementMethod.getInstance()

        val link_download18 = view?.findViewById<TextView>(R.id.link_download18)
        link_download18?.movementMethod = LinkMovementMethod.getInstance()

        val link_download19 = view?.findViewById<TextView>(R.id.link_download19)
        link_download19?.movementMethod = LinkMovementMethod.getInstance()

        val link_download20 = view?.findViewById<TextView>(R.id.link_download20)
        link_download20?.movementMethod = LinkMovementMethod.getInstance()

        val link_download21 = view?.findViewById<TextView>(R.id.link_download21)
        link_download21?.movementMethod = LinkMovementMethod.getInstance()




    }
}
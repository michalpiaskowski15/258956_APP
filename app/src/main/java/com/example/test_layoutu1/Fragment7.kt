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

class Fragment7 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_7, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll6)
        setUpTableOfContentsLinks()

        val imageView81 = view.findViewById<ImageView>(R.id.IMG81)
        val imageView82 = view.findViewById<ImageView>(R.id.IMG82)
        val imageView83 = view.findViewById<ImageView>(R.id.IMG83)
        val imageView84 = view.findViewById<ImageView>(R.id.IMG84)
        val imageView85 = view.findViewById<ImageView>(R.id.IMG85)
        val imageView86 = view.findViewById<ImageView>(R.id.IMG86)
        val imageView87 = view.findViewById<ImageView>(R.id.IMG87)
        val imageView88 = view.findViewById<ImageView>(R.id.IMG88)
        val imageView89 = view.findViewById<ImageView>(R.id.IMG89)
        val imageView90 = view.findViewById<ImageView>(R.id.IMG90)
        val imageView91 = view.findViewById<ImageView>(R.id.IMG91)
        val imageView92 = view.findViewById<ImageView>(R.id.IMG92)
        val imageView93 = view.findViewById<ImageView>(R.id.IMG93)
        val imageView94 = view.findViewById<ImageView>(R.id.IMG94)
        val imageView95 = view.findViewById<ImageView>(R.id.IMG95)
        val imageView96 = view.findViewById<ImageView>(R.id.IMG96)
        val imageView97 = view.findViewById<ImageView>(R.id.IMG97)
        val imageView98 = view.findViewById<ImageView>(R.id.IMG98)
        val imageView99 = view.findViewById<ImageView>(R.id.IMG99)
        val imageView100 = view.findViewById<ImageView>(R.id.IMG100)
        val imageView101 = view.findViewById<ImageView>(R.id.IMG101)
        val imageView102 = view.findViewById<ImageView>(R.id.IMG102)

        bitmapToIMGView(requireContext(), imageView81, "nav1.png")
        bitmapToIMGView(requireContext(), imageView82, "nav2.png")
        bitmapToIMGView(requireContext(), imageView83, "nav3.png")
        bitmapToIMGView(requireContext(), imageView84, "nav4.png")
        bitmapToIMGView(requireContext(), imageView85, "nav5.png")
        bitmapToIMGView(requireContext(), imageView86, "nav6.png")
        bitmapToIMGView(requireContext(), imageView87, "nav7.png")
        bitmapToIMGView(requireContext(), imageView88, "nav8.png")
        bitmapToIMGView(requireContext(), imageView89, "nav9.png")
        bitmapToIMGView(requireContext(), imageView90, "nav10.png")
        bitmapToIMGView(requireContext(), imageView91, "nav11.png")
        bitmapToIMGView(requireContext(), imageView92, "nav12.png")
        bitmapToIMGView(requireContext(), imageView93, "nav13.png")
        bitmapToIMGView(requireContext(), imageView94, "nav14.png")
        bitmapToIMGView(requireContext(), imageView95, "nav15.png")
        bitmapToIMGView(requireContext(), imageView96, "nav16.png")
        bitmapToIMGView(requireContext(), imageView97, "nav17.png")
        bitmapToIMGView(requireContext(), imageView98, "nav18.png")
        bitmapToIMGView(requireContext(), imageView99, "nav19.png")
        bitmapToIMGView(requireContext(), imageView100, "nav20.png")
        bitmapToIMGView(requireContext(), imageView101, "nav21.png")
        bitmapToIMGView(requireContext(), imageView102, "nav22.png")




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
        val link_download2 = view?.findViewById<TextView>(R.id.link_download2)
        val link_download3 = view?.findViewById<TextView>(R.id.link_download3)

        val rozdzial1 = view?.findViewById<TextView>(R.id.F7R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F7R2T)



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


    }
}
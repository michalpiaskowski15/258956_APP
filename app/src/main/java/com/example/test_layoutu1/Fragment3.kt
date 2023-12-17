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

class Fragment3 : Fragment() {

    private lateinit var nestedScrollView: NestedScrollView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll2)
        setUpTableOfContentsLinks()

        val imageView21 = view.findViewById<ImageView>(R.id.IMG21)
        val imageView22 = view.findViewById<ImageView>(R.id.IMG22)
        val imageView23 = view.findViewById<ImageView>(R.id.IMG23)
        val imageView24 = view.findViewById<ImageView>(R.id.IMG24)
        val imageView25 = view.findViewById<ImageView>(R.id.IMG25)
        val imageView26 = view.findViewById<ImageView>(R.id.IMG26)
        val imageView27 = view.findViewById<ImageView>(R.id.IMG27)
        val imageView28 = view.findViewById<ImageView>(R.id.IMG28)
        val imageView29 = view.findViewById<ImageView>(R.id.IMG29)
        val imageView30 = view.findViewById<ImageView>(R.id.IMG30)

        bitmapToIMGView(requireContext(), imageView21, "usbdebug.png")
        bitmapToIMGView(requireContext(), imageView22, "physicaldev.png")
        bitmapToIMGView(requireContext(), imageView23, "createdevice.png")
        bitmapToIMGView(requireContext(), imageView24, "selectAVD.png")
        bitmapToIMGView(requireContext(), imageView25, "systemimage.png")
        bitmapToIMGView(requireContext(), imageView26, "avdconf.png")
        bitmapToIMGView(requireContext(), imageView27, "runAVD.png")
        bitmapToIMGView(requireContext(), imageView28, "emulator1.png")
        bitmapToIMGView(requireContext(), imageView29, "emulator2.png")
        bitmapToIMGView(requireContext(), imageView30, "extendedcontrols.png")

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
        val odnosnik1 = view?.findViewById<Button>(R.id.F3R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F3R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F3R3)
        val odnosnik3o = view?.findViewById<Button>(R.id.F3R3odnosnik)
        val link_download = view?.findViewById<TextView>(R.id.link_download)

        val rozdzial1 = view?.findViewById<TextView>(R.id.F3R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F3R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F3R3T)

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
        odnosnik3o?.setOnClickListener {
            nestedScrollView.post {
                if (rozdzial3 != null){nestedScrollView.smoothScrollTo(0, rozdzial3.top)}
            }
        }
    }

}
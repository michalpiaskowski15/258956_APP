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

class Fragment19 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_19, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll18)
        setUpTableOfContentsLinks()

        val imageView147 = view.findViewById<ImageView>(R.id.IMG147)
        val imageView148 = view.findViewById<ImageView>(R.id.IMG148)
        val imageView149 = view.findViewById<ImageView>(R.id.IMG149)
        val imageView150 = view.findViewById<ImageView>(R.id.IMG150)
        val imageView151 = view.findViewById<ImageView>(R.id.IMG151)
        val imageView152 = view.findViewById<ImageView>(R.id.IMG152)
        val imageView153 = view.findViewById<ImageView>(R.id.IMG153)
        val imageView154 = view.findViewById<ImageView>(R.id.IMG154)
        val imageView155 = view.findViewById<ImageView>(R.id.IMG155)
        val imageView156 = view.findViewById<ImageView>(R.id.IMG156)
        val imageView157 = view.findViewById<ImageView>(R.id.IMG157)
        val imageView158 = view.findViewById<ImageView>(R.id.IMG158)
        val imageView159 = view.findViewById<ImageView>(R.id.IMG159)
        val imageView160 = view.findViewById<ImageView>(R.id.IMG160)
        val imageView161 = view.findViewById<ImageView>(R.id.IMG161)
        val imageView162 = view.findViewById<ImageView>(R.id.IMG162)
        val imageView163 = view.findViewById<ImageView>(R.id.IMG163)
        val imageView164 = view.findViewById<ImageView>(R.id.IMG164)
        val imageView165 = view.findViewById<ImageView>(R.id.IMG165)

        val imageView178 = view.findViewById<ImageView>(R.id.IMG178)
        val imageView179 = view.findViewById<ImageView>(R.id.IMG179)
        val imageView180 = view.findViewById<ImageView>(R.id.IMG180)
        val imageView181 = view.findViewById<ImageView>(R.id.IMG181)

        val imageView166 = view.findViewById<ImageView>(R.id.IMG166)
        val imageView167 = view.findViewById<ImageView>(R.id.IMG167)
        val imageView168 = view.findViewById<ImageView>(R.id.IMG168)
        val imageView169 = view.findViewById<ImageView>(R.id.IMG169)
        val imageView170 = view.findViewById<ImageView>(R.id.IMG170)
        val imageView171 = view.findViewById<ImageView>(R.id.IMG171)
        val imageView172 = view.findViewById<ImageView>(R.id.IMG172)
        val imageView173 = view.findViewById<ImageView>(R.id.IMG173)
        val imageView174 = view.findViewById<ImageView>(R.id.IMG174)




        bitmapToIMGView(requireContext(), imageView147, "recyc_1.png")
        bitmapToIMGView(requireContext(), imageView148, "recyc_2.png")
        bitmapToIMGView(requireContext(), imageView149, "recyc_3.png")
        bitmapToIMGView(requireContext(), imageView150, "recyc_4.png")
        bitmapToIMGView(requireContext(), imageView151, "recyc_5.png")
        bitmapToIMGView(requireContext(), imageView152, "recyc_6.png")
        bitmapToIMGView(requireContext(), imageView153, "recyc_7.png")
        bitmapToIMGView(requireContext(), imageView154, "recyc_8.png")
        bitmapToIMGView(requireContext(), imageView155, "recyc_9.png")
        bitmapToIMGView(requireContext(), imageView156, "recyc_10.png")
        bitmapToIMGView(requireContext(), imageView157, "recyc_11.png")
        bitmapToIMGView(requireContext(), imageView158, "recyc_12.png")
        bitmapToIMGView(requireContext(), imageView159, "recyc_13.png")
        bitmapToIMGView(requireContext(), imageView160, "recyc_14.png")
        bitmapToIMGView(requireContext(), imageView161, "recyc_15.png")
        bitmapToIMGView(requireContext(), imageView162, "recyc_16.png")
        bitmapToIMGView(requireContext(), imageView163, "recyc_17.png")
        bitmapToIMGView(requireContext(), imageView164, "recyc_18.png")
        bitmapToIMGView(requireContext(), imageView165, "recyc_19.png")

        bitmapToIMGView(requireContext(), imageView178, "recyc_191.png")
        bitmapToIMGView(requireContext(), imageView179, "recyc_192.png")
        bitmapToIMGView(requireContext(), imageView180, "recyc_193.png")
        bitmapToIMGView(requireContext(), imageView181, "recyc_194.png")

        bitmapToIMGView(requireContext(), imageView166, "recyc_20.png")
        bitmapToIMGView(requireContext(), imageView167, "recyc_21.png")
        bitmapToIMGView(requireContext(), imageView168, "recyc_22.png")
        bitmapToIMGView(requireContext(), imageView169, "recyc_23.png")
        bitmapToIMGView(requireContext(), imageView170, "recyc_24.png")
        bitmapToIMGView(requireContext(), imageView171, "recyc_25.png")
        bitmapToIMGView(requireContext(), imageView172, "recyc_26.png")
        bitmapToIMGView(requireContext(), imageView173, "recyc_27.png")
        bitmapToIMGView(requireContext(), imageView174, "recyc_28.png")

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

        val odnosnik3b = view?.findViewById<Button>(R.id.F15R1O1)


        val link_download14 = view?.findViewById<TextView>(R.id.link_download14)
        link_download14?.movementMethod = LinkMovementMethod.getInstance()


        val odnosnik3o = view?.findViewById<TextView>(R.id.F14R1T)





        odnosnik3b?.setOnClickListener {
            nestedScrollView.post {
                val przejscie = requireActivity().supportFragmentManager.beginTransaction()
                przejscie.replace(R.id.fragment_container, Fragment14())
                przejscie.commit()
                if (odnosnik3o != null){nestedScrollView.smoothScrollTo(0, odnosnik3o.top)}
            }
        }

    }
}
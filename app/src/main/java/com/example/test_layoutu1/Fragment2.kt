package com.example.test_layoutu1

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.widget.NestedScrollView
import java.io.IOException
import java.io.InputStream
import com.github.chrisbanes.photoview.PhotoView

class Fragment2 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll1)
        setUpTableOfContentsLinks()
        val imageView1 = view.findViewById<ImageView>(R.id.IMG1)
        val imageView2 = view.findViewById<ImageView>(R.id.IMG2)
        val imageView3 = view.findViewById<ImageView>(R.id.IMG3)
        val imageView4 = view.findViewById<ImageView>(R.id.IMG4)
        val imageView5 = view.findViewById<ImageView>(R.id.IMG5)
        val imageView6 = view.findViewById<ImageView>(R.id.IMG6)
        val imageView7 = view.findViewById<ImageView>(R.id.IMG7)
        val imageView8 = view.findViewById<ImageView>(R.id.IMG8)
        val imageView9 = view.findViewById<ImageView>(R.id.IMG9)
        val imageView10 = view.findViewById<ImageView>(R.id.IMG10)
        val imageView11 = view.findViewById<ImageView>(R.id.IMG11)
        val imageView12 = view.findViewById<ImageView>(R.id.IMG12)
        val imageView13 = view.findViewById<ImageView>(R.id.IMG13)
        val imageView14 = view.findViewById<ImageView>(R.id.IMG14)
        val imageView15 = view.findViewById<ImageView>(R.id.IMG15)
        val imageView16 = view.findViewById<ImageView>(R.id.IMG16)
        val imageView17 = view.findViewById<ImageView>(R.id.IMG17)
        val imageView18 = view.findViewById<ImageView>(R.id.IMG18)
        val imageView19 = view.findViewById<ImageView>(R.id.IMG19)
        val imageView20 = view.findViewById<ImageView>(R.id.IMG20)
        val imageView0 = view.findViewById<ImageView>(R.id.IMG0)
        bitmapToIMGView(requireContext(), imageView1, "pobieranie.png")
        bitmapToIMGView(requireContext(), imageView2, "avd.png")
        bitmapToIMGView(requireContext(), imageView3, "importset.png")
        bitmapToIMGView(requireContext(), imageView4, "finish.png")
        bitmapToIMGView(requireContext(), imageView5, "welcome.png")
        bitmapToIMGView(requireContext(), imageView6, "customize.png")
        bitmapToIMGView(requireContext(), imageView7, "plugins1.png")
        bitmapToIMGView(requireContext(), imageView8, "plugins2.png")
        bitmapToIMGView(requireContext(), imageView9, "newproj.png")
        bitmapToIMGView(requireContext(), imageView10, "define.png")
        bitmapToIMGView(requireContext(), imageView11, "helpchoose.png")
        bitmapToIMGView(requireContext(), imageView12, "widokstart.png")
        bitmapToIMGView(requireContext(), imageView13, "codesplitdes.png")
        bitmapToIMGView(requireContext(), imageView14, "FILE.png")
        bitmapToIMGView(requireContext(), imageView15, "EDIT.png")
        bitmapToIMGView(requireContext(), imageView16, "VIEW.png")
        bitmapToIMGView(requireContext(), imageView17, "BUILD.png")
        bitmapToIMGView(requireContext(), imageView18, "RUN.png")
        bitmapToIMGView(requireContext(), imageView19, "TOOLS.png")
        bitmapToIMGView(requireContext(), imageView20, "profiler.png")
        bitmapToIMGView(requireContext(), imageView0, "resources.png")

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
        val odnosnik1 = view?.findViewById<Button>(R.id.F1R1)
        val odnosnik2 = view?.findViewById<Button>(R.id.F1R2)
        val odnosnik3 = view?.findViewById<Button>(R.id.F1R3)

        val link_download = view?.findViewById<TextView>(R.id.link_download)

        val rozdzial1 = view?.findViewById<TextView>(R.id.F1R1T)
        val rozdzial2 = view?.findViewById<TextView>(R.id.F1R2T)
        val rozdzial3 = view?.findViewById<TextView>(R.id.F1R3T)

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
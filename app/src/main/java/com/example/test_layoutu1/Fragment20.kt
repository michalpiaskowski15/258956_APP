package com.example.test_layoutu1

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
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

class Fragment20 : Fragment() {
    private lateinit var nestedScrollView: NestedScrollView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_20, container, false)
    }

    private var question1 = true
    private var question2 = true
    private var question3 = true
    private var question4 = true
    private var question5 = true
    private var question6 = true
    private var question7 = true
    private var question8 = true
    private var question9 = true
    private var question10 = true
    private var question11 = true
    private var question12 = true
    private var question13 = true
    private var question14 = true
    private var question15 = true
    private var question16 = true
    private var question17 = true
    private var question18 = true
    private var question19 = true
    private var question20 = true
    private var question21 = true
    private var question22 = true
    private var question23 = true
    private var question24 = true
    private var question25 = true
    private var question26 = true
    private var question27 = true
    private var question28 = true
    private var question29 = true
    private var question30 = true

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nestedScrollView = view.findViewById(R.id.scroll19)
        val questionTextView1: TextView = view.findViewById(R.id.questionTextView1)
        val questionTextView2: TextView = view.findViewById(R.id.questionTextView2)
        val questionTextView3: TextView = view.findViewById(R.id.questionTextView3)
        val questionTextView4: TextView = view.findViewById(R.id.questionTextView4)
        val questionTextView5: TextView = view.findViewById(R.id.questionTextView5)
        val questionTextView6: TextView = view.findViewById(R.id.questionTextView6)
        val questionTextView7: TextView = view.findViewById(R.id.questionTextView7)
        val questionTextView8: TextView = view.findViewById(R.id.questionTextView8)
        val questionTextView9: TextView = view.findViewById(R.id.questionTextView9)
        val questionTextView10: TextView = view.findViewById(R.id.questionTextView10)
        val questionTextView11: TextView = view.findViewById(R.id.questionTextView11)
        val questionTextView12: TextView = view.findViewById(R.id.questionTextView12)
        val questionTextView13: TextView = view.findViewById(R.id.questionTextView13)
        val questionTextView14: TextView = view.findViewById(R.id.questionTextView14)
        val questionTextView15: TextView = view.findViewById(R.id.questionTextView15)
        val questionTextView16: TextView = view.findViewById(R.id.questionTextView16)
        val questionTextView17: TextView = view.findViewById(R.id.questionTextView17)
        val questionTextView18: TextView = view.findViewById(R.id.questionTextView18)
        val questionTextView19: TextView = view.findViewById(R.id.questionTextView19)
        val questionTextView20: TextView = view.findViewById(R.id.questionTextView20)
        val questionTextView21: TextView = view.findViewById(R.id.questionTextView21)
        val questionTextView22: TextView = view.findViewById(R.id.questionTextView22)
        val questionTextView23: TextView = view.findViewById(R.id.questionTextView23)
        val questionTextView24: TextView = view.findViewById(R.id.questionTextView24)
        val questionTextView25: TextView = view.findViewById(R.id.questionTextView25)
        val questionTextView26: TextView = view.findViewById(R.id.questionTextView26)
        val questionTextView27: TextView = view.findViewById(R.id.questionTextView27)
        val questionTextView28: TextView = view.findViewById(R.id.questionTextView28)
        val questionTextView29: TextView = view.findViewById(R.id.questionTextView29)
        val questionTextView30: TextView = view.findViewById(R.id.questionTextView30)

        questionTextView1.setOnClickListener{
            if (!question1) {
                questionTextView1.text = "Okno projektu (Project Window)\n Edytor kodu (Editor)\n Pasek narzędzi (Toolbar)\n Okno logów (Logcat)\n Okno AVD Manager (Android Virtual Device Manager)"
                questionTextView1.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView1.text = "Które narzędzia są częścią interfejsu użytkownika Android Studio?"
                questionTextView1.setBackgroundColor(Color.BLUE)
            }
            question1 = !question1
        }
        questionTextView2.setOnClickListener{
            if (!question2) {
                questionTextView2.text = "Wybrać Create New Project, nadaćnazwę, wybrać minimalne SDK i ustawienia projektu, wybrać szablon"
                questionTextView2.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView2.text = "Jak można utworzyć nowy projekt w Android Studio?"
                questionTextView2.setBackgroundColor(Color.BLUE)
            }
            question2 = !question2
        }
        questionTextView3.setOnClickListener{
            if (!question3) {
                questionTextView3.text = "developer.android.com"
                questionTextView3.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView3.text = "Skąd można pobrać Android Studio?"
                questionTextView3.setBackgroundColor(Color.BLUE)
            }
            question3 = !question3
        }
        questionTextView4.setOnClickListener{
            if (!question4) {
                questionTextView4.text = "Empty Project"
                questionTextView4.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView4.text = "Jaki jest domyślny wzór projektu?"
                questionTextView4.setBackgroundColor(Color.BLUE)
            }
            question4 = !question4
        }
        questionTextView5.setOnClickListener{
            if (!question5) {
                questionTextView5.text = "Software Development Kit - zestaw bibliotek i narzędzi do projektowania aplikacji"
                questionTextView5.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView5.text = "Czym jest SDK?"
                questionTextView5.setBackgroundColor(Color.BLUE)
            }
            question5 = !question5
        }
        questionTextView6.setOnClickListener{
            if (!question6) {
                questionTextView6.text = "CODE, SPLIT, DESIGN"
                questionTextView6.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView6.text = "Jakie są 3 tryby programowania w Android Studio?"
                questionTextView6.setBackgroundColor(Color.BLUE)
            }
            question6 = !question6
        }
        questionTextView7.setOnClickListener{
            if (!question7) {
                questionTextView7.text = "Zakładka w której znajdziemy wyniki kompilacji"
                questionTextView7.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView7.text = "Czym jest zakładka BUILD?"
                questionTextView7.setBackgroundColor(Color.BLUE)
            }
            question7 = !question7
        }
        questionTextView8.setOnClickListener{
            if (!question8) {
                questionTextView8.text = "Służy do analizy wydajności aplikacji i symulowania jej pracy pod obciążeniem."
                questionTextView8.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView8.text = "Do czego służy profiler?"
                questionTextView8.setBackgroundColor(Color.BLUE)
            }
            question8 = !question8
        }
        questionTextView9.setOnClickListener{
            if (!question9) {
                questionTextView9.text = "Manifest, MainActivity, Drawable, Values, MipMap, Layout"
                questionTextView9.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView9.text = "Jakie znasz zasoby projektu w Android Studio?"
                questionTextView9.setBackgroundColor(Color.BLUE)
            }
            question9 = !question9
        }

        questionTextView10.setOnClickListener{
            if (!question10) {
                questionTextView10.text = "KOTLIN"
                questionTextView10.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView10.text = "Z jakiego języka domyślnie korzystamy?"
                questionTextView10.setBackgroundColor(Color.BLUE)
            }
            question10 = !question10
        }

        questionTextView11.setOnClickListener{
            if (!question11) {
                questionTextView11.text = "Symulacja różnych urządzeń, testowanie bez fizycznego sprzętu, debugowanie wielu wersji systemu "
                questionTextView11.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView11.text = "Jakie są zalety korzystania z emulatora w Android Studio?"
                questionTextView11.setBackgroundColor(Color.BLUE)
            }
            question11 = !question11
        }

        questionTextView12.setOnClickListener{
            if (!question12) {
                questionTextView12.text = "Otwórz AVD Manager, kliknij Create New Device, wybierz urządzenie i jego parametry, wybierz wersję systemu, kliknij FINISH "
                questionTextView12.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView12.text = "Jakie są kroki tworzenia wirtualnego urządzenia (emulatora) w Android Studio?"
                questionTextView12.setBackgroundColor(Color.BLUE)
            }
            question12 = !question12
        }
        questionTextView13.setOnClickListener{
            if (!question13) {
                questionTextView13.text = "Testowanie na fizycznym urządzeniu"
                questionTextView13.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView13.text = "Jakie są alternatywne sposoby testowania aplikacji, jeśli emulator działa wolno?"
                questionTextView13.setBackgroundColor(Color.BLUE)
            }
            question13 = !question13
        }
        questionTextView14.setOnClickListener{
            if (!question14) {
                questionTextView14.text = "LinearLayout, RelativeLayout, ConstraintLayout, FrameLayout, TableLayout"
                questionTextView14.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView14.text = "Jakie są główne rodzaje layoutów w Androidzie?"
                questionTextView14.setBackgroundColor(Color.BLUE)
            }
            question14 = !question14
        }

        questionTextView15.setOnClickListener{
            if (!question15) {
                questionTextView15.text = "Odpowiedź na pytanie"
                questionTextView15.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView15.text = "Pokaż pytanie"
                questionTextView15.setBackgroundColor(Color.BLUE)
            }
            question15 = !question15
        }

        questionTextView16.setOnClickListener{
            if (!question16) {
                questionTextView16.text = "Elementy rozmieszczone są wzdłuż jednego z dwóch wymiarów (poziomo lub pionowo)"
                questionTextView16.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView16.text = "W jaki sposób Linear Layout rozmieszcza elementy podrzędne?"
                questionTextView16.setBackgroundColor(Color.BLUE)
            }
            question16 = !question16
        }

        questionTextView17.setOnClickListener{
            if (!question17) {
                questionTextView17.text = "Layout oparty na zależnościach i zakotwiczaniu, pozwala na definiowanie relacji między elementami, co daje większą elastyczność"
                questionTextView17.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView17.text = "Co to jest Constraint Layout i jakie ma zalety w porównaniu z innymi rodzajami layoutów?"
                questionTextView17.setBackgroundColor(Color.BLUE)
            }
            question17 = !question17
        }

        questionTextView18.setOnClickListener{
            if (!question18) {
                questionTextView18.text = "Pozwala na definiowanie relacji między elementami, bazując na ich wzajemnym położeniu."
                questionTextView18.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView18.text = "W jaki sposób RelativeLayout definiuje relacje między elementami interfejsu użytkownika?"
                questionTextView18.setBackgroundColor(Color.BLUE)
            }
            question18 = !question18
        }

        questionTextView19.setOnClickListener{
            if (!question19) {
                questionTextView19.text = "Kiedy chcesz nałożyć jedno na drugie kilka widoków, np. do tworzenia stosu warstw."
                questionTextView19.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView19.text = "Kiedy warto użyć FrameLayout?"
                questionTextView19.setBackgroundColor(Color.BLUE)
            }
            question19 = !question19
        }

        questionTextView20.setOnClickListener{
            if (!question20) {
                questionTextView20.text = "Informacje o aplikacji, np. nazwa pakietu, komponenty aplikacji, uprawnienia"
                questionTextView20.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView20.text = "Co zawiera plik manifestu w Androidzie?"
                questionTextView20.setBackgroundColor(Color.BLUE)
            }
            question20 = !question20
        }

        questionTextView21.setOnClickListener{
            if (!question21) {
                questionTextView21.text = "Atrybuty do definiowania wyglądu i zachowania elementów UI, np. android:textColor, android:layout_width"
                questionTextView21.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView21.text = "Jakie są podstawowe atrybuty dla elementów interfejsu użytkownika w plikach XML?"
                questionTextView21.setBackgroundColor(Color.BLUE)
            }
            question21 = !question21
        }

        questionTextView22.setOnClickListener{
            if (!question22) {
                questionTextView22.text = "android:textColor=\u0022@color/nazwa_koloru\u0022"
                questionTextView22.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView22.text = "Jak można ustawić kolor tekstu dla przycisku w kodzie XML?"
                questionTextView22.setBackgroundColor(Color.BLUE)
            }
            question22 = !question22
        }

        questionTextView23.setOnClickListener{
            if (!question23) {
                questionTextView23.text = "Służą do przekazywania danych między komponentami aplikacji."
                questionTextView23.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView23.text = "Co to są intencje w Androidzie i jak są używane?"
                questionTextView23.setBackgroundColor(Color.BLUE)
            }
            question23 = !question23
        }

        questionTextView24.setOnClickListener{
            if (!question24) {
                questionTextView24.text = "Fragmenty są częściami interfejsu użytkownika w aplikacji, które można dynamicznie zamieniać."
                questionTextView24.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView24.text = "Co to są fragmenty i dlaczego są używane w Androidzie?"
                questionTextView24.setBackgroundColor(Color.BLUE)
            }
            question24 = !question24
        }

        questionTextView25.setOnClickListener{
            if (!question25) {
                questionTextView25.text = "Poprzez tworzenie plików XML, definiowanie akcji i celów nawigacyjnych."
                questionTextView25.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView25.text = "Jak można utworzyć nawigację między ekranami w Android Studio?"
                questionTextView25.setBackgroundColor(Color.BLUE)
            }
            question25 = !question25
        }
        questionTextView26.setOnClickListener{
            if (!question26) {
                questionTextView26.text = "Poprzez aktywność, wykorzystując interfejsy lub ViewModel"
                questionTextView26.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView26.text = "Jak można komunikować się między fragmentami w jednej aktywności?"
                questionTextView26.setBackgroundColor(Color.BLUE)
            }
            question26 = !question26
        }
        questionTextView27.setOnClickListener{
            if (!question27) {
                questionTextView27.text = "Dodać odpowiednie zależności w gradle, w pierwszym fragmencie, skąd chcesz przekazać dane, użyj NavDirections do nawigacji do kolejnego fragmentu i przekaż argumenty za pomocą Safe Args"
                questionTextView27.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView27.text = "Jak można przekazać dane między ekranami za pomocą Safe Args?"
                questionTextView27.setBackgroundColor(Color.BLUE)
            }
            question27 = !question27
        }
        questionTextView28.setOnClickListener{
            if (!question28) {
                questionTextView28.text = "Wywołaj akcje nawigacyjne w kodzie, aby przenieść się między ekranami"
                questionTextView28.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView28.text = "Jak można nawigować w aplikacji za pomocą akcji nawigacyjnych?"
                questionTextView28.setBackgroundColor(Color.BLUE)
            }
            question28 = !question28
        }
        questionTextView29.setOnClickListener{
            if (!question29) {
                questionTextView29.text = "Pozwala na bezpośrednie powiązanie danych modelu z elementami interfejsu"
                questionTextView29.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView29.text = "Co to jest bindowanie akcji (data binding) w Androidzie?"
                questionTextView29.setBackgroundColor(Color.BLUE)
            }
            question29 = !question29
        }
        questionTextView30.setOnClickListener{
            if (!question30) {
                questionTextView30.text = "To widok do wyświetlania dużych zestawów danych, umożliwiający efektywne wyświetlanie list i siatek"
                questionTextView30.setBackgroundColor(Color.GREEN)
            } else {
                questionTextView30.text = "Co to jest RecyclerView i w jaki sposób się go używa?"
                questionTextView30.setBackgroundColor(Color.BLUE)
            }
            question30 = !question30
        }

    }


}


package com.example.test_layoutu1

import android.content.Context
import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.inputmethod.EditorInfo
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.textfield.TextInputEditText


class Fragment1 : Fragment() {

    private lateinit var wprowadzonytekst: TextInputEditText
    private lateinit var listarozdzialow: ListView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        wprowadzonytekst = view.findViewById(R.id.searchbar)
        listarozdzialow = view.findViewById(R.id.searchresults)
        val buttonsearch = view.findViewById<Button>(R.id.buttonSearch)
        buttonsearch.setOnClickListener {
            val wprowadzonyTag = wprowadzonytekst.text.toString().lowercase()
            val rozdzialyztagiem = wyszukajPoTagu(wprowadzonyTag)
            wyswietlWyniki(rozdzialyztagiem)
        }
        return view
    }
    private fun wyszukajPoTagu(label: String): List<String> {
        val tagi = mapOf(
            "Pierwsze kroki" to listOf("instalacja", "pobieranie", "projekt", "sdk", "interfejs", "wskazówki","wskazowki", "pluginy", "todo", "build", "logcat", "problemy", "profiler", "zasoby"),
            "Emulator" to listOf("emulator", "avd", "tworzenie", "fizyczny", "debugowanie", "usb", "praca", "konfiguracja", "urządzenie wirtualne", "symulator", "virtual device", "debug", "komunikacja", "wirtualny emulator", "testowanie", "urządzenie", "symulacja"),
            "Layouty" to listOf("layout", "linear", "constraint", "relative", "frame", "praca z layoutami", "elementy ui", "table", "projektowanie ui", "grid", "scroll", "nested", "margin", "padding", "widżety", "rozmieszczenie", "wielkość", "grupowanie"),
            "UI, Atrybuty" to listOf("manifest", "xml", "plik manifestu", "pliki xml", "zasoby", "stylowanie ui", "przewodnik", "deklaracja", "konfiguracja", "rozszerzenia", "atrybuty", "definicje", "rozmiar", "kolor", "animacje", "dostosowywanie", "theme", "layout", "drawable"),
            "Intencje, Fragmenty" to listOf("intencje", "fragmenty", "tworzenie", "obsługa", "przekazywanie danych", "zarządzanie fragmentami", "transakcje fragmentów", "komunikacja między fragmentami", "życie fragmentów", "przejścia między ekranami", "argumenty fragmentów"),
            "Nawigacja" to listOf("nawigacja", "tworzenie nawigacji", "destynacje", "akcje nawigacyjne", "argumenty nawigacji", "safe args", "obsługa safe args", "bezpieczne przekazywanie argumentów", "plugin safe args", "generowanie argumentów"),
            "Bindowanie akcji, logika" to listOf("bindowanie akcji", "logika aplikacji", "zdarzenia przycisków", "obsługa kliknięć", "funkcje obsługi zdarzeń", "implementacja logiki", "kontrolery", "listenerzy", "obsługa interakcji", "akcje użytkownika"),
            "Recycler View" to listOf("recyclerview", "tworzenie recyclerview", "adapter", "layoutmanager", "pogląd listy", "przewijanie", "obsługa danych", "zarządzanie widokami", "animacje", "praca z listami", "optimizacja", "interakcje użytkownika"),
            "Laboratoria" to listOf("wskazowki","lab 1", "lab1", "laboratorium 1", "lab 2", "lab2", "laboratorium 2", "lab 3", "lab3", "laboratorium 3", "lab 4", "lab4", "laboratorium 4", "lab 5", "lab5", "laboratorium 5", "lab 6", "lab6", "laboratorium 6", "lab 7", "lab7", "laboratorium 7", "lab 8", "lab8", "laboratorium 8", "zadania", "wskazówki", "przewodnik"),
            "Sprawdź się!" to listOf("wskazowki","wskazówki", "fiszki", "nauka", "edukacja", "pamięć", "kartki z fiszkami", "materiały edukacyjne", "narzędzie nauki", "techniki nauki", "uczenie się", "powtórka")

        )
        val rozdzialyztagiem = mutableListOf<String>()
        tagi.forEach { (rozdzialy, tagi) ->
            if (tagi.contains(label)) {
                rozdzialyztagiem.add(rozdzialy)
            }
        }
        return rozdzialyztagiem
    }
    private fun wyswietlWyniki(rozdzialy: List<String>) {
        val dopasowanie = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, rozdzialy)
        listarozdzialow.adapter = dopasowanie
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageViewIkona = view.findViewById<ImageView>(R.id.ikona_ksiazki)

        val animate = AnimationUtils.loadAnimation(context, R.anim.animation)

        if (imageViewIkona != null) {
            imageViewIkona.startAnimation(animate)
        }
    }

}
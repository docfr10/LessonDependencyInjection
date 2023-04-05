package com.example.lesson_dependency_injection.example1

import android.util.Log

class SpanishPerson(val englishPerson: EnglishPerson) {
    fun speakSpanish() {
        Log.i("SpanishPerson", "Despacito senor")
    }
}
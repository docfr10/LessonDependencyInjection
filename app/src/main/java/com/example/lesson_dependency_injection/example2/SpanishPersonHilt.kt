package com.example.lesson_dependency_injection.example2

import android.util.Log
import javax.inject.Inject

class SpanishPersonHilt @Inject constructor(val englishPersonHilt: EnglishPersonHilt) {
    fun speakSpanish() {
        Log.i("SpanishPerson", "Despacito senor")
    }
}
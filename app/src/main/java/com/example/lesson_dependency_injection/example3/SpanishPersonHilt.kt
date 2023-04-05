package com.example.lesson_dependency_injection.example3

import android.util.Log
import javax.inject.Inject

class SpanishPersonHilt @Inject constructor() : Person {
    override fun speakLanguage() {
        Log.i("SpanishPerson", "Despacito senor")
    }
}
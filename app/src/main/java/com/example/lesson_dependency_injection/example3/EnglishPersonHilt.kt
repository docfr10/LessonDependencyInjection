package com.example.lesson_dependency_injection.example3

import android.util.Log
import javax.inject.Inject

class EnglishPersonHilt @Inject constructor() : Person {
    override fun speakLanguage() {
        Log.i("EnglishPerson", "Hello kind sir.")
    }
}
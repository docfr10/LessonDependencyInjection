package com.example.lesson_dependency_injection.example2

import android.util.Log
import javax.inject.Inject

class EnglishPersonHilt @Inject constructor(){
    fun speakEnglish() {
        Log.i("EnglishPerson", "Hello kind sir.")
    }
}
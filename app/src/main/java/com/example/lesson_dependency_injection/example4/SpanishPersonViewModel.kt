package com.example.lesson_dependency_injection.example4

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SpanishPersonViewModel @Inject constructor() : ViewModel() {
    fun speakSpanish() {
        Log.i("SpanishPerson", "Despacito senor")
    }
}
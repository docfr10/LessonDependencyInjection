package com.example.lesson_dependency_injection.example4

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EnglishPersonViewModel @Inject constructor() : ViewModel() {
    fun speakEnglish() {
        Log.i("EnglishPerson", "Hello kind sir.")
    }
}
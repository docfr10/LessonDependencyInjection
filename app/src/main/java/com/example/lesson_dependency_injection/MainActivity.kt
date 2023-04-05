package com.example.lesson_dependency_injection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lesson_dependency_injection.example1.EnglishPerson
import com.example.lesson_dependency_injection.example1.SpanishPerson
import com.example.lesson_dependency_injection.ui.theme.LessonDependencyInjectionTheme

class MainActivity : ComponentActivity() {
    // Example 1
    private lateinit var spanishPerson: SpanishPerson
    private lateinit var englishPerson: EnglishPerson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LessonDependencyInjectionTheme {
                // Example 1
                englishPerson = EnglishPerson()
                spanishPerson = SpanishPerson(englishPerson)
                spanishPerson.speakSpanish()
                spanishPerson.englishPerson.speakEnglish()
            }
        }
    }
}
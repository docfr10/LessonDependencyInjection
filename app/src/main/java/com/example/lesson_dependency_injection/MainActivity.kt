package com.example.lesson_dependency_injection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lesson_dependency_injection.example1.EnglishPerson
import com.example.lesson_dependency_injection.example1.SpanishPerson
import com.example.lesson_dependency_injection.example2.EnglishPersonHilt
import com.example.lesson_dependency_injection.example2.SpanishPersonHilt
import com.example.lesson_dependency_injection.ui.theme.LessonDependencyInjectionTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    // Example 1
    private lateinit var spanishPerson: SpanishPerson
    private lateinit var englishPerson: EnglishPerson

    // Example 2
    @Inject
    lateinit var englishPersonHilt: EnglishPersonHilt

    @Inject
    lateinit var spanishPersonHilt: SpanishPersonHilt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LessonDependencyInjectionTheme {
                // Example 1
                // englishPerson = EnglishPerson()
                // spanishPerson = SpanishPerson(englishPerson)
                // spanishPerson.speakSpanish()
                // spanishPerson.englishPerson.speakEnglish()
                // Example 2
                englishPersonHilt.speakEnglish()
                spanishPersonHilt.speakSpanish()
                spanishPersonHilt.englishPersonHilt.speakEnglish()
            }
        }
    }
}
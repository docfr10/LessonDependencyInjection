package com.example.lesson_dependency_injection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.lesson_dependency_injection.example1.EnglishPerson
import com.example.lesson_dependency_injection.example1.SpanishPerson
import com.example.lesson_dependency_injection.example2.EnglishPersonHilt
import com.example.lesson_dependency_injection.example2.SpanishPersonHilt
import com.example.lesson_dependency_injection.example3.EnglishQualifier
import com.example.lesson_dependency_injection.example3.Person
import com.example.lesson_dependency_injection.example3.SpanishQualifier
import com.example.lesson_dependency_injection.example4.EnglishPersonViewModel
import com.example.lesson_dependency_injection.example4.SpanishPersonViewModel
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
    lateinit var englishPersonHilt1: EnglishPersonHilt

    @Inject
    lateinit var spanishPersonHilt1: SpanishPersonHilt

    // Example 3
    @EnglishQualifier
    @Inject
    lateinit var englishPersonHilt2: Person

    @SpanishQualifier
    @Inject
    lateinit var spanishPersonHilt2: Person

    // Example 4
    private val englishPersonViewModel: EnglishPersonViewModel by viewModels()
    private val spanishPersonViewModel: SpanishPersonViewModel by viewModels()

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
                // englishPersonHilt1.speakEnglish()
                // spanishPersonHilt1.speakSpanish()
                // spanishPersonHilt1.englishPersonHilt.speakEnglish()

                // Example 3
                // englishPersonHilt2.speakLanguage()
                // spanishPersonHilt2.speakLanguage()

                // Example 4
                // englishPersonViewModel.speakEnglish()
                // spanishPersonViewModel.speakSpanish()
            }
        }
    }
}
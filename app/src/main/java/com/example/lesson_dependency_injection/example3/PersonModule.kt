package com.example.lesson_dependency_injection.example3

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
abstract class PersonModule {
    @EnglishQualifier
    @Binds
    abstract fun EnglishPersonImpl(englishPersonHilt: EnglishPersonHilt): Person

    @SpanishQualifier
    @Binds
    abstract fun SpanishPersonImpl(spanishPersonHilt: SpanishPersonHilt): Person
}

@Qualifier
annotation class EnglishQualifier

@Qualifier
annotation class SpanishQualifier
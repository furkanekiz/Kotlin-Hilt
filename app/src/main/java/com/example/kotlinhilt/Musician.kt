package com.example.kotlinhilt

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped //Component Scopes in Dependency Injection -https://developer.android.com/training/dependency-injection/hilt-android?hl=en#component-scopes
class Musician
@Inject constructor(instrument: Instrument, band: Band) { //Constructor Injection

    fun sign() {
        println("Working...")
    }
}



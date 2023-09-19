package com.example.kotlinhilt

import javax.inject.Inject

//Constructor Injection
class Musician
@Inject constructor(instrument: Instrument, band: Band) {

    fun sign() {
        println("Working...")
    }
}



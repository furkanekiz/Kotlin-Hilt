package com.example.kotlinhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var lars: Musician

    @Inject
    lateinit var myClass: ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var instrument = Instrument()
        val band = Band()
        val james = Musician(instrument, band)
        james.sign()
        */

        lars.sign()

        println(myClass.myFunction())
        println(myClass.secondFunction())
    }
}

@AndroidEntryPoint
class FragmentExample() : Fragment() {
    @Inject
    lateinit var kirk: Musician
}
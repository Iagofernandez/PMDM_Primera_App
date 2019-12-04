package com.example.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d( "HolaQueAse","Esto es OnCreate")
        button.setOnClickListener{
            textoRyder.setText("CJ, you are a busta")
        }


    }



    override fun onStart() {
        super.onStart()
        Log.d("HolaQueAse", "Esto es onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d( "HolaQueAse", "Estoy en onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("HolaQueAse", "Esto es onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("HolaQueAse", " Esto es onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("HolaQueAse", "Esto es onDestroy")
    }



}

package com.squall.gitforandroiddeveloper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println("Change 4")

        println("This line will be merged")
        println("Hello From your friend")
    }
}
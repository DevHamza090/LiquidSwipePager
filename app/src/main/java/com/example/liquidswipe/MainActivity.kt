package com.example.liquidswipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swipe.liquid_pager.LiquidPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pager = findViewById<LiquidPager>(R.id.pager)
        pager.adapter = Adapter(supportFragmentManager)
    }
}
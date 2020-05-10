package com.eihror.navigationtab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var navTabBar: NavTabBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navTabBar = NavTabBar(this@MainActivity)
        navTabBar.setupNavTabBar()
    }
    
}

package com.eihror.navigationtab

import android.app.Activity
import androidx.appcompat.widget.AppCompatTextView
import androidx.navigation.NavController
import androidx.navigation.findNavController

class NavTabBar(private val activity: Activity) {

    private lateinit var navController: NavController

    fun setupNavTabBar() {
        navController = activity.findNavController(R.id.fragment_nav_host)

        val buttonA: AppCompatTextView = activity.findViewById(R.id.button_screen_a)
        val buttonB: AppCompatTextView = activity.findViewById(R.id.button_screen_b)
        val buttonC: AppCompatTextView = activity.findViewById(R.id.button_screen_c)
        val buttonD: AppCompatTextView = activity.findViewById(R.id.button_screen_d)

        buttonA.setOnClickListener { navController.navigate(R.id.toScreenA) }
        buttonB.setOnClickListener { navController.navigate(R.id.toScreenB) }
        buttonC.setOnClickListener { navController.navigate(R.id.toScreenC) }
        buttonD.setOnClickListener { navController.navigate(R.id.toScreenD) }

    }

}
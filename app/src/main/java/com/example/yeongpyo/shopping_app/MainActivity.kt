package com.example.yeongpyo.shopping_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Toggle : ActionBarDrawerToggle = ActionBarDrawerToggle(this,drawerlayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        drawerlayout.setDrawerListener(Toggle)
        Toggle.syncState()

    }
}

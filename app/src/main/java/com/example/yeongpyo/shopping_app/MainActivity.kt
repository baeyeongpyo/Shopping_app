package com.example.yeongpyo.shopping_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import com.example.yeongpyo.shopping_app.Categroy_DB.Category_Main
import kotlinx.android.synthetic.main.main_layout.*
import kotlinx.android.synthetic.main.navi_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        var Toggle : ActionBarDrawerToggle = ActionBarDrawerToggle(this,drawerlayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        drawerlayout.setDrawerListener(Toggle)
        Toggle.syncState()

        expanablelistview.setAdapter(Shopping_category_adapter(Category_Main().Category_Total()))



    }
}

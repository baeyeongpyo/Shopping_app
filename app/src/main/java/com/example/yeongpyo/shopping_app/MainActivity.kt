package com.example.yeongpyo.shopping_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.example.yeongpyo.shopping_app.Categroy_DB.Category_Main
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.main_layout.*
import kotlinx.android.synthetic.main.main_layout_inside.*
import kotlinx.android.synthetic.main.navi_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        ActionBarDrawerToggle(this,drawerlayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close).let {
            drawerlayout.addDrawerListener(it)
            it.syncState()
        }

        expanablelistview.setAdapter(Shopping_category_adapter(Category_Main().Category_Total()))

        Observable.create<String>{ onSubscribe ->
            onSubscribe.onNext( "aaaaaaa")}
                .subscribeOn(Schedulers.newThread())
                .subscribe(
                         {Hellow_Text.text = it})

    }
}

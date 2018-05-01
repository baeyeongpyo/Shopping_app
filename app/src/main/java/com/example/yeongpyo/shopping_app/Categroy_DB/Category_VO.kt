package com.example.yeongpyo.shopping_app.Categroy_DB

import android.databinding.ObservableField
import com.example.yeongpyo.shopping_app.R

class Category_VO(Category: String) {

    var img : ObservableField<Int> = ObservableField(R.drawable.ic_add_circle_outline_black_18dp)
    var Category: ObservableField<String> = ObservableField(Category)

    constructor(img : Int, Category: String) : this(Category) {
        this.img = ObservableField(img)
    }


}
package com.example.yeongpyo.shopping_app;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

public class BindingCustom {

    @BindingAdapter({"bind:imgres"})
    public static void imgload(ImageView imageView, int resID) {
        imageView.setImageResource(resID);
    }
}

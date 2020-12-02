package com.app.customtoastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.app.toasterlib.MyToast

class MainActivity : AppCompatActivity() {

    var mToast: MyToast?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mToast = MyToast(this@MainActivity)
    }

    fun itemClick(view: View) {
        mToast?.showNormalToast("Hello My Lib Toast")
    }
}
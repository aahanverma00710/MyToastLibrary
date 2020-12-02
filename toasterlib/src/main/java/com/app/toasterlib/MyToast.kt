package com.app.toasterlib

import android.content.Context
import android.widget.Toast

class MyToast(val mContext: Context) {

    fun showNormalToast(message: String) {
        Toast.makeText(mContext!!, message, Toast.LENGTH_SHORT).show()
    }
}
package com.demo.commom

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.widget.Toast

/**
 * @Author : liumeng
 * @Date : 7/1/21
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */

fun String.toast(context: Context) {
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
}

object MUtils {
     var context: Context? = null
}
package com.demo.cpp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.blankj.utilcode.util.ToastUtils
import com.demo.commom.IMainAction
import com.demo.commom.MUtils
import com.demo.commom.toast
import com.demo.copyapp.R

/**
 * @Author : liumeng
 * @Date : 7/1/21
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */
class CppMainActionImpl : IMainAction {
    override fun onMainCreate(savedInstanceState: Bundle?) {
    }

    override fun onMainResume() {
        MUtils.context?.let { "CPP onMainResume".toast(it) }

    }

    override fun onMainStop() {
    }


    override fun onRedButton(view: View): Boolean {
        "Cpp button click".toast(view.context)
        val findViewById = (view.context as Activity).findViewById<TextView>(R.id.info)
        findViewById.text = "我是CPP，我没有拦截了RedButtonClick"
        return false
    }

    override fun onYellowButtonClick(view: View) {

    }

}
package com.demo.bpp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.blankj.utilcode.util.ToastUtils
import com.demo.commom.IMainAction
import com.demo.commom.toast
import com.demo.copyapp.R

/**
 * @Author : liumeng
 * @Date : 7/1/21
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */
class BppMainActionImpl : IMainAction {
    override fun onYellowButtonClick(view: View) {

    }

    override fun onMainCreate(savedInstanceState: Bundle?) {
    }

    override fun onMainResume() {
        //ToastUtils.showShort("BPP onMainResume")

    }

    override fun onMainStop() {
    }


    override fun onRedButton(view: View): Boolean {
        val findViewById = (view.context as Activity).findViewById<TextView>(R.id.info)
        findViewById.text = "我是BPP，我拦截了RedButtonClick"
        return true
    }

}
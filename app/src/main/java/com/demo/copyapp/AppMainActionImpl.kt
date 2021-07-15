package com.demo.copyapp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.demo.commom.IMainAction
import com.demo.commom.toast

/**
 * @Author : liumeng
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */
class AppMainActionImpl : IMainAction {
    override fun onMainCreate(savedInstanceState: Bundle?) {
    }

    override fun onMainResume() {
        // ToastUtils.showShort("BPP onMainResume")

    }

    override fun onMainStop() {
    }


    override fun onRedButton(view: View): Boolean {

        return false
    }

    override fun onYellowButtonClick(view: View) {

    }
}
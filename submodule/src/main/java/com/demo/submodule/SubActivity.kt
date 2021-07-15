package com.demo.submodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demo.commom.ISubAction
import com.demo.commom.RegisterAction

/**
 * @Author : liumeng
 * @Date : 7/1/21
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */
class SubActivity : AppCompatActivity() {
    private val iSubAction: ISubAction? = RegisterAction.iSubAction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iSubAction?.onMainCreate(savedInstanceState)
        setContentView(R.layout.sub_activity)
    }

    override fun onResume() {
        super.onResume()
        iSubAction?.onMainResume()
    }
}
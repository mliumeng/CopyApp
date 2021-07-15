package com.demo.copyapp

import androidx.core.content.FileProvider
import com.demo.commom.RegisterAction
import com.demo.subbpp.SubBppActionImpl
import com.demo.submodule.SubActivity
import com.demo.submodule.SubAppActionImpl

/**
 * @Author : liumeng
 * @Date : 7/1/21
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */
class AppActionRegister : FileProvider() {
    override fun onCreate(): Boolean {
        RegisterAction.register(AppMainActionImpl())
        RegisterAction.register(SubAppActionImpl())
        test()
        return super.onCreate()
    }

    private fun test(){
        println("test")
    }
}
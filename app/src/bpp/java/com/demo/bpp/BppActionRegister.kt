package com.demo.bpp

import androidx.core.content.FileProvider
import com.demo.commom.RegisterAction
import com.demo.subbpp.SubBppActionImpl

/**
 * @Author : liumeng
 * @Date : 7/1/21
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */
class BppActionRegister : FileProvider() {
    override fun onCreate(): Boolean {
        RegisterAction.register(BppMainActionImpl())
        RegisterAction.register(SubBppActionImpl())
        return super.onCreate()

    }
}
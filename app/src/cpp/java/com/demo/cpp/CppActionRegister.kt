package com.demo.cpp

import android.content.Context
import android.content.pm.ProviderInfo
import androidx.core.content.FileProvider
import com.demo.commom.BaseRegister
import com.demo.commom.MUtils
import com.demo.commom.RegisterAction
import com.demo.subbpp.SubBppActionImpl

/**
 * @Author : liumeng
 * @Date : 7/1/21
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */
class CppActionRegister : BaseRegister() {

    override fun onCreate(): Boolean {
        MUtils.context = context
        RegisterAction.register(CppMainActionImpl())
         return super.onCreate()

    }
}
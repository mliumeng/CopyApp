package com.demo.commom

import androidx.core.content.FileProvider

/**
 * @Author : liumeng
 * @Date : 7/8/21
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */
open class BaseRegister : FileProvider() {
    override fun onCreate(): Boolean {
        return super.onCreate()
    }
}
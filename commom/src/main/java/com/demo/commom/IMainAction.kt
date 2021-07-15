package com.demo.commom

import android.content.Intent
import android.os.Bundle
import android.view.View

/**
 * @Author : liumeng
 * @Date : 7/1/21
 * Copyright (c) 2020 https://www.qutoutiao.net. All rights reserved.
 */

object RegisterAction {
    var iMainAction: IMainAction? = null
    fun register(iMainAction: IMainAction) {
        this.iMainAction = iMainAction
    }

    var iSubAction: ISubAction? = null
    fun register(iSubAction: ISubAction) {
        this.iSubAction = iSubAction
    }

    fun register(clazz: Class<IAction>){

    }
}

interface ISubAction:IAction {
    fun onMainCreate(savedInstanceState: Bundle?)
    fun onMainResume()
    fun onMainStop()
    fun onButtonClick(view: View)
}

interface IMainAction:IAction {
    fun onMainCreate(savedInstanceState: Bundle?)
    fun onMainResume()
    fun onMainStop()
    fun onRedButton(view: View):Boolean
    fun onYellowButtonClick(view: View)
}

interface IAction{

}
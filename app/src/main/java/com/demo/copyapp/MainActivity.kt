package com.demo.copyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.demo.commom.IMainAction
import com.demo.commom.RegisterAction
import com.demo.commom.toast

class MainActivity : AppCompatActivity() {
    private var iMainAction: IMainAction? = null
    private lateinit var redButton: Button
    private lateinit var yellowButton: Button
    private lateinit var greenButton: Button
    private lateinit var infoText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iMainAction = RegisterAction.iMainAction
        iMainAction?.onMainCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redButton = findViewById(R.id.redButton)
        yellowButton = findViewById(R.id.yellowButton)
        greenButton = findViewById(R.id.greenButton)
        infoText = findViewById(R.id.info)

        redButton.setOnClickListener {
            redButtonClick(it)
        }

        greenButton.setOnClickListener {
            onGreenButtonClick(it)
        }

        yellowButton.setOnClickListener {
            yellowButtonClick(it)
        }
    }

    private fun onGreenButtonClick(it: View?) {
        infoText.text = "这个按钮三个马甲包点击都展示这个文案"
    }

    @SuppressLint("SetTextI18n")
    private fun redButtonClick(view: View) {
        val onRedButton = iMainAction?.onRedButton(view)
        if (onRedButton == true) {
            return
        }
        infoText.text = "${infoText.text} \n 红色按钮点击"

    }

    private fun yellowButtonClick(view: View) {
        iMainAction?.onYellowButtonClick(view)
    }

    override fun onResume() {
        super.onResume()
        iMainAction?.onMainResume()
        println("${this.javaClass.simpleName} onResume")
    }


}
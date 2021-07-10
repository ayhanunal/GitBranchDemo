package com.ayhanunal.gitbranchdemo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        deviceModelButton.setOnClickListener {
            modelText.text = "Model : ${Build.MANUFACTURER} / ${Build.MODEL} "
        }

        versionButton.setOnClickListener {
            versionText.text = "Version : ${Build.VERSION.SDK_INT}"
        }



    }

}
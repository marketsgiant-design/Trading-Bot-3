package com.marketsgiant.tradingbot

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "Trading Bot 3 - Markets Giant!\n\nAPK Built Successfully!"
        textView.textSize = 20f
        textView.setPadding(50, 200, 50, 50)
        setContentView(textView)
    }
}

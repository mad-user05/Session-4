package com.example.watch2.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.watch2.ComplicationActivity
import com.example.watch2.LoveActivity
import com.example.watch2.R
import com.example.watch2.chat.ChatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun obsy(view: View) {
        val intent = Intent(this, ChatActivity::class.java)
                startActivity(intent)
    }

    fun podbor(view: View) {
        val intent = Intent(this, ComplicationActivity::class.java)
                startActivity(intent)
    }

    fun fav(view: View) {
        val intent = Intent(this, LoveActivity::class.java)
                startActivity(intent)
    }
}
package com.example.watch2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.watch2.main.MainActivity2

class ComplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complication)
    }

    fun back(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
    }
}
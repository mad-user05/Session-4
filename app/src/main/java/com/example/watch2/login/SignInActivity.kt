package com.example.watch2.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.watch2.R
import kotlinx.android.synthetic.main.activity_signin.*


class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)



    }

    fun voiti(view: View) {
        var isChar = false
        for (char in edit_email.toString()) {
            if (edit_email.toString().equals("@")) {
                isChar = true
            }
        }
        if (!isChar || edit_email.toString().isEmpty() || edit_pas.toString().isEmpty()) {
            Toast.makeText(this, "Ваши данные введены неверно, либо не введены!", Toast.LENGTH_SHORT).show()
        } else {
            /*val service = Inter.api
       val call = service.lohIn(ModelInto)*/
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

    }
}
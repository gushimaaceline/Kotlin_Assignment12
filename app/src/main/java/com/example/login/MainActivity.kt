package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        casViews()
        onclickListner()
    }
    fun casViews(){
       btnLogin = findViewById<Button>(R.id.btnLogin)

    }
    fun onclickListner() {
      btnLogin.setOnClickListener {
          var intent= Intent(baseContext,LoginPage::class.java)
          startActivity(intent)
      }
    }
}
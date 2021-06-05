package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginPage : AppCompatActivity() {

    lateinit var btnPage1:Button
    lateinit var btnSignUp1:Button
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        castingViews()
        onClickListener()
    }
    fun castingViews(){
       btnPage1= findViewById(R.id.btnPage1)
        btnSignUp1= findViewById(R.id.btnSinUp1)
        etEmail= findViewById(R.id.etEmail)
        etPassword= findViewById(R.id.etPassword)
    }
    fun onClickListener(){
        if(etEmail.text.toString().isEmpty() ||(etPassword.text.toString().isEmpty())){
            etEmail.setError(  "Enter Email")
            etPassword.setError( "Enter Password")
        }
        var message= "Login Successfully"
        btnPage1.setOnClickListener {
            Toast.makeText(baseContext,message,Toast.LENGTH_LONG).show()
        }
        btnSignUp1.setOnClickListener {
            var intent= Intent(baseContext,SignUp::class.java)
            startActivity(intent)
        }
    }

}
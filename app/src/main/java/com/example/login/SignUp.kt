package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SignUp : AppCompatActivity() {
    lateinit var tilName:EditText
    lateinit var tilPin:EditText
    lateinit var btnCreate:Button
    lateinit var spGender:Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sin_up)
        castViews()
        onclickListener()
    }
    fun castViews(){
        tilName= findViewById(R.id.etName2)
        btnCreate= findViewById(R.id.btnCreate)
        spGender= findViewById(R.id.spGender)
        var genders= arrayListOf("Male","Female","Other")
        var genderAdapter= ArrayAdapter<String>(baseContext,android.R.layout.simple_dropdown_item_1line,genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
    }
    fun onclickListener(){
        var genders= spGender.toString()
        if(tilName.text.toString().isEmpty() || (tilPin.text.toString().isEmpty())){
            tilName.setError("Enter name")
            tilPin.setError("Enter Password")
        }
        var message= "Account Created Successfully"
        Toast.makeText(baseContext,message,Toast.LENGTH_LONG).show()
    }
}
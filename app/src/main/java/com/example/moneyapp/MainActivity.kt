package com.example.moneyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    /*private val PASSWORD_PATTERN = Pattern.compile(
        "^" +
                "(?=.*[0-9])" +         //at least 1 digit
                "(?=.*[a-z])" +         //at least 1 lower case letter
                "(?=.*[A-Z])" +         //at least 1 upper case letter
                "(?=.*[a-zA-Z])" +  //any letter
                "(?=.*[@#$%^&+=])" +  //at least 1 special character
                "(?=\\S+$)" +  //no white spaces
                ".{6,20}" +  //at least 4 characters
                "$"
    )*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login.setOnClickListener {

            if (email.text.toString().equals("aswinsnair777@gmail.com") && password.text.toString().equals("123")){
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }else if(email.text.toString().equals("") || password.text.toString().equals("")){
                textInputLayout.setError("Enter E-mail")
                textInputLayout2.setError("Enter Password")
            }else{
                textInputLayout.setError(null)
                textInputLayout2.setError(null)
            }
        }
    }
}
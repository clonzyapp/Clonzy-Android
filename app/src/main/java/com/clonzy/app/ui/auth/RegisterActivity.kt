package com.clonzy.app.ui.auth

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.clonzy.app.R

class RegisterActivity : AppCompatActivity() {
    private lateinit var emailInput: EditText
    private lateinit var handleInput: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        emailInput = findViewById(R.id.input_email)
        handleInput = findViewById(R.id.input_handle)
        findViewById<Button>(R.id.btn_register).setOnClickListener { 
            Toast.makeText(this, "Registered (mock)", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}

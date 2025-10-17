package com.clonzy.app.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.clonzy.app.R

class LoginActivity : AppCompatActivity() {
    private lateinit var emailInput: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        emailInput = findViewById(R.id.input_email)
        findViewById<Button>(R.id.btn_login).setOnClickListener { 
            Toast.makeText(this, "Magic link (mock) sent", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, com.clonzy.app.ui.dashboard.DashboardActivity::class.java))
            finish()
        }
        findViewById<Button>(R.id.btn_register).setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}

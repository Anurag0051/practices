package com.example.lecture1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var email: EditText
    lateinit var password: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.emailbox)
        password = findViewById(R.id.passwordbox)
        btn = findViewById(R.id.mybutton)

        btn.setOnClickListener {
            val email_data = email.text.toString().trim()
            val pass_data = password.text.toString().trim()

            Toast.makeText(this@MainActivity, "Hello " + email_data, Toast.LENGTH_LONG).show()

        }
    }

}
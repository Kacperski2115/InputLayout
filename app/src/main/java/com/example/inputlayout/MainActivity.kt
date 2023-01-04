package com.example.inputlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Kacper Michalak 2pr

        findViewById<Button>(R.id.button).setOnClickListener {
            val password1=findViewById<TextInputEditText>(R.id.Password)
            val password2=findViewById<TextInputEditText>(R.id.ConfirmPassword)
            if (password2.text.toString() == password1.text.toString()){
                findViewById<TextView>(R.id.textView).text="Poprawne hasło"
            }
            else{
                findViewById<TextView>(R.id.textView).text="Błędne hasło"
            }
        }
    }
}
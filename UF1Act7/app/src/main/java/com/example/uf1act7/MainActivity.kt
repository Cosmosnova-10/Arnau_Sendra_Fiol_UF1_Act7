package com.example.uf1act7

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
import java.net.PasswordAuthentication
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

/*
Crea un pantalla de login amb dos editText uno de tipo password i un altre de tipo plain text per al usuari,
amb un botó de confirmació a la part de baix, que, en prèmer, faci un Toast amb i un Logcat amb la informació
 de usuari i contrassenya introduïts.
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText = findViewById<EditText>(R.id.editTextText)
        val EditText = findViewById<EditText>(R.id.editTextTextPassword)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {

            val text = editText.text.toString()
            val text2 = EditText.text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            Log.d("InputType", text2)
        }


    }
}
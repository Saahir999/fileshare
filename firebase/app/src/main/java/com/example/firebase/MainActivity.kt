package com.example.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.textView)
        val testc = findViewById<Button>(R.id.testc)
        testc.setOnClickListener {
            text.text = "yes"
            Intent(this , Sender::class.java).also{
                startActivity(it)
            }
        }

        }
    }

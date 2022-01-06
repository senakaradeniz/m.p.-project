package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            var t1 = t1.text
            var t2 = t2.text


            val intent = Intent(this, ogrpage::class.java)
            intent.putExtra("key", "val")
            startActivity(intent)
        }
        button2.setOnClickListener() {
            var t3 = t3.text
            var t4 = t4.text

            val intent = Intent(this, ogretmenpage::class.java)
            intent.putExtra("key", "val")
            startActivity(intent)

        }
    } }
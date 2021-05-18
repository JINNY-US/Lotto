package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "MainActivity", Toast.LENGTH_LONG).show()

        val openConsAct = findViewById<CardView>(R.id.gotoCons)
        val openNAme = findViewById<CardView>(R.id.gotoName)

        openConsAct.setOnClickListener{
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }
        openConsAct.setOnClickListener{
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }
    }
}
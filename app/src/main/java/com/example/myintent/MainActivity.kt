package com.example.myintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nim = findViewById<EditText>(R.id.nim)
        val nama = findViewById<EditText>(R.id.nama)
        val nilai = findViewById<EditText>(R.id.nilai)
        val inputbtn = findViewById<Button>(R.id.inputbtn)

        inputbtn.setOnClickListener {
            val NIM = nim.text.toString()
            val NAMA= nama.text.toString()
            val NILAI = nilai.text.toString()

            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("NIM", NIM)
            intent.putExtra("Nama", NAMA)
            intent.putExtra("Nilai", NILAI)
            startActivity(intent)

        }
    }
}
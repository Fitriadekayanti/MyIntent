package com.example.myintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = intent
        val NIM = intent.getStringExtra("NIM")
        val NAMA = intent.getStringExtra("Nama")
        var NILAI = intent.getStringExtra("Nilai")

        val txt_hasil = findViewById<TextView>(R.id.txt_hasil)
        txt_hasil.text = "NIM : "+NIM+"\nNama: "+NAMA+"\nNilai: "+NILAI

        val keterangan = findViewById<TextView>(R.id.keterangan)
        val nilaiInt = NILAI.toInt()
        if (nilaiInt >= 80 || nilaiInt == 100) {
            keterangan.text = "Keterangan : A"
        }
        else if (nilaiInt >= 60) {
            keterangan.text = "Keterangan : B"
        }
        else if (nilaiInt >= 40) {
            keterangan.text = "Keterangan : C"
        }
        else if (nilaiInt >= 20) {
            keterangan.text = "Keterangan : D"
        }
        else if (NILAI >= 0.toInt().toString()) {
            keterangan.text = "Keterangan : E"
        }
    }
}

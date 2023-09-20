package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.Doa

class DashboardDoaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)

        val Doa: RecyclerView =
            findViewById(R.id.rvBahasaPemrograman)

        val data = arrayListOf<Doa>(
            Doa("Doa Masuk Masjid", R.drawable.doaharian),
            Doa("Doa Masuk Rumah", R.drawable.doaharian),
            Doa("Doa Minum", R.drawable.doaharian),
            Doa("Doa Makan", R.drawable.doaharian),
            Doa("Doa Terhindar Dari Dajjal", R.drawable.doaharian),
            Doa("Doa Zikir", R.drawable.doaharian),
            Doa("Doa Tidur", R.drawable.doaharian)
        )
        val btnSelengkapnya :Button = findViewById(R.id.btnSelengkapnya)
        val adapter = DoaAdapter(data)
        Doa.adapter = adapter
        Doa.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)

        btnSelengkapnya.setOnClickListener {
            val intent = Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }
}
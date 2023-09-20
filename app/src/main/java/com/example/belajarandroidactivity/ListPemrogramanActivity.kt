package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class ListPemrogramanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman)
        val bahasapemrograman: RecyclerView = findViewById(R.id.rvBahasaPemrograman)
        val data = arrayListOf<Language>(
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.cplus),
            Language("Phyton", R.drawable.python),
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.cplus),
            Language("Phyton", R.drawable.python),
        )
        val adapter = LanguageAdapter(data)
        bahasapemrograman.adapter = adapter
        bahasapemrograman.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
    }
}
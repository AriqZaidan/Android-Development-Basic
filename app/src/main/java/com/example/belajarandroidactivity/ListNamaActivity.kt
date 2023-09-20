package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

        val arrayeuy:ArrayAdapter<*>
        val users= arrayOf(
            "1. Python","2. C#", "3. C++","a"
        )
        var mlistview:ListView=findViewById(R.id.lvnama)

        arrayeuy=ArrayAdapter(this,android.R.layout.simple_list_item_1,users)
        mlistview.adapter=arrayeuy
    }
}
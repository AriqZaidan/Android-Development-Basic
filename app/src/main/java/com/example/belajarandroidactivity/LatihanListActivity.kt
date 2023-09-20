package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

        val arrayeuy: ArrayAdapter<*>
        val users= arrayOf(
            "1. Python","2. C#", "3. C++","4. JavaScript","5. PHP", "6. Swift","7. Java","8. Go","9. SQL", "10. Ruby"
        )

    }
}
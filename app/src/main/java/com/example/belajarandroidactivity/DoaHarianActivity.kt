package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val Doa : RecyclerView = findViewById(R.id.rvDoaHarian)
        val namaDoa = getString(R.string.doa_latin)
        val namaArab = getString(R.string.doa_arab)
        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ", "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Sebelum Makan ", "اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارُِِ", "Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar")
        )
        val adapter = DoaHarianAdapter(data)
        Doa.adapter = adapter
        Doa.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)

    }
}
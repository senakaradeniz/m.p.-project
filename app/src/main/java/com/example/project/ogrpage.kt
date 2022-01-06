package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_ogrpage.*

class ogrpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogrpage)


        val listItems = arrayOfNulls<String>( 5)
        listItems[0] = "Mobil Programlama"
        listItems[1] = "Fizik"
        listItems[2] = "Sayısal Analiz"
        listItems[3] = "Veritabanı"
        listItems[4] = "Görsel Programlama"


        val adapter = ArrayAdapter( this , android.R.layout.simple_list_item_1, listItems)
        list_view.adapter = adapter

    }

}
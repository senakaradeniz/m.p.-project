package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_ogrpage.*

class ogretmenpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogretmenpage)

        val listItems = arrayOfNulls<String>( 3)
        listItems[0] = "Mobil Programlama"
        listItems[1] = "Görsel Programlama"
        listItems[2] = "Veritabanı"



        val adapter = ArrayAdapter( this , android.R.layout.simple_list_item_1, listItems)
        list_view.adapter = adapter

    }
}
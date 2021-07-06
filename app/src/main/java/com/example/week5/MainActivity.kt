package com.example.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week5.databinding.ActivityMainBinding

import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.widget.SearchView


import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {


    private lateinit var myListAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


        val arrayList = ArrayList<Model>()
        val displayList = ArrayList<Model>()

        arrayList.add(Model("Faith", "Mark", R.drawable.woman))
        arrayList.add(Model("Helen", "Frank", R.drawable.woman))
        arrayList.add(Model("Mia", "George", R.drawable.woman))
        arrayList.add(Model("Marcel", "Frank", R.drawable.woman))
        arrayList.add(Model("Lori", "Jude", R.drawable.woman))
        arrayList.add(Model("Josh", "Rex", R.drawable.woman))
        arrayList.add(Model("Handel", "Kes", R.drawable.woman))
        displayList.addAll(arrayList)


        val myAdapter = MyAdapter(arrayList, this)


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter





    }
}
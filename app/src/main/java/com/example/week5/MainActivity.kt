package com.example.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var MyAdapter:


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Mary", "John", R.drawable.woman))
        arrayList.add(Model("Faith", "Mark", R.drawable.woman))
        arrayList.add(Model("Sarah", "John", R.drawable.woman))
        arrayList.add(Model("Suzan", "Monday", R.drawable.woman))
        arrayList.add(Model("Favour", "Henry", R.drawable.woman))
        arrayList.add(Model("James", "Frank", R.drawable.woman))
        arrayList.add(Model("Happy", "Mike", R.drawable.woman))
        arrayList.add(Model("Helen", "Frank", R.drawable.woman))
        arrayList.add(Model("Mia", "George", R.drawable.woman))
        arrayList.add(Model("Marcel", "Frank", R.drawable.woman))
        arrayList.add(Model("Lori", "Jude", R.drawable.woman))
        arrayList.add(Model("Josh", "Rex", R.drawable.woman))
        arrayList.add(Model("Handel", "Kes", R.drawable.woman))
        arrayList.add(Model("Hope", "Josh", R.drawable.woman))
        arrayList.add(Model("Max", "Mark",R.drawable.woman))
        arrayList.add(Model("Sam", "Lucky", R.drawable.woman))
        arrayList.add(Model("KIm", "Rice", R.drawable.woman))
        arrayList.add(Model("Mike", "Frank", R.drawable.woman)


            binding.recyclerView.adapter = MyAdapter



    }
}
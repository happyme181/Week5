package com.example.week5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class MyAdapter(val arrayList: ArrayList<Model>, val context: Context):
    RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    class ViewHolder(val binding: )
        : RecyclerView.ViewHolder(binding.root){

        fun bind (model: Model){

            binding.Firstname.text = arrayListOf<>().firstname
            binding.lastname.text = arrayListOf<>().lastname
            binding.image.setImageResource(arrayListOf().image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val binding : my = rowBinding.inflate(layoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        val list = arrayList.get(position)
        holder.bind (list)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}
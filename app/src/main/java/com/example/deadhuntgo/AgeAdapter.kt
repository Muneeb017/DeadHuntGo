package com.example.deadhuntgo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.deadhuntgo.databinding.ItemAgeBinding

class AgeAdapter(private val mList: List<String>) : RecyclerView.Adapter<AgeAdapter.AgeHolder>() {

    inner class AgeHolder(val itemBinding: ItemAgeBinding) :
        RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgeHolder {
        val binding = ItemAgeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AgeHolder(binding)
    }

    override fun onBindViewHolder(holder: AgeHolder, position: Int) {
        holder.itemBinding.tvAge.text = mList[position]
    }

    override fun getItemCount(): Int {
        return mList.size
    }

}
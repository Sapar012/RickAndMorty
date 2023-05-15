package com.example.rickandmorty.presentation.ui.fragment.location

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.data.model.Location
import com.example.rickandmorty.data.model.MainResponse
import com.example.rickandmorty.databinding.ItemLocationBinding

class LocationAdapter() : RecyclerView.Adapter<LocationAdapter.LocationViewHolder>() {

    private var list:ArrayList<Location> = arrayListOf()

    private fun setList(list:ArrayList<Location> = arrayListOf() ){
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
        val binding = ItemLocationBinding.inflate(
            LayoutInflater.from(
                parent.context
            ),
            parent, false
        )
        return LocationViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        holder.onBind(position)
    }


    inner class LocationViewHolder(private val binding: ItemLocationBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(post:Int) {
            binding.itemTvDes.text = list[post].title
        }
    }
}
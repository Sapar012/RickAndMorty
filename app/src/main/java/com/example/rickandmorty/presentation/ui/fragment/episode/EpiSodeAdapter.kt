package com.example.rickandmorty.presentation.ui.fragment.episode

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.data.model.ResultX
import com.example.rickandmorty.databinding.ItemEpisodeBinding


class EpiSodeAdapter() : RecyclerView.Adapter< EpiSodeAdapter.EpiSodeViewHolder>() {

    private var list: ArrayList<ResultX> = arrayListOf()

    fun setList(list: ArrayList<ResultX>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = EpiSodeViewHolder(
    ItemEpisodeBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: EpiSodeViewHolder, position: Int) {
        holder.onBind(position)
    }
    inner class EpiSodeViewHolder(private val binding: ItemEpisodeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(position: Int) {

        }
    }
}
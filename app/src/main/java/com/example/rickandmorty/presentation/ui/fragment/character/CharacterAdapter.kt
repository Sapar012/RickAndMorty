package com.example.rickandmorty.presentation.ui.fragment.character

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rickandmorty.data.model.Result
import com.example.rickandmorty.databinding.ItemCharacterBinding

class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    private var list: ArrayList<Result> = arrayListOf()

    fun setList(list: ArrayList<Result>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding =
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    class CharacterViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: Result) {
            binding.tvTitle.text = model.nameCharacter
            binding.tvStatus.text = model.statusLife
            binding.tvGender.text = model.gender
            Glide.with(binding.imgItem)
                .load(model.imgUrl)
                .into(binding.imgItem)
        }
    }
}
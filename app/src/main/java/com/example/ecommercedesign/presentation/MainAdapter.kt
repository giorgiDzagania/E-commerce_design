package com.example.ecommercedesign.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ecommercedesign.data.Item
import com.example.ecommercedesign.databinding.ItemLayoutBinding

class MainAdapter : ListAdapter<Item, MainAdapter.MainViewModel>(DiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewModel {
        return MainViewModel(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainViewModel, position: Int) {
        holder.bind(getItem(position)) // Get the individual item
    }

    class DiffUtilCallBack : DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem == newItem
        }
    }

    inner class MainViewModel(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) = with(binding) {
            Glide.with(modelImage)
                .load(item.image)
                .into(modelImage)
            tvTitle.text = item.itemName
            tvDescription.text = item.itemDescription
            tvPrice.text = item.itemPrice
        }
    }
}
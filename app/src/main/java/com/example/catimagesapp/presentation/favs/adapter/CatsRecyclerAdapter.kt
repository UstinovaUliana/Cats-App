package com.example.catimagesapp.presentation.favs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.catimagesapp.databinding.ItemCatBinding
import com.example.catimagesapp.domain.cats.model.Cat


class CatsRecyclerAdapter(
    val action: (changed: Cat, checked: Boolean) -> Unit
): ListAdapter<Cat, CatsRecyclerAdapter.CatsViewHolder>(DiffCallback()) {

    class CatsViewHolder(binding: ItemCatBinding): RecyclerView.ViewHolder(binding.root) {
        val imageCat = binding.imageViewCat
        val textCat = binding.textViewCat
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CatsViewHolder {
        val viewBinding = ItemCatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CatsViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: CatsViewHolder, position: Int) {
        currentList[position].also{
            holder.imageCat.setImageURI(it.imageId)
            holder.textCat.text = it.id
        }
    }

    private class DiffCallback: DiffUtil.ItemCallback<Cat>() {
        override fun areItemsTheSame(oldItem: Cat, newItem: Cat) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Cat, newItem: Cat) =
            oldItem == newItem
    }


}
package com.example.jimenaproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jimenaproject.ProductsModel
import com.example.jimenaproject.R

class ProductsAdapter(private val productsList:List<ProductsModel>) :RecyclerView.Adapter<ProductsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProductsViewHolder(layoutInflater.inflate(R.layout.item_products, parent, false))
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        val item = productsList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = productsList.size
}
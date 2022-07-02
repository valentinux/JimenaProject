package com.example.jimenaproject.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jimenaproject.ProductsModel

import com.example.jimenaproject.R

class ProductsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val productName = view.findViewById<TextView>(R.id.tvnameProduct)
    val productDescription = view.findViewById<TextView>(R.id.tvProductDescription)
    val productphoto = view.findViewById<ImageView>(R.id.ivProduct)


    fun render(productsModel: ProductsModel) {
        productName.text = productsModel.productname
        productDescription.text = productsModel.productdescription
        Glide.with(productphoto.context).load(productsModel.photo).into(productphoto)
    }
}
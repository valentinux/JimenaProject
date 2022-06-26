package com.example.jimenaproject.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jimenaproject.ProductsModel
import com.example.jimenaproject.R

class ProductsViewHolder(view:View): RecyclerView.ViewHolder(view) {
    val productName = view.findViewById<TextView>(R.id.tvproductname)
    val productDescription = view.findViewById<TextView>(R.id.tvproductdescription)
    val productphoto = view.findViewById<ImageView>(R.id.ivProduct)

    fun render(productsModel: ProductsModel){
        productName.text = productsModel.productname
        productDescription.text = productsModel.productdescription
    }
}
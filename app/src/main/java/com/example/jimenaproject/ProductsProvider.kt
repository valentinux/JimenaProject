package com.example.jimenaproject

class ProductsProvider {
    companion object{
        val productsList = listOf<ProductsModel>(
            ProductsModel(
                1,
                "Producto de prueba",
                "Este es un producto de prueba",
                "https://www.freepik.es/vector-gratis/barras-piezas-chocolate_3139372.htm#query=colacao&position=5&from_view=search"
            )
        )
    }

}
package com.example.jetpack.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.jetpack.Product
import com.example.jetpack.R

@Composable
fun ProductList() {
    val products = listOf(
        Product("YSL heels", "$30,00", "* 4.5 (120 Reviews ", R.drawable.ysl2),
        Product("LV heels", "$40,00", "* 4.3 (129 Reviews ", R.drawable.lv),
        Product("nike heels", "$50,00", "* 5 .0(220 Reviews ", R.drawable.ysl2),
        Product("LV heels", "$40,00", "* 4.5 (230 Reviews ", R.drawable.lv),
    )

    LazyColumn {
        items(products){pro ->
           ProductCard(
               productName = pro.name,
               price = pro.price,
               rating = pro.rating,
             imageId = pro.image
           )
        }
    }
}
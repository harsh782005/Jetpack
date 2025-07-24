package com.example.jetpack.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.Product
import com.example.jetpack.R
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.zIndex

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductList() {
    val products = listOf(
        Product("YSL heels", "$30.00", "* 4.5 (120 Reviews)", R.drawable.ysl2),
        Product("LV heels", "$40.00", "* 4.3 (129 Reviews)", R.drawable.lv),
        Product("Nike heels", "$50.00", "* 5.0 (220 Reviews)", R.drawable.ysl2),
        Product("LV heels", "$40.00", "* 4.5 (230 Reviews)", R.drawable.lv),
    )

    var query by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }

    val filteredProducts = products.filter {
        it.name.contains(query, ignoreCase = true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        // ✅ TOP BAR - Search and Cart
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Search Bar
            SearchBar(
                query = query,
                onQueryChange = { query = it },
                onSearch = { active = false },
                active = active,
                onActiveChange = { active = it },
                placeholder = { Text("Search products") },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 12.dp)
            ) {
                Text("Searching for \"$query\"", modifier = Modifier.padding(16.dp))
            }

            // Shopping Cart with Badge ✅
            Box(
                modifier = Modifier.wrapContentSize(),
                contentAlignment = Alignment.TopEnd
            ) {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "Cart",
                    modifier = Modifier
                        .size(36.dp)
                        .padding(4.dp)
                )

                // Badge
                Text(
                    text = "2",
                    color = Color.White,
                    fontSize = 10.sp,
                    modifier = Modifier
                        .offset(x = 4.dp, y = (-2).dp)
                        .zIndex(1f)
                        .background(Color.Red, RoundedCornerShape(50))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Product List
        LazyColumn {
            items(filteredProducts) { product ->
                ProductCard(
                    productName = product.name,
                    price = product.price,
                    rating = product.rating,
                    imageId = product.image
                )
            }
        }
    }
}

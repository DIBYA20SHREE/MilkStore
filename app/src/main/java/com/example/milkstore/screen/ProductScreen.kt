package com.example.milkstore.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.milkstore.data.model.ProductItem
import com.example.milkstore.ui.theme.DarkGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductScreen(
//    onBackClick: () -> Unit = {},
    navController: NavController
) {
    val products = listOf(
        Triple("Whole Milk", 150, 3.50),
        Triple("Skim Milk", 80, 3.00),
        Triple("Chocolate Milk", 120, 4.00),
        Triple("Almond Milk", 90, 4.50),
        Triple("Soy Milk", 60, 4.20),
        Triple("Whole Milk", 150, 3.50),
        Triple("Skim Milk", 80, 3.00),
        Triple("Chocolate Milk", 120, 4.00),
        Triple("Almond Milk", 90, 4.50),
        Triple("Soy Milk", 60, 4.20),
        Triple("Whole Milk", 150, 3.50),
        Triple("Skim Milk", 80, 3.00),
        Triple("Chocolate Milk", 120, 4.00),
        Triple("Almond Milk", 90, 4.50),
        Triple("Soy Milk", 60, 4.20)
    )

    Scaffold(

        topBar = {
            CenterAlignedTopAppBar(
                modifier = Modifier.padding(top = 0.dp),
                title = {
                    Text(
                        text = "Product List",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,

                    )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate("home")
                    }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        },
        floatingActionButton = {
            AddProductButton(onClick = {
                // Navigate to add product screen
            })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(28.dp)
            ) {
                Text("Search Bar will be displayed here")
            }

            LazyColumn(
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxSize()
            ) {
                items(products) { (name, stock, price) ->
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                navController.navigate("Item")
                            }
                            .border(
                                width = 2.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(12.dp)
                    ) {
                        ProductItem(name = name, stock = stock, price = price)
                    }
                }
            }
        }
    }
}

@Composable
fun AddProductButton(onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = onClick,
        icon = {
            Icon(Icons.Default.Add, contentDescription = "Add Product", tint = Color.Black)
        },
        text = {
            Text("Add Product", color = Color.Black)
        },
        containerColor = DarkGreen,
        shape = RoundedCornerShape(12.dp)
    )
}


package com.example.milkstore.Screen


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.milkstore.data.Model.ProductItem


@Composable
fun ProductScreen(){
    Column (
        modifier = Modifier
            .padding(top = 40.dp)
            .fillMaxWidth()
    ){
        Box (
            modifier =Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .height(28 .dp)
        ){
            Text("Search Bar will be displayed here")
        }
        ProductListScreen()
    }
}


@Composable
fun ProductListScreen() {
    val products = listOf(
        Triple("Whole Milk", 150, 3.50),
        Triple("Skim Milk", 80, 3.00),
        Triple("Chocolate Milk", 120, 4.00),
        Triple("Almond Milk", 90, 4.50),
        Triple("Soy Milk", 60, 4.20)
    )

    LazyColumn {
        items(products) { (name, stock, price) ->
            ProductItem(name = name, stock = stock, price = price)
        }
    }

    AddProductButton(
        onClick = {
            // Navigate to add product screen or show dialog
        }
    )
}


@Composable
fun AddProductButton(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        Button(
            onClick = onClick,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB5E59F)), // Light green
            modifier = Modifier
                .height(48.dp)
                .defaultMinSize(minWidth = 160.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add",
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Add Product", color = Color.Black)
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewProductScreen() {
    ProductScreen()
}


package com.example.milkstore.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OrderScreen (){
    Text(
        text  = "Order screen ",
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.padding(40.dp)
    )
}
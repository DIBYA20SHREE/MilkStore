package com.example.milkstore.Screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProductScreen (){
    Text(
        text  = "Product scree ",
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.padding(40.dp)
    )
}
package com.example.milkstore.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemDetail(){
    Box(
        modifier = Modifier.padding(20.dp)
    ){
        Text(text ="Description of the selected item will be showed here", fontSize = 28.sp)
    }

}
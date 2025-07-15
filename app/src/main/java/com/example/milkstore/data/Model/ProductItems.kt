package com.example.milkstore.data.Model


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProductItem(name: String, stock: Int, price: Double) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = name,
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.SemiBold)
            )
            Text(
                text = "Stock: $stock",
                style = MaterialTheme.typography.bodySmall.copy(color = Color(0xFF4CAF50)) // Green color
            )
        }

        Text(
            text = "$${String.format("%.2f", price)}",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun Previewfunction01(){
    ProductItem("milk", 30, 120.0)
}

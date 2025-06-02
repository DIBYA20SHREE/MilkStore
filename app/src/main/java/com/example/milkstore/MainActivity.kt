package com.example.milkstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            BottomNavbar()

        }
    }
}


@Composable
fun BottomNavbar(){
 Text("Bottom Navbar", modifier = Modifier.padding(40.dp))
}

@Preview(showSystemUi = true)
@Composable
fun PreviewfunApp(){
    BottomNavbar()
}
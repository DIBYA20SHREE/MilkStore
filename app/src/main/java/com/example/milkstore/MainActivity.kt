package com.example.milkstore

import com.example.milkstore.ui.theme.MilkStoreTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.milkstore.Components.BottomNavbar
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MilkStoreTheme{
                App()
            }
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavbar(navController = navController)
        }
    ) { innerPadding ->
        AppNavGraph(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewApp() {
    MilkStoreTheme {
        App()
    }
}
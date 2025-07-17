package com.example.milkstore

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.milkstore.screen.*


@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {
        composable("home") { HomeScreen(navController) }
        composable("products") { ProductScreen(navController) }
        composable("orders") { OrderScreen() }
        composable("customers") { CustomerScreen() }
        composable("Item"){ ItemDetail() }
    }
}

package com.example.milkstore.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.milkstore.Model.BottomNavbarItem
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavbar(
    navController: NavController,
    selectedItem: String = "Home",
    onItemSelected: (String) -> Unit = {}
) {
    val items = listOf(
        BottomNavbarItem("Home", Icons.Default.Home),
        BottomNavbarItem("Products", Icons.Default.ShoppingCart),
        BottomNavbarItem("Orders", Icons.Default.List),
        BottomNavbarItem("Customers", Icons.Default.Person)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEach { item ->
                Column (
                    modifier = Modifier
                        .width(83.5.dp)
                        .height(54.dp)
                        .clickable {
                            val route = when (item.label) {
                                "Home" -> "home"
                                "Products" -> "products"
                                "Orders" -> "orders"
                                "Customers" -> "customers"
                                else -> "home"
                            }
                            navController.navigate(route) {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }

                            onItemSelected(item.label)

                        },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(item.icon, contentDescription = item.label, modifier = Modifier.size(20.dp))
                    Text(text = item.label, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun BottomNavBar(
){
    val items = listOf(
        BottomNavbarItem("Home", Icons.Default.Home),
        BottomNavbarItem("Products", Icons.Default.ShoppingCart),
        BottomNavbarItem("Orders", Icons.Default.List),
        BottomNavbarItem("Customers", Icons.Default.Person)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(top= 50.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEach { item ->
                Column (
                    modifier = Modifier
                        .width(83.5.dp)
                        .height(54.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(item.icon, contentDescription = item.label, modifier = Modifier.size(20.dp))
                    Text(text = item.label, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                }
            }
        }
    }
}



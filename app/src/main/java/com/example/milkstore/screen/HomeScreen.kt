package com.example.milkstore.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.milkstore.data.model.DashboardCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                modifier = Modifier.padding(top = 0.dp),
                title = {
                    Text(
                        text = "Dashboard",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                        )
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxHeight() // Required for vertical weight distribution
                .padding(16.dp)
        ) {

            // Section 1: Row with 2 cards (horizontal weight)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f), // Take 1 unit of vertical space
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                DashboardCard(
                    title = "Total Sales",
                    value = "$12,500",
                    modifier = Modifier.weight(1f)
                )
                DashboardCard(
                    title = "Total Orders",
                    value = "350",
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Section 2: Customer Count Card
            DashboardCard(
                title = "Customer Count",
                value = "120",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f) // Take 1 unit vertical space
            )

            // Section 3: Sales Trends
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top= 8.dp)
                    .weight(3f) // More vertical space for trend section
            ) {

                Text("Sales Trends (Last Month)", fontSize = 16.sp)
                Text("\$12,500", fontSize = 28.sp, fontWeight = FontWeight.Bold)
                Row {
                    Text("Last Month ", color = Color(0xff639154))
                    Text("+15%", color = Color(0xff639154))
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f), // Graph fills remaining vertical space
                    contentAlignment = Alignment.Center
                ) {
                    Text("Graph")
                }
            }

            // Section 4: Buttons
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xff54D12B))
                ) {
                    Text("Manage", color = Color.Black, fontSize = 18.sp)
                }

                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEBF2E8))
                ) {
                    Text("View Orders", color = Color.Black, fontSize = 18.sp)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Section 5: Customer Detail Button
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .weight(1f), // Takes vertical space equally
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEBF2E8))
            ) {
                Text("Customer Detail", color = Color.Black, fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(12.dp)) // for bottom padding
        }
    }


}


@Preview(showSystemUi = true)
@Composable
fun HomescreenPreview(){
    HomeScreen()
}


package com.example.milkstore.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.milkstore.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemDetail(navController: NavController){
    Scaffold(
        contentWindowInsets = WindowInsets(0),
        topBar = {
            CenterAlignedTopAppBar(

                title = {
                    Text(
                        text = "Dashboard",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                },

                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate("products")
                    }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ){
        innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxHeight() // Required for vertical weight distribution
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ){



            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp, // optional, set the border width
                        color = Color.Gray, // optional, set the border color
                        shape = RoundedCornerShape(16.dp) // rounded corners
                    )
                    .clip(RoundedCornerShape(16.dp)) // clip the content inside the box
            ){
                Image(
                    painter = painterResource(id = R.drawable.milk),
                    contentDescription = "Milk Image",
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop // Or .Fit, .FillBounds, etc.
                )

            }

            Column(
                modifier = Modifier
                    .padding(top= 26.dp)
                    .padding(start = 5.dp)
            ) {
                Text(
                    text = "Whole Milk ",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle= FontStyle.Normal,
                    modifier = Modifier.padding(bottom = 20.dp)
                )
                Text(
                    text = "Fresh, creamy whole milk from local farms. Rich in calcium and essential nutrients. ",
                    fontSize = 16.sp,
                    fontStyle= FontStyle.Normal,
                    softWrap = true, //When softWrap is true, long lines of text will wrap onto the next line if they are too long to fit within the available width.
                    modifier = Modifier.padding(bottom = 20.dp)

                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(Color.White, shape = RoundedCornerShape(12.dp))
                        .border(1.dp, Color.LightGray, RoundedCornerShape(12.dp))
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Product Information",
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        // Left column
                        Column(modifier = Modifier.weight(1f)) {
                            // Stock Level
                            Text(
                                text = "Stock Level",
                                color = Color(0xFF6DA95E), // green color
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = "150 units",
                                color = Color.Black,
                                fontWeight = FontWeight.Normal
                            )
                            Spacer(modifier = Modifier.height(16.dp))

                            // Supplier
                            Text(
                                text = "Supplier",
                                color = Color(0xFF6DA95E),
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = "Dairy\nFarms Inc.",
                                color = Color.Black,
                                fontWeight = FontWeight.Normal
                            )
                        }

                        Spacer(modifier = Modifier.width(32.dp)) // space between columns

                        // Right column
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Price",
                                color = Color(0xFF6DA95E),
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = "$3.50 per gallon",
                                color = Color.Black,
                                fontWeight = FontWeight.Normal
                            )
                        }
                    }
                }



                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Actions",
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Row for Update Stock & Adjust Price
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        ActionChipButton(text = "Update Stock")
                        ActionChipButton(text = "Adjust Price")
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Full-width Edit Button
                    Button(
                        onClick = { /* Handle Edit Product Details */ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF39D353)), // bright green
                        shape = RoundedCornerShape(50), // fully rounded
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                    ) {
                        Text(
                            text = "Edit Product Details",
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }



            }


        }
    }

}


@Composable
fun ActionChipButton(text: String) {
    Button(
        onClick = { /* Handle Action */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFF0F7F0), // light greenish white
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(50),
        contentPadding = PaddingValues(horizontal = 24.dp, vertical = 8.dp),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
        modifier = Modifier
            .defaultMinSize(minHeight = 36.dp)
    ) {
        Text(text = text, fontWeight = FontWeight.Medium)
    }
}

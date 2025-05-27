package com.example.milkstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.milkstore.ui.theme.MilkStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MilkStoreTheme {
                Home()
            }
        }
    }
}

@Composable
fun Home(){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
    ){
        Box(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
                .height(72.dp),

            contentAlignment = Alignment.Center
        ){
            Row (horizontalArrangement = Arrangement.spacedBy(16.dp)){
                Text(
                    text = "Dashboard",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

            }
        }





        Box(
            modifier = Modifier
                .padding(start = 24.dp)
                .padding(end = 24.dp)
                .fillMaxWidth()
                .height(268.dp),

            contentAlignment = Alignment.TopCenter
        ){
            Column {
                Row (horizontalArrangement = Arrangement.spacedBy(16.dp)
                ){
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFEBF2E8)
                        ),
                        modifier = Modifier
                            .size(width = 171.dp, height = 110.dp)
                    ) {

                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Text(
                                text = "Total Sales",
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0xFF121A0F),
                            )
                            Spacer(Modifier.height(8.dp))

                            Text(
                                text = "\$12,500",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                color = Color(0xFF121A0F),
                            )
                        }

                    }
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFEBF2E8)
                        ),
                        modifier = Modifier
                            .size(width = 171.dp, height = 110.dp)
                    ) {

                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Text(
                                text = "Total Sales",
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0xFF121A0F),
                            )
                            Spacer(Modifier.height(8.dp))

                            Text(
                                text = "\$12,500",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                color = Color(0xFF121A0F),
                            )
                        }

                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFEBF2E8)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height (110.dp)
                ) {

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ){
                        Text(
                            modifier = Modifier.padding(start = 14.dp),
                            text = "Customer Count",
                            fontSize = 16.sp,
                            color = Color(0xFF121A0F),
                        )
                        Spacer(Modifier.height(8.dp))

                        Text(
                            modifier = Modifier.padding(start =14.dp),
                            text = "120",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF121A0F),
                        )
                    }

                }

            }
        }
    }


}


@Preview(showSystemUi = true)
@Composable
fun PreviewfunApp(){
    MilkStoreTheme {
        Home()
    }
}
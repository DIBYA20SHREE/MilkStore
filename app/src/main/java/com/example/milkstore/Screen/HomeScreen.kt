package com.example.milkstore.Screen

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.milkstore.Components.BottomNavbar
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController


@Composable
fun HomeScreen(){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
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
                                text = "Total Orders",
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                color = Color(0xFF121A0F),
                            )
                            Spacer(Modifier.height(8.dp))

                            Text(
                                text = "350",
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


        Box(
            modifier = Modifier
                .padding(start = 24.dp)
                .padding(end = 24.dp)
                .fillMaxWidth()
                .height(268.dp),
        ){
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text= "Sales Trends (Last Month)",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "\$12,500",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
                Row {
                    Text(
                        text = "Last Month ",
                        fontSize = 16.sp,
                        color = Color(0xff639154)
                    )
                    Text(
                        text = "+15%",
                        fontSize = 16.sp,
                        color = Color(0xff639154)
                    )
                }
                Box(
                    modifier = Modifier.fillMaxHeight()
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ){
                    Text(
                        text = "Graph",
                        textAlign = TextAlign.Center
                    )
                }
            }
        }


        Row(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp) // Equal padding on all sides (top, bottom, start, end)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween // Places buttons with space in between
        ) {
            Button(
                onClick = { /* Action */ },
                modifier = Modifier
                    .width(152.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff54D12B),
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Manage Product",
                    color = Color(0xff121A0F),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Button(
                onClick = { /* Action */ },
                modifier = Modifier
                    .width(152.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffEBF2E8),
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "View Orders",
                    color = Color(0xff121A0F),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Box(
            modifier = Modifier
                .padding()
                .height(64.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Button(onClick = {
                //Action :
            }, modifier = Modifier.padding(start= 16.dp)
                .padding(end = 16.dp)
                .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffEBF2E8),
                    contentColor = Color.White
                )
            ) {
                Text(
                    text ="Customer Detail",
                    color = Color(0xff121A0F),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold

                )
            }

        }
//        Box(
//            contentAlignment = Alignment.BottomCenter
//        ){
//            BottomNavbar(navController = NavController)
//        }

    }


}

@Preview(showSystemUi = true)
@Composable
fun HomescreenPreview(){
    HomeScreen()
}


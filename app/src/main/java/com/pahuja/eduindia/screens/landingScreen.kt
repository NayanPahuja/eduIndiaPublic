package com.pahuja.eduindia.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pahuja.eduindia.R

@Composable

fun LandingScreen(){
    //contains the surface for landingScreen
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White

    )
    {
        //this box contains landingScreen UI Components
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
        )
        {
            Text(
                text = "Changing Education For better",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 18.sp

                ),
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 3.dp, y = 447.dp)
                    .width(width = 390.dp)
                    .height(height = 64.dp)
            )
            Box(
                modifier = Modifier
                    .width(width = 345.dp)
                    .height(height = 400.dp)
                    .offset(x = 22.dp, y = (-27).dp)
                    .clip(
                        shape = RoundedCornerShape(
                            topStart = 25.dp,
                            topEnd = 25.dp,
                            bottomStart = 125.dp,
                            bottomEnd = 125.dp
                        )
                    )
                    .background(color = Color(0xff191a37)))
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 135.dp, y = 309.dp)
                    .size(size = 120.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White)
            )

            Image(
                painter = painterResource(id = R.drawable.logo_pen),
                contentDescription = "logoEshiksha",
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 173.dp, y = 320.dp)
                    .width(width = 44.dp)
                    .height(height = 64.dp)

            )
            Text(
                text = "EduIndia",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold

                ),
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 143.dp, y = 381.dp)
                    .width(width = 109.dp)
                    .height(height = 36.dp)
            )
            Button(onClick = { /*TODO*/ }) {

            }

        }
        }
    }


@Preview
@Composable
fun PreviewLandingScreen(){
    LandingScreen()
}

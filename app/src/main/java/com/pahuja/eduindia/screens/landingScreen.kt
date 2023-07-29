package com.pahuja.eduindia.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pahuja.eduindia.R

//val customFont = FontFamily(
//    fonts = listOf(
//        Font(
//            resId = R.font.mclaren,
//            weight = FontWeight.Normal,
//        )
//    )
//)
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
                    fontSize = 18.sp,
//                    fontFamily = customFont

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
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
//                    fontFamily = customFont

                ),
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 143.dp, y = 381.dp)
                    .width(width = 109.dp)
                    .height(height = 36.dp)
            )
            Button(

                modifier = Modifier
                    .width(width = 175.dp)
                    .height(height = 45.dp)
                    .offset(x = 107.dp, y = 690.dp),
                onClick = { /*TODO*/ },
                content = {
                    Text(text = "Get Started!", fontSize = 16.sp, color = Color.White)
                },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF191A37)),
                border = BorderStroke(1.dp, Color.Black)


            )



        }
        }
    }


@Preview
@Composable
fun PreviewLandingScreen(){
    LandingScreen()
}

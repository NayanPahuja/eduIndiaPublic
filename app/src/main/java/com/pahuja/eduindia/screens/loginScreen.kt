package com.pahuja.eduindia.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//val customFont = FontFamily(
//    fonts = listOf(
//        Font(
//            resId = com.pahuja.eduindia.R.font.poppins_font,
//            weight = FontWeight.Normal
//        )
//    )
//)

@Composable
fun LoginScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize(),
            color = Color(0xFF191A37)
    ) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF191A37))
        )

        {
            Box(
                modifier = Modifier
                    .width(width = 390.dp)
                    .height(height = 625.dp)
                    .offset(0.dp, 219.dp)
                    .clip(shape = RoundedCornerShape(topStart = 75.dp, topEnd = 75.dp))
//                    .background(brush = Brush.linearGradient(
//                        0f to Color(0xff6a6ed5),
//                        1f to Color.White,
//                        1f to Color(0xff1e23aa),
//                        start = Offset(195f, 210f),
//                        end = Offset(195f, 625f))))
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color(0xff6A6ED5),
                                Color(0xFF050743)
                            )

                        )
                    )
            )
            {
                Column(
                    modifier = Modifier
                ) {
                    LoginText()

                }
            }




        }
    }
}

@Composable
fun LoginText(modifier: Modifier = Modifier){
    Text(
        textAlign = TextAlign.Center,
        text = "Login",

        color = Color(0xFFFFEEEE),
        style = TextStyle(
            fontSize = 40.sp,
            fontFamily = customFont

        ),
        modifier = Modifier
            .padding(horizontal = 140.dp)
            .padding(top = 40.dp)



    )
}

@Preview
@Composable
fun PreviewLoginScreen(){
    LoginScreen()
}

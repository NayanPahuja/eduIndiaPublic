package com.pahuja.eduindia.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
import com.pahuja.eduindia.email.Email
import com.pahuja.eduindia.passwordbox.PasswordBox
import com.pahuja.eduindia.signupbutton.SignUpButton
val customFont2 = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.mclaren
        )
    )
)
val customFont = FontFamily(
    fonts = listOf(
        Font(
            resId = com.pahuja.eduindia.R.font.poppins_semi_bold
        )
    )
)

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
                        .fillMaxWidth()


                ) {
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
                    Spacer(modifier = Modifier.height(45.dp))
                    Box(modifier = Modifier
                    ){
                        Text(text = "Email Address"
                            ,color = Color(0xFFFFEEEE),
                            style = TextStyle(
                                fontSize = 12.33.sp,
                                fontFamily = customFont

                            ),
                            modifier = Modifier
                                .padding(horizontal = 30.dp)
                                .padding(top = 20.dp)
                        )
                        var email_value by remember {
                            mutableStateOf("")
                        }

                        OutlinedTextField(
                            value = email_value,

                            leadingIcon = {
                                          Icon(
                                              painter = painterResource(id = R.drawable.email_vector),
                                              contentDescription = null)

                            },
                            onValueChange = {
                                email_value = it
                            },
                            label = {
                                Box(

                                    modifier = Modifier
                                        .padding(horizontal = 20.dp)
                                        .width(314.dp)

                                        .height(21.dp),
                                ) {
                                    Text(
                                        text = "Your Email Address",
                                        style = TextStyle(
                                            fontSize = 14.33.sp,
                                            fontFamily = customFont
                                        ),
                                    )
                                }
                            },
                            modifier = Modifier
                                .padding(horizontal = 30.dp)
                                .padding(top = 40.dp)
                                .width(314.dp)
                                .height(55.dp)

                                .fillMaxWidth(),


                            textStyle = TextStyle(
                                color = Color(0xFFFFEEEE),
                                fontSize = 14.33.sp,
                                fontFamily = customFont
                            ),

                            colors = androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors(
                                focusedBorderColor = Color(0xFFFFEEEE),
                                unfocusedBorderColor = Color(0xFFFFEEEE),
                                cursorColor = Color(0xFFFFEEEE),
                                textColor = Color(0xFFFFEEEE),
                                disabledTextColor = Color(0xFFFFEEEE),
                                errorCursorColor = Color(0xFFFFEEEE),
                                errorBorderColor = Color(0xFFFFEEEE),
                                focusedLabelColor = Color(0xFFFFEEEE),
                                unfocusedLabelColor = Color(0xFFFFEEEE),
                                disabledLabelColor = Color(0xFFFFEEEE),
                                placeholderColor = Color(0xFFFFEEEE),
                                errorTrailingIconColor = Color(0xFFFFEEEE),
                                trailingIconColor = Color(0xFFFFEEEE),
                                leadingIconColor = Color(0xFFFFEEEE)
                            ),
                            shape = RoundedCornerShape(10.dp)
                        )

                    }

                    Box(modifier = Modifier

                    ){
                        Text(text = "Password"
                            ,color = Color(0xFFFFEEEE),

                            style = TextStyle(
                                fontSize = 14.33.sp,
                                fontFamily = customFont,


                            ),
                            modifier = Modifier
                                .padding(horizontal = 30.dp)
                                .padding(top = 20.dp)
                        )
                        var password_val by remember {
                            mutableStateOf("")
                        }

                        OutlinedTextField(
                            value = password_val,
                            leadingIcon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.password_box_vector),
                                    contentDescription = null)

                            },
                            onValueChange = {
                                password_val = it
                            },
                            label = {
                                Text(text = "Your Password"
                                    ,color = Color(0xFFFFEEEE),
                                    style = TextStyle(
                                        fontSize = 14.33.sp,
                                        fontFamily = customFont

                                    ),
                                    modifier = Modifier
                                        .padding(horizontal = 20.dp)
                                        .fillMaxWidth()
                                        .height(21.dp)
                                )

                            },

                            modifier = Modifier
                                .padding(horizontal = 30.dp)
                                .padding(top = 40.dp)
                                .width(314.dp)
                                .height(55.dp)

                                .fillMaxWidth(),


                            textStyle = TextStyle(
                                color = Color(0xFFFFEEEE),
                                fontSize = 14.33.sp,
                                fontFamily = customFont
                            ),

                            colors = androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors(
                                focusedBorderColor = Color(0xFFFFEEEE),
                                unfocusedBorderColor = Color(0xFFFFEEEE),
                                cursorColor = Color(0xFFFFEEEE),
                                textColor = Color(0xFFFFEEEE),
                                disabledTextColor = Color(0xFFFFEEEE),
                                errorCursorColor = Color(0xFFFFEEEE),
                                errorBorderColor = Color(0xFFFFEEEE),
                                focusedLabelColor = Color(0xFFFFEEEE),
                                unfocusedLabelColor = Color(0xFFFFEEEE),
                                disabledLabelColor = Color(0xFFFFEEEE),
                                placeholderColor = Color(0xFFFFEEEE),
                                errorTrailingIconColor = Color(0xFFFFEEEE),
                                trailingIconColor = Color(0xFFFFEEEE),
                                leadingIconColor = Color(0xFFFFEEEE)
                            ),
                            shape = RoundedCornerShape(10.dp)
                        )

                    }





                }
            }




        }
    }
}



@Composable
fun textFields(labelValue:String){
    val textValue = remember{
        mutableStateOf("")
    }

//    OutlinedTextField(
//        label = Text(text = labelValue),
//        value = textValue ,
//        onValueChange = {
//            textValue.value = it
//        }



}

@Preview
@Composable
fun PreviewLoginScreen(){
    LoginScreen()
}

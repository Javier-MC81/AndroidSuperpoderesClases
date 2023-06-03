package com.jmoreno.androidsuperpoderes.components

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jmoreno.androidsuperpoderes.R


@Composable
fun login(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Image()
        Text()
        FormTextField(Icons.Default.Email, isPassword = false){
            FormLabel(hint = "Email", TextDecoration.Underline)
        }
        FormTextField(Icons.Default.Password, Icons.Default.Visibility, true){
            FormLabel("Password", TextDecoration.LineThrough)
        }
        Button(enabled = true){

        }
    }
}

@Composable
fun Image(){
    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Logo",
        modifier = Modifier
            .clip(CircleShape)
            .border(BorderStroke(6.dp, Color.Black), shape = CircleShape)
    )
}
@Composable
fun Text(){
    Text(text = "Android Superpoderes",
        fontSize = 25.sp,
        color = Color.Black
    )
}
@Composable
fun FormLabel(hint: String, textDecoration: TextDecoration){
    Text(text = hint, textDecoration = textDecoration)
}



@Composable
fun FormTextField(leadingIcon: ImageVector, trailingIcon: ImageVector? = null, isPassword: Boolean = false, label: (@Composable ()-> (Unit))? = null){
    val text = "123456789"
    TextField(
        value = text ,
        onValueChange = {
    }, leadingIcon = {
        Icon(imageVector = leadingIcon, contentDescription = leadingIcon.name)
    }, trailingIcon = {
        trailingIcon?.let{
            Icon(imageVector = it, contentDescription = it.name)
        }
    },label = {
        if (label != null){
            label()
        }
    }, visualTransformation = if (isPassword){
            PasswordVisualTransformation()
        }else{
            VisualTransformation.None
        }
    )
}
@Composable
fun Button(enabled: Boolean, onClick: ()-> Unit){
    Button(
        onClick = onClick,
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(10),
        enabled = enabled

    ){
        Text(text = "Login")

    }
}

@Preview(showSystemUi = true)
@Composable
fun login_Preview(){
    login()
}
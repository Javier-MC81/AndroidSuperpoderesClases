package com.jmoreno.androidsuperpoderes.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun myButton(enabled: Boolean = true){
    Button(
        onClick = {},
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black,
            contentColor = Color.Red,
            disabledContainerColor = Color.Blue
        ),
        border = BorderStroke(3.dp,Color.Yellow)
    ){
            Text(text = "Click me!")

    }
}
@Preview
@Composable
private fun MyButton_Preview_Disabled(){
    myButton()
}

@Preview
@Composable
private fun MyButton_Preview(){
    myButton(false)
}


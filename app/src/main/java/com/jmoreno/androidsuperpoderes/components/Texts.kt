package com.jmoreno.androidsuperpoderes.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun myText(){
    Text(text = "Hola",
        fontSize = 20.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline )


}
@Preview(showBackground = true)
@Composable

fun myText2(){
    Text(text = "Hola",
        style = MaterialTheme.typography.titleLarge.copy(color = Color.Blue)
    )


}
package com.jmoreno.androidsuperpoderes.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview()
@Composable
fun MyBox() {
    Box(modifier = Modifier
        .size(100.dp)
        .fillMaxSize()
        .background(Color.Green)){

        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red)
            .align(Alignment.Center)){

            Box(modifier = Modifier
                .size(10.dp)
                .background(Color.White)
                .align(Alignment.TopStart)){}
            Box(modifier = Modifier
                .size(20.dp)
                .background(Color.Blue)
                .align(Alignment.CenterEnd)){}
        }
        Box(modifier = Modifier
            .height(90.dp)
            .width(20.dp)
            .background(Color.White)
            .align(Alignment.Center)){
        }

        Box(modifier = Modifier
            .size(25.dp)
            .background(Color.Black)
            .align(Alignment.BottomStart))
    }




}
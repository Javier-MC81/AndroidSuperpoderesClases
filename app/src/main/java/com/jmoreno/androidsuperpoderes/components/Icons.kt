package com.jmoreno.androidsuperpoderes.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.jmoreno.androidsuperpoderes.R

@Composable
fun myIcon(){
    Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription ="Logo"
    )
    Icon(imageVector = Icons.Default.Search, contentDescription = "Search", tint = Color.Green)
}



@Preview
@Composable
private fun MyIcon_Preview(){
    myIcon()
}
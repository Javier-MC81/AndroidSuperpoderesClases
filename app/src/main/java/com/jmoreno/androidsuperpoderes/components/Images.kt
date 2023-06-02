package com.jmoreno.androidsuperpoderes.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jmoreno.androidsuperpoderes.R


@Composable
fun myImage(){
    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Logo",
        alpha = 0.5f,
        modifier = Modifier.size(100.dp,20.dp),
        contentScale = ContentScale.Crop)
}


@Preview
@Composable
private fun MyImage_Preview(){
    myImage()
}
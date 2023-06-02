package com.jmoreno.androidsuperpoderes.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun MyRow(){
    Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.spacedBy(10.dp)){
        Box(modifier = Modifier
            .size(10.dp)
            .background(Color.Blue))
        Box(modifier = Modifier
            .size(20.dp)
            .background(Color.Green))
    }
}


@Preview(showBackground = true)
@Composable
fun ColumnExercise() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.Blue)
            )
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Red)
            )
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .background(Color.Yellow)
            )

        }

        Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                )
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Red)
                )
                Box(
                    modifier = Modifier
                        .size(150.dp)
                        .background(Color.Yellow)
                )
            }

        Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {

        }
        Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {

        }
        Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {

        }

        }

    }

package com.jmoreno.androidsuperpoderes.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun myTextField(){
    var text = "shjkakkdldlksjshaagaffaddasksjdjhdskajgagsgfscxvshjak"
    TextField(value = text , onValueChange = {
        text = it
    }, leadingIcon = {
        Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
    }, trailingIcon = {
        Icon(imageVector = Icons.Default.Close, contentDescription = "Close")

    }, placeholder = {
        Text("Hint")
    }, maxLines = 2
    , singleLine = true, keyboardOptions = KeyboardOptions()
    )
}

@Preview(showBackground = true)
@Composable
private fun myTextField_Preview(){
    myTextField()
}
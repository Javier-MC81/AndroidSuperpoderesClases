package com.jmoreno.androidsuperpoderes

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jmoreno.androidsuperpoderes.ui.theme.AndroidSuperpoderesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidSuperpoderesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.background(Color.Red).padding(16.dp).background(Color.Blue).clickable { Log.d("HOLA","Hola") },
        color = Color.White
    )
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_10)
@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_6)

@Composable
fun GreetingPreview() {
    AndroidSuperpoderesTheme {
        Greeting("Android")
    }
}

@Preview()
@Composable
fun GreetingPreview2() {
    AndroidSuperpoderesTheme {
        Greeting("iOS")
    }
}
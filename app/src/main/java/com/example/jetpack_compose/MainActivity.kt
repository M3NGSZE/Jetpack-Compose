package com.example.jetpack_compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose.ui.theme.JetpackcomposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackcomposeTheme {
                FirstUi()
            }
        }


    }
}



@Composable
fun FirstUi(){
//        Row {
//            Button(onClick = {}, Modifier.systemBarsPadding()) {
//                Text(text = "Click Me 1")
//            }
//            Button(onClick = {}, Modifier.systemBarsPadding()) {
//                Text(text = "Click Me 2")
//            }
//        }
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .statusBarsPadding(), // keeps away from time/battery area
////            contentAlignment = Alignment.Center
//        ) {
//            Row {
//                Button(onClick = {}) {
//                    Text("Click Me 1")
//                }
//                Button(onClick = {}) {
//                    Text("Click Me 2")
//                }
//            }
//        }

    Row (modifier = Modifier.fillMaxSize().statusBarsPadding()) {
        Button(onClick = {}) {
            Text("Click Me 1")
        }
        Button(onClick = {}) {
            Text("Click Me 2")
        }
    }

    Column (
        modifier = Modifier.fillMaxSize().statusBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {}) {
            Text("Click Me 3")
        }
        Button(onClick = {}) {
            Text("Click Me 4")
        }
    }
}


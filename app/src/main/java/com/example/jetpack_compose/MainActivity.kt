package com.example.jetpack_compose

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose.ui.theme.JetpackcomposeTheme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackcomposeTheme {
//                FirstUi()
//                MakeCard()
//                GreetingPreview()
//                CounterPreview()
                RenderCard()
            }
        }


    }
}


@Preview(showBackground = true)
@Composable
fun InfiniteAnimationPreview() {
    val infiniteTransition = rememberInfiniteTransition(label = "infiniteTransition")

    val size by infiniteTransition.animateFloat(
        initialValue = 50f,
        targetValue = 150f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000),
            repeatMode = RepeatMode.Reverse
        ),
        label = "sizeAnimation"
    )

    Box(
        modifier = Modifier
            .size(size.dp)
            .background(Color.Blue)
    )
}

//@Preview(showBackground = true)
@Composable
fun AnimatedBoxPreview() {
    var big by remember { mutableStateOf(false) }
    val size by animateDpAsState(if (big) 150.dp else 50.dp)

    Box(
        modifier = Modifier
            .size(size)
            .background(Color.Red)
            .clickable() { big = !big }
    )
}

//@Preview
@Composable
fun RenderCard(){
    Row (Modifier.fillMaxWidth().systemBarsPadding().background(Color.Gray).padding(all = 8.dp)){
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Contact profile picture",
            Modifier.background(Color.Green)
        )

        Spacer(Modifier.width(8.dp))

        Column {
            Text(
                text = "Title: ",
                style = TextStyle(
                    fontSize = 24.sp,
                )
            )
            Text("Description: ")
        }

    }
}


//@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    var count by remember { mutableStateOf(0) }
    Column (modifier = Modifier.systemBarsPadding()){
        Text("Count: $count")
        Button(onClick = { count++ }) {
            Text("Increase")
        }
    }
}



//@Preview(name = "Light Mode", uiMode = Configuration.UI_MODE_NIGHT_NO)
//@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GreetingPreview() {
    Greeting("Mengse")
}

@Composable
fun Greeting(name: String){
    Text("$name & Chanelle" )
}


//@Preview(
//    widthDp = 50,
//    heightDp = 50,
//    showBackground = true
//)
//@Preview(
//    widthDp = 50,
//    heightDp = 60,
//    showBackground = true
//)
@Composable
fun MakeCard(){
    Box(Modifier.background(Color.Yellow)){
        Text("Hello world")
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


package com.example.compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article.ui.theme.Compose_articleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_articleTheme {
              Display()
            }
        }
    }
}


@Composable
fun DisplayImage(){
    val image = painterResource(R.drawable.bg_compose_background)

    Image(
        painter = image,
        contentDescription = null,
    )
}

@Composable
fun Display(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Top
    ) {
        DisplayImage()

        DisplayText()
    }
}

@Composable
fun DisplayText(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text (
            text = stringResource(R.string.first_text),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text (
            text = stringResource(R.string.second_text),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text (
            text = stringResource(R.string.third_text),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_articleTheme {
        Display()
    }
}
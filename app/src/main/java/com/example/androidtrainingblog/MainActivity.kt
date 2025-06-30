package com.example.androidtrainingblog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidtrainingblog.ui.theme.AndroidTrainingBlogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidTrainingBlogTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column {
                        Head(Modifier.height(128.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun Head(modifier: Modifier = Modifier) {
    val backgroundImage = painterResource(R.drawable.bg_compose_background)
    Box(modifier.fillMaxSize()) {
        Image(
            painter = backgroundImage,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            )
    }
}

@Preview(showBackground = true)
@Composable
fun HeadPreview() {
    AndroidTrainingBlogTheme {
        Head()
    }
}
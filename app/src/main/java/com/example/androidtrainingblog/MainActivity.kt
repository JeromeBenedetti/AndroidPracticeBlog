package com.example.androidtrainingblog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                        Article(
                            title = stringResource(R.string.title),
                            introduction = stringResource(R.string.introduction),
                            content = stringResource(R.string.content),
                        )
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

@Composable
fun Article(
    title: String,
    introduction: String,
    content: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier,
        verticalArrangement = Arrangement.Top,
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp,
        )
        Text(
            text = introduction,
            modifier = Modifier.padding(horizontal = 16.dp),
            fontSize = TextUnit.Unspecified,
            textAlign = TextAlign.Justify,
        )
        Text(
            text = content,
            modifier = Modifier.padding(16.dp),
            fontSize = TextUnit.Unspecified,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    AndroidTrainingBlogTheme {
        Article(
            title = stringResource(R.string.title),
            introduction = stringResource(R.string.introduction),
            content = stringResource(R.string.content),
        )
    }
}
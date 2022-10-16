package com.example.bemsuitejetpackcompose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bemsuitejetpackcompose.R
import com.example.bemsuitejetpackcompose.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()) {
                    Scaffold(topBar = {
                        TopAppBar(
                            backgroundColor = Color.White,
                            title = {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        Icon(
                                            painter = painterResource(R.drawable.ic_ironbolt_logo),
                                            contentDescription = "Image",
                                            tint = colorResource(id = R.color.purple_700))
                                    }
                                }
                            }
                        )
                    }) {
                        Home()
                    }
                }
            }
        }
    }
}


@Composable
fun MainActivityUI() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(8.68f)
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.padding(80.dp))
        Text(
            text = "beamsuite dev", style = TextStyle(
                fontWeight = FontWeight.Bold,
                letterSpacing = TextUnit.Unspecified,
                fontSize = 30.sp,
                color = colorResource(R.color.purple_700),
            )
        )
        Spacer(modifier = Modifier.padding(50.dp))
        Image(
            painterResource(R.drawable.ic_devicevalidate),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(110.dp)
        )
        Spacer(modifier = Modifier.padding(50.dp))
        LoadingBar()
    }
}

@Composable
fun LoadingBar() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(40.dp),
    ) {
        CircularProgressIndicator(
            color = colorResource(R.color.purple_700),
            strokeWidth = 3.dp
        )
    }
}
//for preview
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainActivityUI()
}
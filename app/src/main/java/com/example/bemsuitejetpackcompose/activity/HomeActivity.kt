package com.example.bemsuitejetpackcompose.activity

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home() {
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()) {

        Column(modifier = Modifier.padding(start = 10.dp)) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(6.dp)
            ) {
                Text(text = "Organisation : ")
                Text(text = "Anwitrix")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(6.dp)
            ) {
                Text(text = "Location : ")
                Text(text = "Noida Uttar Pradesh")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(6.dp)
            ) {
                Text(text = "Pending Upload : ")
                LoadingBarForHome()
                Text(text = "CH114455")
            }

        }
        Spacer(modifier = Modifier.padding(50.dp))
        LoadingBar()
    }

}

@Composable
fun LoadingBarForHome() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(20.dp),
    ) {
        CircularProgressIndicator(
            color = colorResource(com.example.bemsuitejetpackcompose.R.color.purple_700),
            strokeWidth = 2.dp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview11() {
    Home()
}
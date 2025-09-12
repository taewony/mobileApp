package com.mobileApp.w03_compose_coffee

import android.R.attr.padding
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobileApp.w03_compose_coffee.ui.theme.MobileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MobileAppTheme {
                HomeScreen()
            }
        }
    }
}

@Composable()
fun HomeScreen() {
    Scaffold() { innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize(), // 화면 전체를 차지하도록 설정
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ){
            Text(
                "Compose Coffee",
                modifier = Modifier.padding(innerPadding),
                style = MaterialTheme.typography.headlineMedium
            )
            Image(
                painterResource(id = R.drawable.compose),
                contentDescription = "Jetpack Compose 로고",
                modifier = Modifier
                    .size(300.dp) // 이미지 크기 지정
                    .padding(16.dp)
            )
            Row {
                Button(onClick = { /*TODO*/ }) {
                    Text("커피 주문")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text("홍차 주문")
                }
            }
            Text(
                "위치: 우송대 정문 앞",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MobileAppTheme {
        HomeScreen()
    }
}
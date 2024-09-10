package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(
                        name = "Caroline Gatwiri",
                        title = "Android Mobile Developer",
                        phone = "+254746414729",
                        email = "caroline1gatwiri@gmail.com",
                        social = "https://github.com/Caroline-Gatwiri"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    name: String,
    title: String,
    phone: String,
    email: String,
    social: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.android_logo)
    val backgroundColor = Color(0xFFF0F4F8) // Soft light blue/gray
    val rowColor = Color(0xFFD1E8E4) // Soft teal-green for the Row

    // Main background

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEADDFF))
            
    ) {
        Column(
            modifier = Modifier
                .padding(bottom = 80.dp)
        ) {
            Image(
                painter = image,
                contentDescription = "android logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(100.dp)
                    .padding(20.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = name,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp)
            )

            Text(
                text = title,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
        Text(
            text = phone,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = email,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(12.dp)
        )
        Text(
            text = social,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCard(
            name = "Caroline Gatwiri",
            title = "Android Mobile Developer",
            phone = "+254746414729",
            email = "caroline1gatwiri@gmail.com",
            social = "https://github.com/Caroline-Gatwiri"
        )
    }
}
package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
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
    val image = painterResource(id = R.drawable.android_logo)
    val phoneIcon = painterResource(id = R.drawable.phone_24dp_e8eaed)
    val emailIcon = painterResource(id = R.drawable.email_24dp_e8eaed)
    val socialIcon = painterResource(id = R.drawable.share_24dp_e8eaed)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F4F8))
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
                    .padding(20.dp)
                    .align(Alignment.CenterHorizontally)
                    .height(170.dp)
                    .width(170.dp)
            )

            Text(
                text = name,
                fontSize = 30.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp)
            )

            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        )  {
            Icon(
                painter = phoneIcon,
                contentDescription = "An icon of a phone",
                modifier = Modifier
                    .size(24.dp)
            )
            Text(
                text = phone,
                modifier = Modifier
                    .padding(start = 8.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            //horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .padding(8.dp)
        )  {
            Icon(
                painter = emailIcon,
                contentDescription = "An icon of a phone",
                modifier = Modifier
                    .size(24.dp)

            )
            Text(
                text = email,
                modifier = Modifier
                    .padding(start = 24.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Icon(
                painter = socialIcon,
                contentDescription = "An icon of a phone",
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = social,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
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

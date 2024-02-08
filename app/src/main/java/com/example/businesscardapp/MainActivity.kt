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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.material3.Icon

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
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting( ) {

    Column ( modifier = Modifier
        .background(Color(0xFFB9F6CA))
        ){
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .size(140.dp)
                    .background(Color(0xFF004D40))
            )
            Text(
                text = "Jennifer Doe",
                fontSize = 50.sp,
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            Text(
                text = "Android devoloper Extraordinaire",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                style = TextStyle(color = Color(0xFF004D60)),
                modifier = Modifier
                    .padding(top = 10.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .weight(0.7f)
                .fillMaxSize()
        ) {
            Row (modifier =  Modifier.padding(start = 80.dp )) {
                Icon(Icons.Filled.Call, contentDescription = null,
                    tint =  Color(0xFF0b993a)
                )
                Text(
                    text = "+ 11 (123) 444 555 666",
                    fontSize = 17.sp,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .padding(bottom = 20.dp,  start = 20.dp)

                )
            }
            Row (modifier =  Modifier.padding(start = 80.dp )){
           Icon(Icons.Filled.Share , contentDescription = null,
               tint =  Color(0xFF0b993a))
            Text(text = "@AndroidDev",
                fontSize = 17.sp,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .padding(bottom = 20.dp,  start = 20.dp))
            }
            Row (modifier =  Modifier.padding(start = 80.dp )) {
                Icon(Icons.Filled.Email, contentDescription = null,
                    tint =  Color(0xFF0b993a))
                Text(
                    text = "jen.doe@android.com",
                    fontSize = 17.sp,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .padding(bottom = 50.dp,  start = 20.dp)

                )
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Greeting()
    }
}
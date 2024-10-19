package com.dev.appku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.appku.ui.theme.AppKuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppKuTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)

                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(
    modifier: Modifier = Modifier
) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
        ){
        Text(text = "Manchester City",
            modifier = modifier.padding(bottom = 20.dp),
        style = TextStyle (
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue

        ),
        )
        Text(text = "Klub Sepak Bola",
            modifier = Modifier.padding(bottom =20.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )



        Image(painterResource(id = R.drawable.logo), contentDescription = "logo",
        modifier = Modifier.size(300.dp).padding(bottom = 20.dp)
        )



        Text(text = "Nama :",
          //  modifier = modifier.padding(bottom = 5.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Text(text = "Muhamad Fathur Irwan ",
          //  modifier = modifier.padding(bottom = 5.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,

        )

            Text(text = "20220140088 ",
          //  modifier = modifier.padding(bottom = 5.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
                color = Color.Blue

        )

        Image(painterResource(id = R.drawable.fathur), contentDescription = " ",
            modifier = Modifier.size(300.dp).padding(bottom = 20.dp).clip(RoundedCornerShape(60.dp))
        )

    }
}








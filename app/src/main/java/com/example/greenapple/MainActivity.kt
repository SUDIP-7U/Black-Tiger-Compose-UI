package com.example.greenapple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewApp()

        }
    }
}
@Composable
fun NewApp() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)){
        Row() {
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "Sample Image",
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(14.dp))
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Sample Image",
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(14.dp))
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Sample Image",
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Crop)
        }
        Spacer(modifier = Modifier.height(13.dp))

        Text(text = "PUBG BOX  Panther Version ",
            fontSize = 12.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(13.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.img_3),
                contentDescription = "Sample Image",
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Crop)
            Image(painter = painterResource(id = R.drawable.img_4),
                contentDescription = "Sample Image",
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.width(3.dp))
            Image(painter = painterResource(id = R.drawable.img_1),
                contentDescription = "Sample Image",
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Crop)
        }
        Spacer(modifier = Modifier.height(13.dp))
        Box(modifier = Modifier.fillMaxWidth().height(150.dp)) {
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "Background Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(13.dp))

        Box(modifier = Modifier.fillMaxWidth().height(150.dp)) {
            Image(painter = painterResource(id = R.drawable.img_2),
                contentDescription = "Background Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(13.dp))

        val items = listOf(

            Triple("পাউডার দুধ (১ কেজি)", "৭৫০–৭৮০ টাকা ➝ ৮২০–৮৫০ টাকা", "+৭০ টাকা"),
            Triple("বয়লার মুরগি", "১৬০–১৭০ টাকা ➝ ২০০–২২০ টাকা", "+৪০–৫০ টাকা/কেজি"),
            Triple("ডিম", "১০০–১১০ টাকা ➝ ১১০–১১৫ টাকা", "+১০ টাকা/ডজন")
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(items) { item ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(text = item.first,
                            color = Color.Black,
                            style = MaterialTheme.typography.bodyLarge)
                        Text(text = "আগে ➝ পরে: ${item.second}", style = MaterialTheme.typography.bodyMedium)
                        Text(text = "বৃদ্ধি: ${item.third}", style = MaterialTheme.typography.bodySmall, color = Color.Red)
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    NewApp()
}
package com.rikky.trpl5b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rikky.trpl5b.ui.theme.TRPL5bTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloMessage(name = "Rikky ", "Rifaldo")
        }
    }
}

@Composable
fun HelloMessage(name: String, s: String) {
    Column(
        modifier = Modifier.padding(all = 100.dp).background(Color.Red))
    {
        Text(text = "Hello $name $s")
    }
}

package com.example.oamk_mobilenative_assignment6_oliver_kern

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.oamk_mobilenative_assignment6_oliver_kern.composables.ScaffoldApp
import com.example.oamk_mobilenative_assignment6_oliver_kern.ui.theme.Oamk_mobileNative_assignment6_oliver_kernTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Oamk_mobileNative_assignment6_oliver_kernTheme {
                ScaffoldApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Oamk_mobileNative_assignment6_oliver_kernTheme {
        ScaffoldApp()
    }
}
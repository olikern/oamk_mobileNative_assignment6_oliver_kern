package com.example.oamk_mobilenative_assignment6_oliver_kern.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = {
            MainTopBar(
                title = "My App",
                navController = navController
            )
        },
        content = { innerPadding ->
            Text(
                modifier = Modifier
                    .padding(innerPadding),
                text = "Content for Home screen",
            )
        },
    )
}
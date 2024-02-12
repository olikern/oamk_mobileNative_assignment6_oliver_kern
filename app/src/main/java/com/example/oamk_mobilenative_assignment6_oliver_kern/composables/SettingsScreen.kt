package com.example.oamk_mobilenative_assignment6_oliver_kern.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SettingsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            ScreenTopBar(
                title = "Settings",
                navController = navController
            )
        },
        content = { innerPadding ->
            Text(
                modifier = Modifier
                    .padding(innerPadding),
                text = "Content for Settings screen",
            )
        },
    )
}

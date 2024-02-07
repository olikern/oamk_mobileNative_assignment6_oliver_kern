package com.example.oamk_mobilenative_assignment6_oliver_kern.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldApp() {
    Scaffold(
        topBar = { MyTopBar() },
        content = {innerPadding ->
            Text(
                modifier = Modifier
                    .padding(innerPadding),
                text = "Content for Home screen",
            )},
        // bottomBar = { BottomAppBar { Text(text = "Bottom bar")}}
    )
}
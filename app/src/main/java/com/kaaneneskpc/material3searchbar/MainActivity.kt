package com.kaaneneskpc.material3searchbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kaaneneskpc.material3searchbar.component.Material3SearchBar
import com.kaaneneskpc.material3searchbar.ui.theme.Material3SearchBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Material3SearchBarTheme {
                Material3SearchBar()
            }
        }
    }
}
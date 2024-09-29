package com.rusydy.onemonthapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.rusydy.onemonthapp.data.sampleRecipes
import com.rusydy.onemonthapp.ui.theme.OnemonthappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnemonthappTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    RecipeListScreen(recipes = sampleRecipes)
                }
            }
        }
    }
}
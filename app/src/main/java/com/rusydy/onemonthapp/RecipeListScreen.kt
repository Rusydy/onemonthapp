package com.rusydy.onemonthapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rusydy.onemonthapp.data.Recipe
import com.rusydy.onemonthapp.data.sampleRecipes
import com.rusydy.onemonthapp.ui.theme.OnemonthappTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeListScreen(recipes: List<Recipe>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("30 Days of Recipes") }
            )
        }
    ) {
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            modifier = Modifier.padding(it)
        ) {
            items(recipes) { recipe ->
                RecipeCard(recipe = recipe)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecipeListScreen() {
    OnemonthappTheme {
        RecipeListScreen(recipes = sampleRecipes)
    }
}
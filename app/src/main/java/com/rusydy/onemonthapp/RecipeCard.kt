package com.rusydy.onemonthapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rusydy.onemonthapp.data.Recipe

@Composable
fun RecipeCard(recipe: Recipe) {
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Day ${recipe.day}: ${recipe.title}",
                style = MaterialTheme.typography.titleSmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = recipe.description, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Ingredients: ${recipe.ingredients.joinToString(", ")}",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Instructions: ${recipe.instructions}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
@Preview
fun PreviewRecipeCard() {
    RecipeCard(
        Recipe(
            day = 1,
            title = "Spaghetti Carbonara",
            description = "A classic Italian pasta dish.",
            ingredients = listOf("Spaghetti", "Eggs", "Pancetta", "Parmesan Cheese", "Pepper"),
            instructions = "1. Boil pasta. 2. Cook pancetta. 3. Mix eggs and cheese. 4. Combine all."
        )
    )
}

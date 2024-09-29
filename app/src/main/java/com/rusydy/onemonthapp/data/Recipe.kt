package com.rusydy.onemonthapp.data

data class Recipe(
    val day: Int,
    val title: String,
    val description: String,
    val ingredients: List<String>,
    val instructions: String
)

val sampleRecipes = listOf(
    Recipe(
        day = 1,
        title = "Spaghetti Carbonara",
        description = "A classic Italian pasta dish.",
        ingredients = listOf("Spaghetti", "Eggs", "Pancetta", "Parmesan Cheese", "Pepper"),
        instructions = "1. Boil pasta. 2. Cook pancetta. 3. Mix eggs and cheese. 4. Combine all."
    ),
    Recipe(
        day = 2,
        title = "Chicken Teriyaki",
        description = "Japanese-inspired chicken recipe.",
        ingredients = listOf("Chicken Breast", "Soy Sauce", "Sake", "Sugar", "Ginger"),
        instructions = "1. Marinate chicken. 2. Cook chicken. 3. Add sauce. 4. Serve with rice."
    ),
    // Add more recipes here for 30 days
)

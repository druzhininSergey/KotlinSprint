package lesson_11

class RecipeCategory(
    val pageName: String = "Категории",
    val pagePhoto: String,
    val id: Int,
    val dishCategory: String,
    val categoryImage: String,
    val description: String,
)

class Recipe(
    val pageName: String,
    val pagePhoto: String,
    val id: Int,
    val dishName: String,
    val dishImage: String,
)

class Ingredients(
    val pageName: String = "Ингредиенты",
    val dishId: String,
    val dishName: String,
    val pagePhoto: String,
    val portions: Int,
    val ingredientNames: MutableSet<String>,
    val ingredientAmount: MutableList<Int>,
    val inFavorites: Boolean = false,
)
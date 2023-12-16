package lesson_11

class RecipeCategory(
    val id: Int,
    val categoryName: String,
    val categoryImage: String,
    val description: String,
    val dish: MutableList<Dish>
)

class Dish(
    val id: Int,
    val dishName: String,
    val dishImage: String,
    val ingredient: MutableList<Ingredient>,
    val inFavorites: Boolean = false,
)

class Ingredient(
    val id: Int,
    val ingredientName: String,
    val ingredientAmount: Int,
    val portions: Int,
)
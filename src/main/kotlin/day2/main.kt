package day2

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

//2. **African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.
open class Recipe(var ingredient:String,var preparationTime:String,var cookingMethod:String,var nutrients:String){

}
class MoroccanRecipe(ingredient: String,preparationTime: String,cookingMethod: String,nutrients: String):Recipe(ingredient, preparationTime, cookingMethod, nutrients){

}
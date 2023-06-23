fun main(args: Array<String>) {
    var moroccanRecipe=MoroccanRecipe(listOf("chicken","greenolives"),"1hour","boiling","carbohydrates")
    println(moroccanRecipe.dishes("Tagine"))
    var ethiopianRecipe=EthiopianRecipe(listOf("barley","teff_flour"),"20mins","baking","carbohydrates")
    println(ethiopianRecipe.dishes("injera"))
    var nigerianRecipe=NigerianRecipe(listOf("barley","teff_flour"),"20mins","baking","carbohydrates")
    println(nigerianRecipe.dishes("jollof"))

}

//2. **African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.
open class Recipe(var ingredients:List<String>,var preparationTime:String,var cookingMethod:String,var nutrients:String) {

}
class MoroccanRecipe(ingredients:List<String>,preparationTime: String,cookingMethod: String,nutrients: String):Recipe(ingredients,preparationTime,cookingMethod,nutrients){
    fun dishes(food:String):String{
        return "$food is prepared using $ingredients ,it takes $preparationTime,how to prepare it $cookingMethod and it provides you with $nutrients nutrients "

    }
}
class EthiopianRecipe(ingredients: List<String>,preparationTime: String,cookingMethod: String,nutrients: String):Recipe(ingredients,preparationTime,cookingMethod,nutrients){
    fun dishes(food:String):String{
        return "$food is prepared using $ingredients ,it takes $preparationTime,how to prepare it $cookingMethod and it provides you with $nutrients nutrients "

    }
}
class NigerianRecipe(ingredients: List<String>,preparationTime: String,cookingMethod: String,nutrients: String):Recipe(ingredients,preparationTime,cookingMethod,nutrients){
    fun dishes(food:String):String{
        return "$food is prepared using $ingredients ,it takes $preparationTime,how to prepare it $cookingMethod and it provides you with $nutrients nutrients "

    }
}


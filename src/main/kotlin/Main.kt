fun main(args: Array<String>) {
    var stories=Story("caucasian",234,"german king",17)
    println(stories.record())

    var storyteller1=Story.Storyteller("wendy","kikuyu")
    println(storyteller1.tellStory())

    var translator = Story.Translator()
    println(translator.translate("kikuyu"))


}
//1. **Ancestral Stories:** In many African cultures, the art of storytelling is passed
//down from generation to generation. Imagine you're creating an application that
//records these oral stories and translates them into different languages. The
//stories vary by length, moral lessons, and the age group they are intended for.
//Think about how you would model `Story`, `StoryTeller`, and `Translator`
//objects, and how inheritance might come into play if there are different types of
//stories or storytellers.
class Story(var title: String, var length:Int,var lesson:String,var ageGroup:Int){
    fun record():String{
        return "the story $title is $length pages,it talks about $lesson and it is for people of the age $ageGroup"


    }

    class Storyteller (var name:String,var language:String) {
        fun tellStory(): String {
            return "today our storyteller is $name and she speaks $language , she is going to tell this type of story "

        }
    }
    class Translator {
        fun translate(targetLanguage: String):String{
            return "story is  translated in $targetLanguage"

        }
    }

}


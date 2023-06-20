// **Ancestral Stories:** In many African cultures, the art of storytelling is passed
// down from generation to generation. Imagine you're creating an application that
// records these oral stories and translates them into different languages. The
// stories vary by length, moral lessons, and the age group they are intended for.
// Think about how you would model `Story`, `StoryTeller`, and `Translator`
// objects, and how inheritance might come into play if there are different types of
// stories or storytellers.

class Story{
    constructor(title,length,lesson,ageGroup){
        this.title= title
        this.length=length
        this.lesson=lesson
        this.ageGroup=ageGroup
    }
    record(){
        return `the story ${this.title}which has ${this.length} pages and has the following lesson ${this.lesson}`
    }


}
const story=new Story("betrayal",150,"colonial period",14)
console.log(story.record())

class StoryTeller{
    constructor(name,language){
        this.name=name
        this.language=language

    }
    tellStory(){
        return `today our story teller is ${this.name} and she speaks ${this.language}`
    }

}
const storyTeller =new StoryTeller("kelly","Kisii")
console.log(storyTeller.tellStory());

class Translator{
    translate(targetLanguage){
        return `story is translated in ${targetLanguage}`
    }

}
const translator=new Translator()
console.log(translator.translate("Kisii")); 


# 1. **Ancestral Stories:** In many African cultures, the art of storytelling is passed
# down from generation to generation. Imagine you're creating an application that
# records these oral stories and translates them into different languages. The
# stories vary by length, moral lessons, and the age group they are intended for.
# Think about how you would model `Story`, `StoryTeller`, and `Translator`
# objects, and how inheritance might come into play if there are different types of
# stories or storytellers.

class Story:
    def __init__(self,title,length,lesson,age_group):
       self.title=title
       self.length=length
       self.lesson=lesson
       self.age_group=age_group

    def record(self):
           print (f"the story {self.title } which has {self.length} pages and has the following lessons {self.lesson}")
           

story=Story("betrayal",150,"colonial period",14)
story.record()

class Storyteller:
     def __init__(self,name,language):
          self.name=name
          self.language=language

     def tell_story(self):
      print(f"today our storytell is{self.name} and she speaks in {self.language}")

storyteller=Storyteller("wendy","kikuyu")
storyteller.tell_story() 

class Translator:
        
    def translate(self,targetLanguage):
        print(f"story is  translated in {targetLanguage}")

translator=Translator()
translator.translate("kikuyu")

        
                

          
          

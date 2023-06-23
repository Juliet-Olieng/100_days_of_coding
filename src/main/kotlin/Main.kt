fun main(args: Array<String>) {
    var predator=Species.Predator("meat",100,"food","carnivores")
    println(predator.lifeStyle())
    var prey=Species.Prey("vegetables",20,"pasture","herbivous")
    println(prey.preyLifeStyle())

//    four
    var artist=Artist("bahati","kenya","gospel","piano")
    println(artist.presentArtist())
    var performance=Performance("bahati","9:30am","11:30am")
    println(performance.perform())
    var musicPerformance=Performance.MusicPerformance("ken rodgers","11:40pm","12:50pm")
    println(musicPerformance.perform())
    var dance=Performance.DancePerformance("korokocho","9:30am","10:00am")
    println(dance.perform())
//
//    var stage=Stage("lions",100)
//    stage.arrangeStage()
    var mainStage=Stage.MainStage("zebra",50)
    mainStage.performingOnStage()
    var stage2=Stage.Stage2("lion",100)
    stage2.performingOnStage()
}
//3. **Wildlife Preservation:** You're a wildlife conservationist working on a
//program to track different species in a national park. Each species has its own
//characteristics and behaviors, such as its diet, typical lifespan, migration
//patterns, etc. Some species might be predators, others prey. You'll need to
//create classes to model `Species`, `Predator`, `Prey`, etc., and think about how
//these classes might relate to each other through inheritance.
open class Species (var diet:String,var lifeSpan:Int,var migrations:String,var pattern:String){

    class Predator(diet: String,lifeSpan: Int,migrations: String,pattern: String):Species(diet, lifeSpan, migrations, pattern){
        fun lifeStyle():String{
            return "predators feed on $diet they live for $lifeSpan years "
        }
    }
    class Prey(diet: String,lifeSpan: Int,migrations: String,pattern: String):Species(diet, lifeSpan, migrations, pattern){
        fun preyLifeStyle():String{
            return "predators feed on $diet they live for $lifeSpan years "

        }
    }
}
//    4. **African Music Festival:** You're in charge of organizing a Pan-African music
//    festival. Many artists from different countries, each with their own musical style
//    and instruments, are scheduled to perform. You need to write a program to
//    manage the festival lineup, schedule, and stage arrangements. Think about how
//    you might model the `Artist`, `Performance`, and `Stage` classes, and consider
//    how you might use inheritance if there are different types of performances or
//    stages
class Artist(var name:String,var country:String,var musicalStyle:String,var instruments:String){
    fun presentArtist():String{
        return "$name $country $musicalStyle $instruments"

    }
}
open class Performance(var performingArtist:String,var startTime:String,var endTime:String){
    open fun perform():String{
        return "on the music performance we will have $performingArtist first and her performance will start at $startTime and end at $endTime"

    }
  class MusicPerformance(performingArtist: String,startTime: String,endTime: String):Performance(performingArtist, startTime, endTime){
      override fun perform(): String {
          return super.perform()
      }
  }
    class DancePerformance(performingArtist: String,startTime: String,endTime: String):Performance(performingArtist, startTime, endTime){
        override fun perform(): String {
            return super.perform()
        }
    }

}

open class Stage(var name: String,var capacity:Int){

    class MainStage(name: String,capacity: Int):Stage(name, capacity){
        fun performingOnStage(){
            val arrangement1= mutableListOf<Map<String,Any>>()
            val list= mutableMapOf<String,Any>()
            list["artist1"]="penroid"
            list["artist2"]="bill Gaither"
            list["artist3"]="jabidii"
            list["artist4"]="ken rodgers"
            arrangement1.add(list)
            println(arrangement1)

        }
    }
    class Stage2(name: String,capacity: Int):Stage(name, capacity){
        fun performingOnStage(){
            val arrangement2= mutableListOf<Map<String,Any>>()
            val list= mutableMapOf<String,Any>()
            list["artist1"]="penroid"
            list["artist2"]="bill Gaither"
            list["artist3"]="jabidii"
            list["artist4"]="ken rodgers"
            arrangement2.add(list)
            println(arrangement2)
        }

    }

}



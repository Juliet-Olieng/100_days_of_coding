fun main(args: Array<String>) {
    var product1=Product("banana",200,50)
    println(product1.calculateTotal())
    var product2=Product("mangoes",50,20)
    println(product2.calculateTotal())

//    question six
    var student=Student("Whitney",13, listOf(60,87,90,85))
    println(student.displayInfo())
    println(student.calculateAverage())
    student.gradingStudent()


}
//5. Create a class called Product with attributes for name, price, and quantity.
//Implement a method to calculate the total value of the product (price * quantity).
//Create multiple objects of the Product class and calculate their total values.

class Product (var name:String,var price:Int,var quantity:Int){
    fun calculateTotal(): String {
        var total= price * quantity
        return "the total value of $name is $total"
    }
}
//6. Implement a class called Student with attributes for name, age, and grades (a
//list of integers). Include methods to calculate the average grade, display the
//student information, and determine if the student has passed (average grade >=
//60). Create objects for the Student class and demonstrate the usage of these
//methods.
class Student (var name: String,var age:Int,var grade:List<Int>){
    fun displayInfo():String{
        return "$name,$age years,$grade"

    }
    open fun calculateAverage():Int{
        var sum =0
        for (i in grade){
            sum +=i

        }
        var average =sum/grade.size
        return average

    }
    fun gradingStudent(){
        if (calculateAverage() >=60){
            println("pass")
        }
        else{
            println("failes")
        }

    }


    }




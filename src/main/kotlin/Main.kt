fun main(){
var mercy  = Human("mercy",20,59)
    mercy.eat(10)
    mercy.speak("i am 10 years old")
    mercy.increment(1)
    var statement =data("mercy","cheptoo",0,0,2258)
    println(statement.firstName)
    println(statement.lastName)
}
class Human(var name:String,var age:Int,var Weight:Int) {


    fun eat(foodWeight:Int) {
        var add=foodWeight+Weight
        println("I am eating ${foodWeight}Kgs of food")

        }
    fun speak(speech:String){
        println(speech)
    }
    fun increment(birthday:Int){
        var addition= age + birthday
        println(addition)
    }
    //2. Create a data class User with these fields: firstName, lastName, email,
   // phoneNumber, password. Create an instance of User and print out any 2
   // attributes (3 points)

    }
class data(var firstName:String,var lastName:String,var email:Int,var phoneNumber:Int,var password:Int){

}

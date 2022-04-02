fun main() {
    var banker = Banker("Peter", 25)
    var doctor = Doctor("Hesbon", 65)
    var farmer = Farmer("Wanjala", 35)

    banker.talk("Hello Ashly")
    banker.eat()
    banker.sleep()
    banker.introduction()

    doctor.talk("Hello Ashly")
    doctor.eat()
    doctor.sleep()
    doctor.introduction()

    farmer.talk("Hello Ashly")
    farmer.eat()
    farmer.sleep()
    farmer.introduction()
}

open class Person(var name: String, var age: Int) {
    fun talk(words: String) {
        println(words)
    }
    open fun eat() {
        println("yum")
    }
    fun sleep() {
        println("zzzz")
    }
   open fun introduction(){
        println("Hi my name is $name")
    }
}
class Banker(name: String, age: Int) : Person(name, age) {
    fun countMoney(notes: Array<Int>): Int {
        return notes.sum()
    }
}
class Doctor(name: String, age: Int) : Person(name, age){
    fun treatPatient(patient: String, disease: String) {
        println("Treating $patient for $disease")
    }

    override fun introduction() {
        //super.introduction()
        println("Hi my name is Dr $name")
    }
}
class Farmer(name: String, age: Int):Person(name, age) {
    fun cultivateland() {
        println("dig dig dig")
    }

    override fun eat() {
       // super.eat()...it's used for extending or adding on...it's reference to parent class
        println("I am eating all the food that i have brought")
    }
}
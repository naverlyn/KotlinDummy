package Startup

class Animal(
        val name: String,
        val age: Int,
        val weight: Double,
        val isMammal: Boolean)
{
    fun eat()
    {
        println("$name Makan")
    }
    fun sleep()
    {
        println("$name tidur")
    }
}

fun main()
{
    val Cat = Animal("Njir", 2, 13.3, true)
    val Goat = Animal("Mabar", 5, 1.2, true)
    println("Nama: ${Cat.name}")
    println("Berat: ${Cat.weight}")
    println("Umur: ${Cat.age}")
    println("Mamalia: ${Cat.isMammal}")
    Cat.eat()
    Cat.sleep()

}
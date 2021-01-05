package Startup

class User(val name : String, val age: Int)
{
    override fun toString(): String
    {
        return "User(name=$name, age=$age)"
    }
}
data class DataUser(val name: String, val age: Int)


fun main()
{
    val user = User("Bleh", 19)

    val another = DataUser("BLEH", 20)

    println(user)
    println(another)
}
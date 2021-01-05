package Startup

fun main()
{
    val fullname = getFullName(my = "anjay", name = "mabar")
    println(fullname)
}

fun getFullName(
        my: String = "My",
        name: String = "Njir"): String
{
    return "$my $name"
}
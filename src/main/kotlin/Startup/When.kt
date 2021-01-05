package Startup

fun main()
{
    val values = 8

    val annotation = when(values)
    {
        6 -> println("value is 6")
        7 -> println("values is 7")
        8 -> println("8")
        else -> println("gaada")
    }
    println(annotation)


    val anyType : Any = 100L
    when(anyType)
    {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    val value =  27
    val ranges = 10..50

    when(value)
    {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}
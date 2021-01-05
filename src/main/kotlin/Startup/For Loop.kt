package Startup

fun main()
{
    val ranges = 1..5
    for (i in ranges)
    {
        println("value is $i!")
    }

    val range = 1.rangeTo(10) step 2
    for (j in range )
    {
        println("value is $j!")
    }


}
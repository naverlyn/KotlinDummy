package Startup

fun main()
{
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (j in listOfInt)
    {
        if (j == null) break
        print(j)
    }

    //loop
    loop@ for (i in 1..10)
    {
        println("Outside Loop")

        for (k in 1..10)
        {
            println("Inside Loop")
            if ( k > 5) break@loop
        }
    }
}
package Startup

fun main()
{
    val rangee = 1..10
    println(rangee.step)



    val range = 1..10 step 2
    range.forEach {
        print("$it ")
    }
    println(range.step)

    val rangeTO = 1.rangeTo(10) //naik
    println(rangeTO.step)

    val downTO = 10.downTo(1) //turun
    println(downTO.step)


    val tenO = 10.downTo(1)
    if(7 in tenO)
    {
        println("7 ada didalem")
    }

    //karakter
    val chara = 'A'.rangeTo('F')
    if('A' in chara)
    {
        println("yes")
    }
}
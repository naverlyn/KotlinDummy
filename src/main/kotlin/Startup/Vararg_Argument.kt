package Startup

fun main()
{
    val num = sumNumber(20, 20, 20, 20, 44444)
    println(num)
    val num2 = getNumberSize(20, 20, 20, 20, 20)
    println(num2)
}

fun sumNumber(vararg num: Int): Int
{
    return num.sum();
}

fun getNumberSize(vararg num2: Int): Int
{
    return num2.size
}
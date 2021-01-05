package Startup

fun main()
{
    val Array = arrayOf(1, 2, 4, 22, 20) //array biasa
    val mixedArray = arrayOf(1, 2, 3, "Anjay", true)
    /*
        Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan memanfaatkan beberapa fungsi spesifik berikut:
        intArrayOf() : IntArray
        booleanArrayOf() : BooleanArray
        charArrayOf() : CharArray
        longArrayOf() : LongArray
        shortArrayOf() : ShortArray
        byteArrayOf() : ByteArray
        Jika kita ingin membuat Array yang hanya bisa dimasukkan nilai dengan tipe data Int, gunakan intArrayOf()
     */
    println(Array[2])
    println(mixedArray[3])

    //menggunakan constructor Array() biasa
    val an = Array(4, {i -> i * i})

    println(an[3])

}
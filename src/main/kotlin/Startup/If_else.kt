package Startup

fun main()
{
//    val open = 7
//    val closed = 20
//    val strings: String
//
//    //bisa pake cara ini juga
//    strings = if (open > closed)
//    {
//        "Buka"
//    }
//    else
//    {
//        "Tutup"
//    }

    //bisa pake cara ini
//    {
//        strings = "Tutup"
//    }
//    else
//    {
//        strings = "Buka"
//    }
//
//    println(strings)

    //bisa juga kek gini
    val openOffice = 7
    val now = 7
    val office: String

    office = if (now > 7)
    {
        "Office buka"
    }
    else if (now == openOffice)
    {
        "Office bentar lagi buka"
    }
    else
    {
        "Anjay tutup, bos"
    }
println(office)
}
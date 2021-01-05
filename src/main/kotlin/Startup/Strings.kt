package Startup

fun main()
{
    //string
    val string = "Mabar"
    //index
    val first = string[0] //mengambil isi variabel string, yaitu M

    println("awalan dari $string adalah $first") //keluaran 'awalan dari Mabar adalah M'

    for (char in string)
    {
        print("$char") //sama, tapi bisa dipisah pake println
    }

    /* escaped text:
            \t: menambah tab ke dalam teks.
            \n: membuat baris baru di dalam teks.
            \b: menghapus satu karakter sebelumnya.
            \r: menghapus semua karakter sebelumnya.
            \’: menambah karakter single quote kedalam teks.
            \”: menambah karakter double quote kedalam teks.
            \\: menambah karakter backslash kedalam teks.
     */
    val s = "AOWKAOWKAOWK \"anjur\""

    println(s)

    val unicode = "\u0394" //bisa memakai unicode disini
    println(unicode)

/*
    nulis\n
    kek\n
    gini
 */
    //cara ini lebih simpel daripada nulis pake \n semuanya
    val line = """
        misal
        gw
        nulis
        kek
        gini
    """.trimIndent()
    println(line)
}
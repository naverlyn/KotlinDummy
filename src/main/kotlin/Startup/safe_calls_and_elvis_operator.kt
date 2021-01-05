package Startup

fun main()
{
    val text: String? = null //ga dikasih izin

    //safe calls (?.)
    // safe call akan menjamin kode yang kita tulis aman dari NullPointerException. Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.) saat mengakses atau mengelola nilai dari objek nullable.
    text?.length

    //menggunakan elvis (?:) Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
    val text2: String? = null
    val textLength = text2?.length ?: 7

    //elvis bisa kek gini juga
    val textLength1 = if(text2 != null) text2.length else 7

    //non-null assertion(!!)
    //non-null assertion kompiler akan mengizinkan kita untuk mengakses atau mengelola nilai dari sebuah objek nullable. Namun penggunaan operator tersebut sangat tidak disarankan karena akan memaksa sebuah objek menjadi non-null. Sehingga ketika objek tersebut bernilai null, Anda tetap akan berjumpa dengan NullPointerException.
    val text3: String? = null
    val textLength2 = text3!!.length

}
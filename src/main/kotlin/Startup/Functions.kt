package Startup

fun setUser(user: String, age: Int): String //: String tandanya itu ngembaliin nilai return
{
    return  "Nama anda $user dan umur anda $age"
}

fun main()
{
    val user = setUser("Aula nur", 20) //panggil fungsi diatas, lalu masukin ke val user disini
    println(user)
}

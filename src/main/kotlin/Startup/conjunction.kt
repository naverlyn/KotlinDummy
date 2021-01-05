package Startup

fun main()
{
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    //konjungsi ( && ) atau bisa dibilang DAN
    val isOpen = if (now >= officeOpen && now <= officeClosed) //jika waktu sekarang kurang dari sama dengan buka DAN sekarang  kurang dari waktu sekarang, maka
    {
        true
    }
    else
    {
        false
    }
    println("Office is open : $isOpen")

    // sama kyk diatas, tapi lebih simpel
    val isOOpen = now >= officeOpen && now <= officeClosed
    print("Office is open: $isOOpen")

    //disjungsi ( || )
    val isOOOpen = now < officeOpen || now > officeClosed

    println("Office is closed : $isOOOpen")

    //negasi (!)
    val isOOOOpen = now > officeOpen

    //jika nilai true, yg dikeluarkan nilai false
    if (!isOOOOpen) {
        print("Office is closed")
     } else {
        print("Office is open")
    }
}
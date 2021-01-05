package Startup

fun main()
{
    var numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val cut = numberList.filter{
        it % 2 == 0
    }
    val cut2 = numberList.filterNot{
        it % 2 == 0
    }

    //pake map
    val cut3 = numberList.map{
        it * 3
    }

    val number = numberList.find{
        it % 2 == 0
    }

    println(numberList)
    println(cut)    //dibagi 2
    println(cut2)   //yg dibagi 2 ilang
    println(cut3)   //pake map, dikali 3
    println(numberList.count()) //dihitung isi index variabel numberLIst
    println(numberList.count{
        it % 2 == 0
    })  //kelipatan dari 2
    println(number)
}
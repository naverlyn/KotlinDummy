package Startup

fun main()
{
//    val warna: Color = Color.RED
//    print(warna)
//    val warna2: Color = Color.GREEN
//    print(warna2)

}

    enum class Color(val value: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }

//enum class Color (val value: Int)
//{
//    RED(0xFF0000){
//        override fun printValue() {
//            println("value of RED is $value")
//        }
//    },
//    GREEN(0x00FF00){
//        override fun printValue() {
//            println("value of GREEN is $value")
//        }
//    },
//    BLUE(0x0000FF){
//        override fun printValue() {
//            println("value of BLUE is $value")
//        }
//    };
//
//    abstract fun printValue()
//}
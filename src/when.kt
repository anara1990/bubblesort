import kotlin.math.sqrt
//fun main() {
  //  val score = -5

    //when (score) {
      //  in 90..100 -> println("5")
        //in 70..90 -> println("4")
        //in 50..70 -> println("3")
        //in 30..50 -> println("2")
        //in 1..30 -> println("1")
        //else -> println("Invalid score")
    //}


    //val a = 5
    //val b = 3

    //val maxValue = when(a > b) {
      //  true -> a
      //  false -> b
        //}
    //println("maxValue = $maxValue ")
//}

fun main() {
    print("")
    val month = readLine()!!.toInt()

    when (month){
        4 , 6 , 9 , 11 -> println("Месяц ${month} - 30 дней")
        1 , 3 , 5 , 7 , 8 , 10 , 12 -> println("Месяц ${month} - 31 дней")
        2 -> println("Февраль 28-29 дней")


    }



    print("x = ")
    val x = readLine()!!.toDouble()
    print("y = ")
    val y = readLine()!!.toDouble()
    print("radius = ")
    val r = readLine()!!.toDouble()
    val h = sqrt(x * x + y * y) // длины отрезка между точкой и началом координат по теореме Пифагора

    when {
        h > r -> println("точка находится за пределами круга")
        else -> println("Точка принадлежит кругу")
    }
    println("h = ${h}")
}
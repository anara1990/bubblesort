//fun main(){
  //  print("Введите h1:")
    //var h1 = readLine()!!.toDouble()
    //print("Введите h2:")
    //var h2 = readLine()!!.toDouble()

    //val duration = h2 - h1

    //println("Duration = ${duration * 60}")

    
//}

fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println("a=$a and b=$b")

    a = b.also { b = a }
    println("now a=$a and b=$b")
}

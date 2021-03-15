//fun main() {
  //  var a = 10
    //var b = 3

   // println("-a = ${-a}")

    //println("a++ = ${a++}")
    //println("++a = ${++a}")

    //println("a-- = ${a--}")
    //println("--a = ${--a}")


    //println("a+b = ${a+b}")
    //println("a-b = ${a-b}")
    //println("a*b = ${a*b}")
    //println("a/b = ${a/b}")
    //println("a%b = ${a%b}")

    //println("2+2*5 = ${(2+2)*5}")

    //a += 2
    //println("a += 2 = $a")
    //a -= 2
    //println("a -= 2 = $a")
    //a *= 2
    //println("a *= 2 = $a")
    //a /= 2
    //println("a /= 2 = $a")
    //a %= 2
    //println("a %= 2 = $a")

//}
import kotlin.math.sqrt

fun main(){
    print("Введите а:")
    var a = readLine()!!.toDouble()
    print("Введите b:")
    var b = readLine()!!.toDouble()
    print("Введите c:")
    var c = readLine()!!.toDouble()
    var d = b * b - 4 * a * c

    println("x1 = ${(-b - sqrt(d)) / (2 * a)}")
    println("x2 = ${(-b + sqrt(d)) / (2 * a)}")

}


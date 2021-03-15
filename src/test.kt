fun main() {
    val a = 5
    val message = if((a % 2 ) == 0){
        println("a is even = ${a}")

    }else if ((a % 5) == 0) {
        println("a is divisible by 5 = ${a}")
    } else if((a % 1 ) == 0){
        println("a is not even and not divisible by 5 = ${a}")
    }else{
        println("message")
    }
}

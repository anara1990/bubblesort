fun main() {
    val score = -5

    if(score >= 90 && score <= 100) {
        println("5")
    }
    else if(score >= 70 && score <= 90) {
        println("4")
    }
    else if(score >= 70 && score <= 50) {
        println("3")
    }
    else if(score >= 50 && score <= 30) {
        println("2")
    }
    else if(score >= 30 && score <= 1) {
        println("1")
    }
    else {
        println("Invalid score")
    }

    val a = 5
    val b = 3

    val maxValue = if(a > b){
        a
    } else{
        b
    }
    println("maxValue = $maxValue ")
}
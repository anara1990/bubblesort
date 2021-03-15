fun main(){
val myArray1 = arrayOf(1, 2, 3)
    val myArray2 = arrayOf(4, 5, 6)
    val total = myArray1 + myArray2
    println(total.sum())


    val numbers= intArrayOf(5, -3, 15, 61, 29, 10, -2 ,7)
    var largestElement = numbers[0]

    for (number in numbers){
        if(largestElement < number)
            largestElement = number
    }

    println("Наибольшее число в массиве: $largestElement")


}
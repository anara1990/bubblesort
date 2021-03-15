fun main() {
    var n = readLine()!!.toInt()
    var c = n
    var count: Int
    if(n == 0)
        count=1
    else
        count=0
    while(n != 0){
        count++
        n /= 10
    }
    println("число $c содержит $count цифр")



    var a = 1
    var b = 2
    while(a <= 20){
        print("$b")
        a++
        b *= 2
    }
}
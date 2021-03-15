fun main(){
    print("Введите число:")
    val i = readLine()!!.toInt()
    if(i % 10 + i / 10 % 10 == i / 100 % 10 + i / 1000){
        println("True")
    } else{
        println("False")
    }

    print("Введите ваш возраст:")
    val n = readLine()!!.toInt()

    if (n == 1) {
        println("Вам ${n} год.")
    }else if(n < 5){
    println("Вам ${n} годa.")
    } else if(n < 200){
    println("Вам ${n} лет.")
    }else{
        println("Invalid age")
    }
}
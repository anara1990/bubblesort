//Выполнить сортировку массива {10, 2, 10, 3, 1, 2, 5, 2,-1, 3}
//методом Простейшей сортировки (Bubble Sort) и загруз
//ить свой проект в git(Дз отправляете как ссылку на свой репозиторий)

fun main(){
    val array = arrayOf(10, 2, 10, 3, 1, 2, -5, 2,-1, 3)
    
    bubbleSort(array)
    //array.sort()
    array.forEach {println(it)}
}

fun bubbleSort(array: Array<Int>) {
    var arraySize = array.size
    for(targetPosition in 0..arraySize - 2) {
        for(currentPosition in 0..arraySize -2 - targetPosition){
            if (array[currentPosition] > array[currentPosition + 1]) {
                println("swap ${array[currentPosition]} ,${array[currentPosition + 1]} ")
                var temp = array[currentPosition]
                array[currentPosition] = array[currentPosition + 1]
                array[currentPosition + 1] = temp
            }else{
                println("not swap ${array[currentPosition]} , ${array[currentPosition + 1]}")
            }
        }

    }


}

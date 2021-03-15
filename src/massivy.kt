fun main(){
    //"Array"
    
    //Element 42 0 0 0 322
    //Index   0  1 2 3 4

    val myArray = Array(5){0}

    myArray[0] = 42
    myArray[4] = 322

     println(myArray[0])

    //"Array list"
    val myArrayList = ArrayList<String>()
    myArrayList.add("Kotlin")
    myArrayList.add("Java")
    myArrayList.add("Dart")

    myArrayList.add(1, "Python")

    myArrayList.remove("Java")

    println(myArrayList)
    println(myArrayList.size)


}
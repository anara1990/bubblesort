 fun main(){
    //Map
    val password = "12345"
    val username = "onepunchman_01"
    val name = "John"

    //val list = arrayListOf("123456","onepunchman_01","John")

    //Key value
    val myMap = hashMapOf<String,String>()

    myMap.put("password","12345")
    myMap.put("username","onepunchman_01")
    myMap.put("name","John")

    //myMap.remove("name")
    println(myMap.entries)



    println(myMap.get("password"))

    val mySet = HashSet<Int>()

    val list = arrayListOf(1,2,3,4,4,4,4,4,4,1,1)

    mySet.addAll(list)

    println(mySet)





}
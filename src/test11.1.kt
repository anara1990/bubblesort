var myMap: HashMap<String, String>? = null
fun  main() {
    val names = arrayListOf("KG","RU","USA","TR")
    val codes = arrayListOf("+996","+7","+1","+90")

    myMap = HashMap()

    codes.indices.forEach {
        myMap?.put(names[it],codes[it])
    }
    myMap?.forEach{
        println("${it.key}  ${it.value}")
    }



}
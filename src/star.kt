fun main() {
    for(i in 0..3){
      for(j in 0..4){
        print("* ");
    }
       println();
    }

    val n: Int = 5

    for (i in 0..5){
        for (j in 0 until n - i){
            print("  ")
        }

        for (j in i downTo 1){
            print("* ")
        }
        println()
    }


    }


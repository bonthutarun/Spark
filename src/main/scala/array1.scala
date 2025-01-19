object array1 {

    def main(args: Array[String]): Unit = {

      val arr: Array[Int] = Array(10, 20, 30, 40, 50)

      println("Array elements:")

      for (element <- arr) {

        println(element)
      }
    }



}

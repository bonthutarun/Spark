object CLOSURE {


    def main(args: Array[String]): Unit = {

      var number = 10  // Free variable

      val add = (x: Int) => x + number  // Closure function

      println(add(5))  // Output: 15

      number = 20  // Changing the free variable

      println(add(5))  // Output: 25
    }


}

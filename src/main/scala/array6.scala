

object array6 {


  def main(args: Array[String]): Unit = {
    var arr = Array(5, 10, 15, 20, 25)


    var largest = arr(0)
    var secondlarge = arr(0)


    for (element <- arr) {
      if (element > largest) {
        largest = element
      }
    }

    for (element <- arr) {

      if (element > secondlarge && element != largest) {
        secondlarge = element
      }
    }


    println(s"Largest element: $largest")
    println(s"Second largest element: $secondlarge")
  }
}
object array3 {

  def main(args: Array[String]): Unit = {

    val arr = Array(5, 10, 15, 20, 25)


    var sum: Int = 0

    for (element <- arr) {
      sum += element
    }


    println(s"The sum of array elements is: $sum")
  }












}

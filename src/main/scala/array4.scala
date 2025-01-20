

object array4 {
  def main(args: Array[String]): Unit = {
    val arr = Array(5, 10, 15, 20, 25)

    println("Array elements in reverse order:")
    for (i <- arr.length - 1 to 0 by -1) {
      println(arr(i))
    }
  }
}


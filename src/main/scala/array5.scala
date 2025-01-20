

object Array5 {

  def main(args: Array[String]): Unit = {
    var arr = Array(5, 10, 15, 20, 25)


    var large = arr(0)
    var small = arr(0)

    for (element <- arr) {

      if (element > large) {
        large = element
      }

      if (element < small) {
        small = element
      }
    }


    println(s"Largest: $large")
    println(s"Smallest: $small")
  }
}
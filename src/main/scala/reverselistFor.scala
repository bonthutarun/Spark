object reverselistFor {

  def main(args: Array[String]): Unit = {


    val list = List(1, 2, 3, 4, 5)

    for (i <- (list.length - 1) to 0 by -1) {


      println(list(i))
    }

  }
}

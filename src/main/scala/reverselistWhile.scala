
object reverselistWhile {

  def main(args: Array[String]): Unit = {

    val list  = List(1,2,3,4,5)

    var i = list.length - 1

    while(i >= 0) {

      print(list(i) + " ")
      i -=1
    }

  }
}



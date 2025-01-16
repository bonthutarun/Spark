object forloop03 {

  def main(args: Array[String]): Unit = {

   var sum = 0

    for (i<- 1 to 100) {
      sum +=i
      println(s"sum of numbers from 1 to 100 is : $sum")
    }

  }
}

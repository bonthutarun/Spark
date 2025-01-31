object factorialNum {

  //  def factorial (n:Int):Int = {
  //
  //    if (n==0 || n==1) 1
  //    else n * factorial(n-1)
  //  }

//  def factorial(n: Int): Int = {
//    var result = 1
//
//    for (i <- 1 to n) {
//      result *= i
//    }
//
//    result
//  }


//  def factorial(n: Int): Int = {
//    var result = 1
//
//    for (i <- 1 to n) {
//      result *= i
//    }
//
//    result
//  }


  def factorial (n:Int,result:Int):Int = {

        if ( n==1) result
        else  factorial(n-1,result * n)
      }







    def main(args: Array[String]): Unit = {

      val num = 5

      println(s"Factorial of $num is: ${factorial(num,1)}") // Output the result
    }
}


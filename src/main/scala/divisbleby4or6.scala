object divisbleby4or6 {

  def main(args: Array[String]): Unit = {
    // Input number
    val num = 24

    // Check if divisible by 4 or 6
    if (num % 4 == 0 || num % 6 == 0) {

      println("num is divisible by 4 or 6.")

    }
    else {
      println("num is not divisible by 4 or 6.")
    }
  }


}

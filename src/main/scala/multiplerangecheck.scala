object multiplerangecheck {

  def main(args: Array[String]): Unit = {

    val a = 25

    if (a>=1 || a<=10 && a >=10 || a<=20) {

      print("given number is in range")

    }
    else {

      print("out of range")
    }
  }



}

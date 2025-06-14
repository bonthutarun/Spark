

object ImplicitParameters {

  // Define a function with an implicit parameter
  def greet(name: String)(implicit greeting: String): String = {
    s"$greeting, $name!"
  }

  // Declare an implicit value in scope
  implicit val defaultGreeting: String = "Hello"

  // Main method to run the program
  def main(args: Array[String]): Unit = {
    val result = greet("Tarun") // Scala automatically uses the implicit greeting
    println(result) // Output: Hello, Tarun!
  }
}

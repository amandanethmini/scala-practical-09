import scala.io.StdIn.readLine

object pattern {
  def main(args: Array[String]): Unit = {
    val check: Int => String = (num: Int) => {
      if (num <= 0) {
        "Input is less than or equal to zero"
      } else if (num % 2 == 0) {
        "Input is an even number"
      } else {
        "Input is an odd number"
      }
    }

    println("Enter an integer: ")
    val num = readLine().toInt

    val result = check(num)

    println(result)
  }
}

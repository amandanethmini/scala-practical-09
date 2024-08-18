import scala.io.StdIn.readLine

object upperlower {
  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String =
    formatFunc(name)

  def main(args: Array[String]): Unit = {
    println("Enter a name for uppercase conversion:")
    val name1 = readLine()
    println("Enter a name for partial uppercase (first two letters):")
    val name2 = readLine()
    println("Enter a name for lowercase conversion:")
    val name3 = readLine()
    println(
      "Enter a name for custom format (capitalize first and last letters):"
    )
    val name4 = readLine()

    println(formatNames(name1)(toUpper))
    println(
      formatNames(name2)(name =>
        name.substring(0, 2).toUpperCase + name.substring(2)
      )
    )

    println(formatNames(name3)(toLower))
    println(
      formatNames(name4)(name =>
        name.substring(0, 1).toUpperCase + name
          .substring(1, 5)
          .toLowerCase + name.substring(5).toUpperCase
      )
    )
  }
}

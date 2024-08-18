import scala.io.StdIn.readLine

object interest {
  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = (deposit: Double) => {
      if (deposit <= 20000) {
        deposit * 0.02
      } else if (deposit <= 200000) {
        deposit * 0.04
      } else if (deposit <= 2000000) {
        deposit * 0.035
      } else {
        deposit * 0.065
      }
    }

    println("Enter the deposit amount:")
    val depositAmount = readLine().toDouble

    val interestEarned = calculateInterest(depositAmount)

    println(
      f"Interest earned on Rs. $depositAmount%.2f is Rs. $interestEarned%.2f"
    )
  }
}

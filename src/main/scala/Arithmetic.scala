import scala.annotation.tailrec

object Arithmetic {

  def isPrime(number : Int): Boolean = {
    if (number <= 1) {
      return false
    }
    !(2 until(number-1)).exists(number % _ == 0)
  }

  @tailrec
  def greatestCommonDivisor(firstNumber: Int, secondNumber: Int): Int = {
    if (secondNumber == 0) {
      firstNumber

    } else {
      greatestCommonDivisor(secondNumber, firstNumber % secondNumber)
    }
  }

  def isCoprime(firstNumber: Int, secondNumber: Int): Boolean = {
    greatestCommonDivisor(firstNumber, secondNumber) == 1
  }
}



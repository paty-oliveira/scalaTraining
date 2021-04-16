import scala.annotation.tailrec
import scala.math.sqrt

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

  def totient(number: Int): Int = {
    var phiCoeficient = 1

    for (i <- 2 to number) {
      if (greatestCommonDivisor(i, number) == 1) {
        phiCoeficient += 1
      }
    }
    phiCoeficient
  }

  def primeFactors(number: Int): List[Int] = {
    if (number <= 1) return List()

    def foo(number: Int, i: Int): List[Int] =
      if (i * i > number) List(number)
      else
        number % i match {
          case 0 => i :: foo(number/i, i)
          case _ => foo(number, i + 1)
        }
    foo(number, 2)
  }
}



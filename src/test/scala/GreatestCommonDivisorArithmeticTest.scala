import org.scalatest.funsuite.AnyFunSuite

class GreatestCommonDivisorArithmeticTest extends AnyFunSuite{
  test("Should return 9 as greatest common divisor"){
    val firstNumber = 36
    val secondNumber = 63
    val expectedResult = 9

    assert(Arithmetic.greatestCommonDivisor(firstNumber, secondNumber) == expectedResult)
  }

  test("Should return 4 as greatest common divisor"){
    val firstNumber = 32
    val secondNumber = 12
    val expectedResult = 4

    assert(Arithmetic.greatestCommonDivisor(firstNumber, secondNumber) == expectedResult)
  }

  test("Should return 5 as greatest common divisor"){
    val firstNumber = 1320
    val secondNumber = 35
    val expectedResult = 5

    assert(Arithmetic.greatestCommonDivisor(firstNumber, secondNumber) == expectedResult)
  }
}

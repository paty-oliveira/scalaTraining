import org.scalatest.funsuite.AnyFunSuite

class PrimeFactorsArithmeticTest extends AnyFunSuite{
  test("Should return an empty list when the number"){
    var inputNumber = 0
    val expectedResult = List()

    assert(Arithmetic.primeFactors(inputNumber) == expectedResult)

    inputNumber = 1
    assert(Arithmetic.primeFactors(inputNumber) == expectedResult)

    inputNumber = -1
    assert(Arithmetic.primeFactors(inputNumber) == expectedResult)
  }

  test("Should return a list of 2 as prime factors of 2"){
    val inputNumber = 2
    val expectedResult = List(2)

    assert(Arithmetic.primeFactors(inputNumber) == expectedResult)
  }

  test("Should return a list of 3, 3, 5, 7 as prime factors of 315"){
    val inputNumber = 315
    val expectedResult = List(3, 3, 5, 7)

    assert(Arithmetic.primeFactors(inputNumber) == expectedResult)
  }

  test("Should return a list of 2, 2, 2, 3 as prime factors of 24"){
    val inputNumber = 24
    val expectedResult = List(2, 2, 2, 3)

    assert(Arithmetic.primeFactors(inputNumber) == expectedResult)
  }
}

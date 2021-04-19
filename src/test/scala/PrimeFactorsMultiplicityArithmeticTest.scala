import org.scalatest.funsuite.AnyFunSuite

class PrimeFactorsMultiplicityArithmeticTest extends AnyFunSuite{
  test("Should return an empty map"){
    var inputNumber = 1
    val expectedResult = Map()

    assert(Arithmetic.primeFactorsMultiplicity(inputNumber) == expectedResult)

    inputNumber = 0
    assert(Arithmetic.primeFactorsMultiplicity(inputNumber) == expectedResult)

    inputNumber = -1
    assert(Arithmetic.primeFactorsMultiplicity(inputNumber) == expectedResult)
  }

  test("Should return a map with -> (3,2), (5,1), (7,1)") {
    val inputNumber = 315
    val expectedResult = Map((3,2), (5,1), (7,1))

    assert(Arithmetic.primeFactorsMultiplicity(inputNumber) == expectedResult)
  }

  test("Should return a map with -> (4,2)"){
    val inputNumber = 4
    val expectedResult = Map((2, 2))

    assert(Arithmetic.primeFactorsMultiplicity(inputNumber) == expectedResult)
  }

  test("Should return a map with -> (3, 2)"){
    val inputNumber = 9
    val expectedResult = Map((3, 2))

    assert(Arithmetic.primeFactorsMultiplicity(inputNumber) == expectedResult)
  }

  test("Should return a map with -> (2, 2), (3,1), (5,1)"){
    val inputNumber = 60
    val expectedResult = Map((2, 2), (3, 1), (5, 1))

    assert(Arithmetic.primeFactorsMultiplicity(inputNumber) == expectedResult)
  }
}

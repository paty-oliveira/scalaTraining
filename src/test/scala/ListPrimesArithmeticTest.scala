import org.scalatest.funsuite.AnyFunSuite

class ListPrimesArithmeticTest extends AnyFunSuite{

  test("Should return an empty list"){
    val expectedResult = List()

    var lowerLimit = 0
    var upperLimit = 1
    assert(Arithmetic.listPrimes(lowerLimit, upperLimit) == expectedResult)

    lowerLimit = -2
    upperLimit = 0
    assert(Arithmetic.listPrimes(lowerLimit, upperLimit) == expectedResult)

    lowerLimit = 14
    upperLimit = 16
    assert(Arithmetic.listPrimes(lowerLimit, upperLimit) == expectedResult)
  }

  test("Should return a list with -> [2, 3]"){
    val lowerLimit = 2
    val upperLimit = 3
    val expectedResult = List(2, 3)

    assert(Arithmetic.listPrimes(lowerLimit, upperLimit) == expectedResult)
  }

  test("Should return a list with -> [211]"){
    val lowerLimit = 200
    val upperLimit = 212
    val expectedResult = List(211)

    assert(Arithmetic.listPrimes(lowerLimit, upperLimit) == expectedResult)
  }

  test("Should return a list with -> [71, 73, 79, 83]"){
    val lowerLimit = 71
    val upperLimit = 83
    val expectedResult = List(71, 73, 79, 83)

    assert(Arithmetic.listPrimes(lowerLimit, upperLimit) == expectedResult)
  }

  test("Should return a list with -> [2, 3, 5, 7, 11]"){
    val lowerLimit = 2
    val upperLimit = 11
    val expectedResult = List(2, 3, 5, 7, 11)

    assert(Arithmetic.listPrimes(lowerLimit, upperLimit) == expectedResult)
  }
}

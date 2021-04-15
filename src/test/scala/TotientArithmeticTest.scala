import org.scalatest.funsuite.AnyFunSuite

class TotientArithmeticTest extends AnyFunSuite {

  test("Should return 1 as phi coeficient of 1") {
    val number = 1
    val expectedResult = 1

    assert(Arithmetic.totient(number) == expectedResult)
  }

  test("Should return 1 as phi coeficient of 2") {
    val number = 2
    val expectedResult = 1

    assert(Arithmetic.totient(number) == expectedResult)
  }

  test("Should return 2 as phi coeficient of 3") {
    val number = 3
    val expectedResult = 2

    assert(Arithmetic.totient(number) == expectedResult)
  }

  test("Should return 2 as phi coeficient of 4") {
    val number = 4
    val expectedResult = 2

    assert(Arithmetic.totient(number) == expectedResult)
  }

  test("Should return 1 as phi coeficient of 0") {
    val number = 0
    val expectedResult = 1

    assert(Arithmetic.totient(number) == expectedResult)
  }

  test("Should return 6 as phi coeficient of 9"){
    val number = 9
    val expectedResult = 6

    assert(Arithmetic.totient(number) == expectedResult)
  }
}

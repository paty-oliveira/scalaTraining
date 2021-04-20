import org.scalatest.funsuite.AnyFunSuite

class GoldbachArithmeticTest extends AnyFunSuite{

  test("Should return an exception when the number is less/equals that/to zero"){
    var inputNumber = 0

    assertThrows[ArithmeticException]{
      Arithmetic.goldbach(inputNumber)
    }

    inputNumber = -1
    assertThrows[ArithmeticException]{
      Arithmetic.goldbach(inputNumber)
    }
  }

  test("Should return 5 as the sum of these two prime numbers -> (2, 3)"){
    val inputNumber = 5
    val expectedResult = (2, 3)

    assert(Arithmetic.goldbach(inputNumber) == expectedResult)
  }

  test("Should return 7 as the sum of these two prime numbers -> (5,2)"){
    val inputNumber = 7
    val expectedResult = (2, 5)

    assert(Arithmetic.goldbach(inputNumber) == expectedResult)
  }

  test("Should return 28 as the sum of these two prime numbers -> (5, 23)"){
    val inputNumber = 28
    val expectedResult = (5, 23)

    assert(Arithmetic.goldbach(inputNumber) == expectedResult)
  }
}

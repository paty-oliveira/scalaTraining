import org.scalatest.funsuite.AnyFunSuite

class IsCoprimeArithmeticTest extends AnyFunSuite{
  test("35 is comprime to 64"){
    val firstNumber = 35
    val secondNumber = 64

    assert(Arithmetic.isCoprime(firstNumber, secondNumber))
  }

  test("36 is not a comprime of 63"){
    val firstNumber = 36
    val secondNumber = 63

    assert(!Arithmetic.isCoprime(firstNumber, secondNumber))
  }

  test("15 is comprime to 8"){
    val firstNumber = 15
    val secondNumber = 8

    assert(Arithmetic.isCoprime(firstNumber, secondNumber))
  }

  test("8 is not a comprime of 15"){
    val firstNumber = 32
    val secondNumber = 12

    assert(!Arithmetic.isCoprime(firstNumber, secondNumber))
  }

  test("0 is not a comprime of 0"){
    val firstNumber = 0
    val secondNumber = 0

    assert(!Arithmetic.isCoprime(firstNumber, secondNumber))
  }



}

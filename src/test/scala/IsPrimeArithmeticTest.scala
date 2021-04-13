import org.scalatest.funsuite.AnyFunSuite

class IsPrimeArithmeticTest extends AnyFunSuite{

  test("1 is not a prime number"){
    val inputNumber = 1

    assert(!Arithmetic.isPrime(inputNumber))
  }

  test("0 is not a prime number"){
    val inputNumber = 0

    assert(!Arithmetic.isPrime(inputNumber))
  }

  test("Negative numbers are not prime numbers"){
    var inputNumber = -1
    assert(!Arithmetic.isPrime(inputNumber))

    inputNumber = -2
    assert(!Arithmetic.isPrime(inputNumber))

    inputNumber = -10
    assert(!Arithmetic.isPrime(inputNumber))
  }

  test("2 is a prime number"){
    val inputNumber = 2

    assert(Arithmetic.isPrime(inputNumber))
  }

  test("4 is not a prime number"){
    val inputNumber = 4

    assert(!Arithmetic.isPrime(inputNumber))
  }

}

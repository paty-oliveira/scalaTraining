object Arithmetic {

  def isPrime(number : Int): Boolean = {
    if (number <= 1) {
      return false
    }
    !(2 until(number-1)).exists(number % _ == 0)
    }
}


import org.scalatest.funsuite.AnyFunSuite

class IsPalindromeListsTest extends AnyFunSuite{
  test("Should return true if [1, 2, 3, 2, 1]"){
    val inputList = List(1, 2, 3, 2, 1)

    assert(Lists.isPalindrome(inputList))
  }

  test("Should return false if [1, 2]"){
    val inputList = List(1, 2)

    assert(!Lists.isPalindrome(inputList))
  }

  test("Should return true if [-1, -1, -1]"){
    val inputList = List(-1, -1, -1)

    assert(Lists.isPalindrome(inputList))
  }

  test("Should return true if list is empty"){
    val inputList = List()

    assert(Lists.isPalindrome(inputList))
  }
}

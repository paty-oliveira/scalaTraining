import org.scalatest.funsuite.AnyFunSuite

class isPalindromeListsTest extends AnyFunSuite{
  test("Should return true if [1, 2, 3, 2, 1]"){
    assert(Lists.isPalindrome(List(1, 2, 3, 2, 1)) == true)
  }

  test("Should return false if [1, 2]"){
    assert(Lists.isPalindrome(List(1, 2)) == false)
  }

  test("Should return true if [-1, -1, -1]"){
    assert(Lists.isPalindrome(List(-1, -1, -1)) == true)
  }

  test("Should return true if list is empty"){
    assert(Lists.isPalindrome(List()) == true)
  }
}

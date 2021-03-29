import org.scalatest.funsuite.AnyFunSuite

class LengthListsTest extends AnyFunSuite{

  test("Should return 0 as length when list is empty"){
    val inputList = List()
    val expectedResult = 0

    assert(Lists.length(inputList) == expectedResult)
  }

  test("Should return 3 as length"){
    val inputList = List(1, 3, 0)
    val expectedValue = 3

    assert(Lists.length(inputList) == expectedValue)
  }

  test("Should return 4"){
    val inputList = List(1, 2, 1, 3)
    val expectedResult = 4

    assert(Lists.length(inputList) == expectedResult)
  }

  test("Should return 6"){
    val inputList = List(8, 0, -1, 2, -1, 9)
    val expectedResult = 6

    assert(Lists.length(inputList) == expectedResult)
  }
}

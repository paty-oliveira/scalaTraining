import org.scalatest.funsuite.AnyFunSuite

class ReverseListsTest extends AnyFunSuite{

  test("Should return [3, 2, 1] as reversed list"){
    val inputList = List(1, 2, 3)
    val expectedList = List(3, 2, 1)

    assert(Lists.reverse(inputList) == expectedList)
  }

  test("Should return an empty list"){
    val inputList = List()
    val expectedResult = List()

    assert(Lists.reverse(inputList) == expectedResult)
  }

  test("Should return [-1, 2, 3] as reversed list"){
    val inputList = List(3, 2, -1)
    val expectedResult = List(-1, 2, 3)

    assert(Lists.reverse(inputList) == expectedResult)
  }

  test("Should return itself list"){
    val inputList = List(1)
    val expectedResult = List(1)

    assert(Lists.reverse(inputList) == expectedResult)
  }
}

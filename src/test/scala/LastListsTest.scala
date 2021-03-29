import org.scalatest.funsuite.AnyFunSuite

class LastListsTest extends AnyFunSuite {

  test("Should return 10 as last value"){
    val inputList = List(1, 2, 4, 5, 10)
    val expectedResult = 10

    assert(Lists.last(inputList) == expectedResult)
  }

  test("Should return -1 as last value"){
    val inputList = List(-1, 2, -4, -1)
    val expectedResult = -1

    assert(Lists.last(inputList) == expectedResult)
  }

  test("Should throw an exception NoSuchElementException when list is empty"){
    val inputList = List()

    assertThrows[NoSuchElementException]{
      Lists.last(inputList)
    }
  }
}

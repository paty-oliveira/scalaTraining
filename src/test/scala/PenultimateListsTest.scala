import org.scalatest.funsuite.AnyFunSuite

class PenultimateListsTest extends AnyFunSuite {

  test("Should return 5 as penultimate value"){
    val inputList = List(1, 2, 10, 5, 6)
    val expectedResult = 5

    assert(Lists.penultimate(inputList) == expectedResult)
  }

  test("Should return -7 as penultimante value"){
    val inputList = List(-1, 0, 2, -2, -7, 0)
    val expectedResult = -7

    assert(Lists.penultimate(inputList) == expectedResult)
  }

  test("Should throw an exception NoSuchElementException when list is empty"){
    val inputList = List()

    assertThrows[NoSuchElementException]{
      Lists.penultimate(inputList)
    }
  }
}

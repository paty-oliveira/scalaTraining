import org.scalatest.funsuite.AnyFunSuite

class FlattenListsTest extends AnyFunSuite{

  test("Should return [1, 1, 2, 3, 5, 8]"){
    val inputList = List(List(1, 1), 2, List(3, List(5, 8)))
    val expectedResult =  List(1, 1, 2, 3, 5, 8)

    assert(Lists.flatten(inputList) == expectedResult)
  }

  test("Should return [9, 1, 3, 0, -1]"){
    val inputList = List(List(), 9, List(1, 3, 0, List(-1)))
    val expectedResult = List(9, 1, 3, 0, -1)

    assert(Lists.flatten(inputList) == expectedResult)
  }

  test("Should return []"){
    val inputList = List()
    val expectedResult = List()

    assert(Lists.flatten(inputList) == expectedResult)
  }
}

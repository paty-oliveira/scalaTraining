import org.scalatest.funsuite.AnyFunSuite

class RandomPermuteListsTest extends AnyFunSuite{
  test("Should return an empty list"){
    assert(Lists.randomPermute(List()) == List())
  }

  test("Should return a list with 1 element"){
    val listSize = 1

    var inputList = List(10)
    Lists.randomPermute(inputList).sizeCompare(listSize)

    inputList = List(0)
    Lists.randomPermute(inputList).sizeCompare(listSize)

    inputList = List(-1)
    Lists.randomPermute(inputList).sizeCompare(listSize)
  }

  test("Should return a list with 2 elements"){
    val listSize = 2

    var inputList = List(0, 1)
    Lists.randomPermute(inputList).sizeCompare(listSize)

    inputList = List(-1, -2)
    Lists.randomPermute(inputList).sizeCompare(listSize)

    inputList = List(2, 10)
    Lists.randomPermute(inputList).sizeCompare(listSize)
  }
}

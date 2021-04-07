import org.scalatest.funsuite.AnyFunSuite

class RandomSelectListsTest extends AnyFunSuite {

  test("Should return an empty list"){
    val inputList = List()
    val expectedResult = List()
    val randomValue = util.Random.nextInt(10)

    assert(Lists.randomSelect(inputList, randomValue) == expectedResult)
  }

  test("Should return an empty list when number of elements is zero") {
    val numberElements = 0

    assert(Lists.randomSelect(List(), numberElements) == List())
    assert(Lists.randomSelect(List(1), numberElements) == List())
    assert(Lists.randomSelect(List(1, 2), numberElements) == List())
    assert(Lists.randomSelect(List(1, 2, 3), numberElements) == List())
  }

  test("Should return an empty list when number of elements is negative") {
    val numberElements = -1

    assert(Lists.randomSelect(List(), numberElements) == List())
    assert(Lists.randomSelect(List(1), numberElements) == List())
    assert(Lists.randomSelect(List(1, 2), numberElements) == List())
    assert(Lists.randomSelect(List(1, 2, 3), numberElements) == List())
  }

  test("Should return [5]"){
    val inputList = List(5)
    var numberElements = 1
    assert(Lists.randomSelect(inputList, numberElements) == List(5))

    numberElements = 2
    assert(Lists.randomSelect(inputList, numberElements) == List(5))
  }

  test("Should return [1,2]") {
    val inputList = List(1, 2)
    var possibleResults = List(List(1), List(2))
    var numberElements = 1
    assert(possibleResults.contains(Lists.randomSelect(inputList, numberElements)))

    numberElements = 2
    possibleResults = List(List(1,2), List(2,1))
    assert(possibleResults.contains(Lists.randomSelect(inputList, numberElements)))
  }
}

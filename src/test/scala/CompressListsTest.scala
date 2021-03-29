import org.scalatest.funsuite.AnyFunSuite

class CompressListsTest extends AnyFunSuite{

  test("Should return ['a, 'b, 'c, 'a, 'd, 'e]"){
    val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expectedResult = List('a, 'b, 'c, 'a, 'd, 'e)
    assert(Lists.compress(inputList) == expectedResult)
  }

  test("Should return ['a, 'm] "){
    val inputList = List('a, 'a, 'm)
    val expectedResult = List('a, 'm)
    assert(Lists.compress(inputList) == expectedResult)
  }

  test("Should return empty list"){
    val inputList = List()
    val expectedList = List()
    assert(Lists.compress(inputList) == expectedList)
  }
}

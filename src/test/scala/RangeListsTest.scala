import org.scalatest.funsuite.AnyFunSuite

class RangeListsTest extends AnyFunSuite{

  test("Should return [4, 5, 6, 7, 8, 9]"){
    val expectedList = List(4, 5, 6, 7, 8, 9)

    assert(Lists.range(4, 9) == expectedList)
  }

  test("Should return [-1, 0, 1, 2]"){
    val expectedList = List(-1, 0, 1, 2)

    assert(Lists.range(-1, 2) == expectedList)
  }
}

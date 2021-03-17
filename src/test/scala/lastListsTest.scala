import org.scalatest.funsuite.AnyFunSuite

class lastListsTest extends AnyFunSuite {
  test("Should return 10 as last value"){
    assert(Lists.last(List(1, 2, 4, 5, 10)) == 10)
  }

  test("Should return -1 as last value"){
    assert(Lists.last(List(-1, 2, -4, -1)) == -1)
  }

  test("Should throw an exception NoSuchElementException"){
    assertThrows[NoSuchElementException]{
      Lists.last(List())
    }
  }


}

import org.scalatest.funsuite.AnyFunSuite

class penultimateListsTest extends AnyFunSuite {
  test("Should return 5 as penultimate value"){
    assert(Lists.penultimate(List(1, 2, 10, 5, 6)) == 5)
  }

  test("Should return -7 as penultimante value"){
    assert(Lists.penultimate(List(-1, 0, 2, -2, -7, 0)) == -7)
  }

  test("Should throw an exception NoSuchElementException when list is empty"){
    assertThrows[NoSuchElementException]{
      Lists.penultimate(List())
    }
  }
}

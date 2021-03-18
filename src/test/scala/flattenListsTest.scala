import org.scalatest.funsuite.AnyFunSuite

class flattenListsTest extends AnyFunSuite{
  test("Should return [1, 1, 2, 3, 5, 8]"){
    assert(Lists.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

  test("Should return [9, 1, 3, 0, -1]"){
    assert(Lists.flatten(List(List(), 9, List(1, 3, 0, List(-1)))) == List(9, 1, 3, 0, -1))
  }

  test("Should return []"){
    assert(Lists.flatten(List()) == List())
  }
}

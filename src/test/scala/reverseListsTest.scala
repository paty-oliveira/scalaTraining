import org.scalatest.funsuite.AnyFunSuite

class reverseListsTest extends AnyFunSuite{
  test("Should return [3, 2, 1] as reversed list"){
    assert(Lists.reverse(List(1, 2, 3)) == List(3, 2, 1))
  }

  test("Should return an empty list"){
    assert(Lists.reverse(List()) == List())
  }

  test("Should return [-1, 2, 3] as reversed list"){
    assert(Lists.reverse(List(3, 2, -1)) == List(-1, 2, 3))
  }

  test("Should return itself list"){
    assert(Lists.reverse(List(1)) == List(1))
  }
}

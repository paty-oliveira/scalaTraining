import org.scalatest.funsuite.AnyFunSuite

class lengthListsTest extends AnyFunSuite{
  test("Should return 0 as length when list is empty"){
    assert(Lists.length(List()) == 0)
  }

  test("Should return 3 as length"){
    assert(Lists.length(List(1, 3, 0)) == 3)
  }

  test("Should return 4"){
    assert(Lists.length(List(1, 2, 1, 3)) == 4)
  }

  test("Should return 6"){
    assert(Lists.length(List(8, 0, -1, 2, -1, 9)) == 6)
  }

}

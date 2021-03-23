import org.scalatest.funsuite.AnyFunSuite

class sliceListsTest extends AnyFunSuite{
  test("Should return ['d, 'e, 'f, 'g]"){
    assert(Lists.slice(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"),
      Symbol("f"), Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k")),
      3, 7) == List(Symbol("d"), Symbol("e"), Symbol("f"), Symbol("g"))
    )
  }

  test("Should throw IllegalArgumentException exception when list is empty"){
    assertThrows[IllegalArgumentException]{
      Lists.slice(List(), 1, 2)
    }
  }

  test("Should throw IllegalArgumentException exception"){
    assertThrows[IllegalArgumentException]{
      Lists.slice(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"),
        Symbol("f"), Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k")),
        -1, 3)
    }
  }
}

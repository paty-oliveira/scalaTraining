import org.scalatest.funsuite.AnyFunSuite

class dropListsTest extends AnyFunSuite {
  test("Should return ['a, 'b, 'd, 'e, 'g, 'h, 'j, 'k] when value is 3") {
    assert(Lists.drop(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"), Symbol("f"),
      Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k")), 3) ==
      List(Symbol("a"), Symbol("b"), Symbol("d"), Symbol("e"), Symbol("g"), Symbol("h"), Symbol("j"),
        Symbol("k"))
    )
  }

  test("Should return IllegalArgumentException when the value is 0") {
    assertThrows[IllegalArgumentException] {
      Lists.drop(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"), Symbol("f"),
        Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k")), 0)
    }
  }

  test("Should return IllegalArgumentException when the value is negative") {
    assertThrows[IllegalArgumentException] {
      Lists.drop(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"), Symbol("f"),
        Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k")), -1)
    }
  }

  test("Should return IllegalArgumentException when the list is empty "){
    assertThrows[IllegalArgumentException]{
      Lists.drop(List(), 1)
    }
  }
}


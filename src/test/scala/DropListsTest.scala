import org.scalatest.funsuite.AnyFunSuite

class DropListsTest extends AnyFunSuite {
  test("Should return ['a, 'b, 'd, 'e, 'g, 'h, 'j, 'k] when value is 3") {
    val inputList = List(Symbol("a"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("d"),
                        Symbol("e"),
                        Symbol("f"),
                        Symbol("g"),
                        Symbol("h"),
                        Symbol("i"),
                        Symbol("j"),
                        Symbol("k"))

    val expectedResult = List(Symbol("a"),
                              Symbol("b"),
                              Symbol("d"),
                              Symbol("e"),
                              Symbol("g"),
                              Symbol("h"),
                              Symbol("j"),
                              Symbol("k"))

    assert(Lists.drop(inputList, 3) == expectedResult)
  }

  test("Should return IllegalArgumentException when the value is 0") {
    val inputList = List(Symbol("a"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("d"),
                        Symbol("e"),
                        Symbol("f"),
                        Symbol("g"),
                        Symbol("h"),
                        Symbol("i"),
                        Symbol("j"),
                        Symbol("k"))

    assertThrows[IllegalArgumentException] {
      Lists.drop(inputList, 0)
    }
  }

  test("Should return IllegalArgumentException when the value is negative") {
    val inputList = List(Symbol("a"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("d"),
                        Symbol("e"),
                        Symbol("f"),
                        Symbol("g"),
                        Symbol("h"),
                        Symbol("i"),
                        Symbol("j"),
                        Symbol("k"))

    assertThrows[IllegalArgumentException] {
      Lists.drop(inputList, -1)
    }
  }

  test("Should return IllegalArgumentException when the list is empty "){
    val inputList = List()

    assertThrows[IllegalArgumentException]{
      Lists.drop(inputList, 1)
    }
  }
}


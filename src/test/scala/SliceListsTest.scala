import org.scalatest.funsuite.AnyFunSuite

class SliceListsTest extends AnyFunSuite{

  test("Should return ['d, 'e, 'f, 'g]"){
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

    val expectedResult = List(Symbol("d"),
                              Symbol("e"),
                              Symbol("f"),
                              Symbol("g"))

    assert(Lists.slice(inputList,3, 7) == expectedResult)
  }

  test("Should throw IllegalArgumentException exception when list is empty"){
    val inputList = List()

    assertThrows[IllegalArgumentException]{
      Lists.slice(inputList, 1, 2)
    }
  }

  test("Should throw IllegalArgumentException exception"){
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

    assertThrows[IllegalArgumentException]{
      Lists.slice(inputList,-1, 3)
    }
  }
}

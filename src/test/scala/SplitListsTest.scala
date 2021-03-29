import org.scalatest.funsuite.AnyFunSuite

class SplitListsTest extends AnyFunSuite{

  test("Should return (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))"){
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

    val expectedResult = (List(Symbol("a"),
                              Symbol("b"),
                              Symbol("c")),
                          List(Symbol("d"),
                              Symbol("e"),
                              Symbol("f"),
                              Symbol("g"),
                              Symbol("h"),
                              Symbol("i"),
                              Symbol("j"),
                              Symbol("k")))

    assert(Lists.split(inputList, 3) == expectedResult)
  }

  test("Should return [[], ['a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k]") {
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

    val expectedList = (List(),
                        List(Symbol("a"),
                          Symbol("b"),
                          Symbol("c"),
                          Symbol("d"),
                          Symbol("e"),
                          Symbol("f"),
                          Symbol("g"),
                          Symbol("h"),
                          Symbol("i"),
                          Symbol("j"),
                          Symbol("k")))

    assert(Lists.split(inputList, 0 ) == expectedList)
  }

  test("Should return an empty tuple"){
    val inputList = List()
    val expectedResult = (List(), List())

    assert(Lists.split(inputList, 1) == expectedResult)
  }
}

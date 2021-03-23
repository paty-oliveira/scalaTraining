import org.scalatest.funsuite.AnyFunSuite

class splitListsTest extends AnyFunSuite{
  test("Should return (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))"){
    assert(Lists.split(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"), Symbol("f"),
      Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k")), 3) ==
      (List(Symbol("a"), Symbol("b"), Symbol("c")),List(Symbol("d"), Symbol("e"), Symbol("f"), Symbol("g"),
        Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k")))
    )
  }

  test("Should return [[], ['a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k]") {
    assert(Lists.split(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"), Symbol("f"),
        Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k")), 0 ) ==
      (List(), List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"), Symbol("f"),
          Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k"))))
    }

  test("Should return an empty tuple"){
    assert(Lists.split(List(), 1) == (List(), List()))
  }

}

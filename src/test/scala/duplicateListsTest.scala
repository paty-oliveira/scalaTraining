import org.scalatest.funsuite.AnyFunSuite

class duplicateListsTest extends AnyFunSuite{
  test("Should return ['a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd] "){
    assert(Lists.duplicate(List(Symbol("a"), Symbol("b"), Symbol("c"),
        Symbol("c"), Symbol("d")))
        ==
        List(Symbol("a"), Symbol("a"), Symbol("b"), Symbol("b"), Symbol("c"),
          Symbol("c"), Symbol("c"), Symbol("c"), Symbol("d"), Symbol("d"))
    )
  }
}

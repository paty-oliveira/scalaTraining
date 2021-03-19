import org.scalatest.funsuite.AnyFunSuite

class packListsTest extends AnyFunSuite{
  test("Should return [['a, 'a, 'a, 'a], ['b], ['c, 'c], ['a, 'a], ['d], ['e, 'e, 'e, 'e]]"){
    assert(Lists.pack(
      List(Symbol("a"), Symbol("a"), Symbol("a"), Symbol("a"), Symbol("b"), Symbol("c"), Symbol("c"),
        Symbol("a"), Symbol("a"), Symbol("d"), Symbol("e"), Symbol("e"), Symbol("e"), Symbol("e"))) ==
      List(List(Symbol("a"), Symbol("a"), Symbol("a"), Symbol("a")), List(Symbol("b")), List(Symbol("c"),
        Symbol("c")), List(Symbol("a"), Symbol("a")), List(Symbol("d")), List(Symbol("e"), Symbol("e"),
        Symbol("e"), Symbol("e")))
    )
  }

  test("Should return an empty list"){
    assert(Lists.pack(List()) == List(List()))
  }

}

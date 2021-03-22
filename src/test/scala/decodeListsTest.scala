import org.scalatest.funsuite.AnyFunSuite

class decodeListsTest extends AnyFunSuite{
  test(""){
    assert(Lists.decode(List((4, Symbol("a")), (1, Symbol("b")),
      (2, Symbol("c")), (2, Symbol("a")), (1, Symbol("d")), (4, Symbol("e"))))
      ==
      List(Symbol("a"), Symbol("a"), Symbol("a"), Symbol("a"), Symbol("b"), Symbol("c"), Symbol("c"),
        Symbol("a"), Symbol("a"), Symbol("d"), Symbol("e"), Symbol("e"), Symbol("e"), Symbol("e")))
  }
}

import org.scalatest.funsuite.AnyFunSuite

class encodeListsTest extends AnyFunSuite{
  test("Should return [(4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)]"){
    assert(Lists.encode(List(Symbol("a"), Symbol("a"), Symbol("a"), Symbol("a"), Symbol("b"), Symbol("c"), Symbol("c"),
      Symbol("a"), Symbol("a"), Symbol("d"), Symbol("e"), Symbol("e"), Symbol("e"), Symbol("e"))) ==
      List((4, Symbol("a")), (1, Symbol("b")), (2, Symbol("c")), (2, Symbol("a")), (1, Symbol("d")), (4, Symbol("e"))))
  }
}

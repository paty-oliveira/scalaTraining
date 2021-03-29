import org.scalatest.funsuite.AnyFunSuite

class EncodeListsTest extends AnyFunSuite{

  test("Should return [(4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)]"){
    val inputList = List(Symbol("a"),
                        Symbol("a"),
                        Symbol("a"),
                        Symbol("a"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("c"),
                        Symbol("a"),
                        Symbol("a"),
                        Symbol("d"),
                        Symbol("e"),
                        Symbol("e"),
                        Symbol("e"),
                        Symbol("e"))

    val expectedResult = List((4, Symbol("a")),
                              (1, Symbol("b")),
                              (2, Symbol("c")),
                              (2, Symbol("a")),
                              (1, Symbol("d")),
                              (4, Symbol("e")))

    assert(Lists.encode(inputList) == expectedResult)
  }
}

import org.scalatest.funsuite.AnyFunSuite

class EncodeModifiedListsTest extends AnyFunSuite{

  test("Should return [(4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)]"){
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
                              Symbol("b"),
                              (2, Symbol("c")),
                              (2, Symbol("a")),
                              Symbol("d"),
                              (4, Symbol("e")))

    assert(Lists.encodeModified(inputList) ==expectedResult)
  }
}

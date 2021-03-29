import org.scalatest.funsuite.AnyFunSuite

class DecodeListsTest extends AnyFunSuite{
  test("Should return ['a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e] "){
    val inputList = List((4, Symbol("a")),
                        (1, Symbol("b")),
                        (2, Symbol("c")),
                        (2, Symbol("a")),
                        (1, Symbol("d")),
                        (4, Symbol("e")))

    val expectedResult = List(Symbol("a"),
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

    assert(Lists.decode(inputList) == expectedResult)
  }
}

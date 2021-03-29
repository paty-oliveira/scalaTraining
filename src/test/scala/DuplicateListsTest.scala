import org.scalatest.funsuite.AnyFunSuite

class DuplicateListsTest extends AnyFunSuite{
  test("Should return ['a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd] "){
    val inputList = List(Symbol("a"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("c"),
                        Symbol("d"))

    val expectedResult = List(Symbol("a"),
                              Symbol("a"),
                              Symbol("b"),
                              Symbol("b"),
                              Symbol("c"),
                              Symbol("c"),
                              Symbol("c"),
                              Symbol("c"),
                              Symbol("d"),
                              Symbol("d"))
    assert(Lists.duplicate(inputList) == expectedResult)
  }
}

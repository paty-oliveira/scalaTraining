import org.scalatest.funsuite.AnyFunSuite

class duplicateNListsTest extends AnyFunSuite {
  test("Should return ['a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd]") {
    assert(Lists.duplicateN(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("c"), Symbol("d")), 3)
      ==
      List(Symbol("a"), Symbol("a"), Symbol("a"), Symbol("b"), Symbol("b"), Symbol("b"), Symbol("c"),
        Symbol("c"), Symbol("c"), Symbol("c"), Symbol("c"), Symbol("c"), Symbol("d"), Symbol("d"), Symbol("d"))
    )
  }

    test("Should throw ArithmeticException when value is 0"){
      assertThrows[ArithmeticException]{
        Lists.duplicateN(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("c"), Symbol("d")), 0)
      }
    }

    test("Should throw ArithmeticException when value is less than 0"){
      assertThrows[ArithmeticException]{
        Lists.duplicateN(List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("c"), Symbol("d")), -1)
      }
    }
}

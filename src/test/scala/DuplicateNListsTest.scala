import org.scalatest.funsuite.AnyFunSuite

class DuplicateNListsTest extends AnyFunSuite {

  test("Should return ['a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd]") {
    val inputList = List(Symbol("a"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("c"),
                        Symbol("d"))

    val expectedValue = List(Symbol("a"),
                            Symbol("a"),
                            Symbol("a"),
                            Symbol("b"),
                            Symbol("b"),
                            Symbol("b"),
                            Symbol("c"),
                            Symbol("c"),
                            Symbol("c"),
                            Symbol("c"),
                            Symbol("c"),
                            Symbol("c"),
                            Symbol("d"),
                            Symbol("d"),
                            Symbol("d"))

    assert(Lists.duplicateN(inputList, 3) == expectedValue)
  }

    test("Should throw ArithmeticException when value is 0"){
      val inputList = List(Symbol("a"),
                          Symbol("b"),
                          Symbol("c"),
                          Symbol("c"),
                          Symbol("d"))

      assertThrows[ArithmeticException]{
        Lists.duplicateN(inputList, 0)
      }
    }

    test("Should throw ArithmeticException when value is less than 0"){
      val inputList = List(Symbol("a"),
                          Symbol("b"),
                          Symbol("c"),
                          Symbol("c"),
                          Symbol("d"))

      assertThrows[ArithmeticException]{
        Lists.duplicateN(inputList, -1)
      }
    }
}

import org.scalatest.funsuite.AnyFunSuite

class InsertAtListsTest extends AnyFunSuite{

  test("Should return ['a, 'new, 'b, 'c, 'd]"){
    val inputList = List(Symbol("a"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("d"))

    val newElement = Symbol("new")

    val expectedResult = List(Symbol("a"),
                            Symbol("new"),
                            Symbol("b"),
                            Symbol("c"),
                            Symbol("d"))



    assert(Lists.insertAt(inputList, 1, newElement) == expectedResult)
  }

  test("Should return ['a]"){
    val inputList = List()
    val newElement = Symbol("a")
    val expectedResult = List(Symbol("a"))

    assert(Lists.insertAt(inputList, 2, newElement) == expectedResult)
  }

  test("Should throw an exception"){
    val inputList = List(Symbol("a"),
                        Symbol("new"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("d"))

    val newElement = Symbol("3")

    assertThrows[Exception]{
      Lists.insertAt(inputList, -2, newElement)
    }
  }

}

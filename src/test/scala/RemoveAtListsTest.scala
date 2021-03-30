import org.scalatest.funsuite.AnyFunSuite

class RemoveAtListsTest extends AnyFunSuite{

  test("Should return (List('a, 'c, 'd),'b)"){
    val inputList = List(Symbol("a"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("d"))

    val expectedResult = (List(Symbol("a"), Symbol("c"), Symbol("d")), Symbol("b"))

    assert(Lists.removeAt(inputList, 1) == expectedResult)
  }

  test("Should throw an exception NoSuchElementException"){
    val inputList = List(Symbol("a"),
                        Symbol("b"),
                        Symbol("c"),
                        Symbol("d"))

    assertThrows[NoSuchElementException]{
      Lists.removeAt(inputList, -1)
    }
  }

  test("Should throw NoSuchElementException"){
    val inputList = List()

    assertThrows[NoSuchElementException]{
      Lists.removeAt(inputList, 9)
    }
  }
}

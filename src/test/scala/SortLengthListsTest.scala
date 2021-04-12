import org.scalatest.funsuite.AnyFunSuite

class SortLengthListsTest extends AnyFunSuite{

  test("Should return an empty list"){
    assert(Lists.sortLength(List(List())) == List(List()))
  }

  test("Should return itself list"){
    val inputList = List(List(Symbol("a")))
    val expectedResult = List(List(Symbol("a")))

    assert(Lists.sortLength(inputList) == expectedResult)
  }

  test("Should return the same input"){
    val inputList = List(List(Symbol("c")),
                        List(Symbol("a"), Symbol("b")))
    val expectedResult = List(List(Symbol("c")),
                            List(Symbol("a"), Symbol("b")))

    assert(Lists.sortLength(inputList) == expectedResult)

  }

  test("Should return ascending order with 2 nested lists"){
    val inputList = List(List(Symbol("a"), Symbol("b")),
                          List(Symbol("c")))

    val expectedResult = List(List(Symbol("c")),
                              List(Symbol("a"), Symbol("b")))

    assert(Lists.sortLength(inputList) == expectedResult)
  }

  test("Should return ascending order with 3 nested lists"){
    val inputList = List(
      List(Symbol("a"), Symbol("b"), Symbol("c")),
      List(Symbol("a"), Symbol("b")),
      List(Symbol("c"))
    )

    val expectedResult = List(
      List(Symbol("c")),
      List(Symbol("a"), Symbol("b")),
      List(Symbol("a"), Symbol("b"), Symbol("c"))
    )

    assert(Lists.sortLength(inputList) == expectedResult)
  }

  test("Should return ascending order with 6 nested list"){
    val inputList = List(List(Symbol("a"), Symbol("b"), Symbol("c")),
      List(Symbol("d"), Symbol("e")),
      List(Symbol("f"), Symbol("g"), Symbol("h")),
      List(Symbol("d"), Symbol("e")),
      List(Symbol("i"), Symbol("j"), Symbol("k"), Symbol("l")),
      List(Symbol("m"), Symbol("n")),
      List(Symbol("o"))
    )

    val expectedResult = List(List(Symbol("o")),
      List(Symbol("d"), Symbol("e")),
      List(Symbol("d"), Symbol("e")),
      List(Symbol("m"), Symbol("n")),
      List(Symbol("a"), Symbol("b"), Symbol("c")),
      List(Symbol("f"), Symbol("g"), Symbol("h")),
      List(Symbol("i"), Symbol("j"), Symbol("k"), Symbol("l"))
    )

    assert(Lists.sortLength(inputList) == expectedResult)
  }
}

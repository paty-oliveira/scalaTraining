import org.scalatest.funsuite.AnyFunSuite

class RotateListsTest extends AnyFunSuite {

  val inputList =  List(Symbol("a"),
                          Symbol("b"),
                          Symbol("c"),
                          Symbol("d"),
                          Symbol("e"),
                          Symbol("f"),
                          Symbol("g"),
                          Symbol("h"),
                          Symbol("i"),
                          Symbol("j"),
                          Symbol("k"))

  test("Should return ['d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c]") {
    val expectedResult = List(Symbol("d"),
                              Symbol("e"),
                              Symbol("f"),
                              Symbol("g"),
                              Symbol("h"),
                              Symbol("i"),
                              Symbol("j"),
                              Symbol("k"),
                              Symbol("a"),
                              Symbol("b"),
                              Symbol("c"))

    assert(Lists.rotate(inputList, 3) == expectedResult)
  }

  test("Should return ['j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i] "){
    val expectedResult = List(Symbol("j"),
                              Symbol("k"),
                              Symbol("a"),
                              Symbol("b"),
                              Symbol("c"),
                              Symbol("d"),
                              Symbol("e"),
                              Symbol("f"),
                              Symbol("g"),
                              Symbol("h"),
                              Symbol("i"))

    assert(Lists.rotate(inputList, -2) == expectedResult)
  }

  test("Should return an empty list"){
    val inputList = List()
    val expectedResult = List()

    assert(Lists.rotate(inputList, 1) == expectedResult)
  }
}

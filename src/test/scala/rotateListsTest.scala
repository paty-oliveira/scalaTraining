import org.scalatest.Outcome
import org.scalatest.funsuite.AnyFunSuite

class rotateListsTest extends AnyFunSuite {

  val inputSymbols =  List(Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"), Symbol("f"),
    Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k"))

  test("Should return ['d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c]") {
    val expectedSymbols = List(Symbol("d"), Symbol("e"), Symbol("f"), Symbol("g"), Symbol("h"), Symbol("i"), Symbol("j"), Symbol("k"),
      Symbol("a"), Symbol("b"), Symbol("c"))

    assert(Lists.rotate(inputSymbols, 3) == expectedSymbols)
  }

  test("Should return ['j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i] "){
    val expectedSymbols = List(Symbol("j"), Symbol("k"), Symbol("a"), Symbol("b"), Symbol("c"), Symbol("d"), Symbol("e"), Symbol("f"),
      Symbol("g"), Symbol("h"), Symbol("i"))
    assert(Lists.rotate(inputSymbols, -2) == expectedSymbols)
  }

  test("Should return an empty list"){
    assert(Lists.rotate(List(), 1) == List())
  }
}

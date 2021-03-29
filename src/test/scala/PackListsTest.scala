import org.scalatest.funsuite.AnyFunSuite

class PackListsTest extends AnyFunSuite{

  test("Should return [['a, 'a, 'a, 'a], ['b], ['c, 'c], ['a, 'a], ['d], ['e, 'e, 'e, 'e]]"){
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

    val expectedResult = List(List(Symbol("a"),
                            Symbol("a"),
                            Symbol("a"),
                            Symbol("a")),
                            List(Symbol("b")),
                            List(Symbol("c"),
                            Symbol("c")),
                            List(Symbol("a"), Symbol("a")),
                            List(Symbol("d")),
                            List(Symbol("e"), Symbol("e"), Symbol("e"), Symbol("e")))

    assert(Lists.pack(inputList) == expectedResult)
  }

  test("Should return an empty list"){
    val inputList = List()
    val expectedList = List(List())

    assert(Lists.pack(inputList) == expectedList)
  }
}

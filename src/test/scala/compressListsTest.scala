import org.scalatest.funsuite.AnyFunSuite

class compressListsTest extends AnyFunSuite{
  test("Should return ['a, 'b, 'c, 'a, 'd, 'e]"){
    assert(Lists.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

  test("Should return ['a, 'm] "){
    assert(Lists.compress(List('a, 'a, 'm)) == List('a, 'm))
  }

  test("Should return empty list"){
    assert(Lists.compress(List()) == List())
  }
}

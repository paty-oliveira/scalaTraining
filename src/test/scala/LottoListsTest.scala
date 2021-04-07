import org.scalatest.funsuite.AnyFunSuite

class LottoListsTest extends AnyFunSuite{
  test("Should return an empty list when the value is zero"){
    val firstValue = 0

    assert(Lists.lotto(firstValue, 49) == List())
    assert(Lists.lotto(firstValue, 20) == List())
    assert(Lists.lotto(firstValue, -1) == List())
    assert(Lists.lotto(firstValue, 0) == List())
  }

  test("Should return an empty list when the value is negative"){
    val firstValue = -1

    assert(Lists.lotto(firstValue, 49) == List())
    assert(Lists.lotto(firstValue, 20) == List())
    assert(Lists.lotto(firstValue, -1) == List())
    assert(Lists.lotto(firstValue, 0) == List())
  }

  test("Should return a list with 1 element"){
    val firstValue = 1

    Lists.lotto(firstValue, 49).sizeCompare(1)
    Lists.lotto(firstValue, 20).sizeCompare(1)
    Lists.lotto(firstValue, 0).sizeCompare(1)
    Lists.lotto(firstValue, -1).sizeCompare(1)
  }

  test("Should return a list with 2 elements"){
    val firstValue = 2

    Lists.lotto(firstValue, 49).sizeCompare(2)
    Lists.lotto(firstValue, 20).sizeCompare(2)
    Lists.lotto(firstValue, 0).sizeCompare(2)
    Lists.lotto(firstValue, -1).sizeCompare(2)
  }

  test("Should return a list with 6 elements"){
    val firstValue = 6

    Lists.lotto(firstValue, 49).sizeCompare(6)
    Lists.lotto(firstValue, 4).sizeCompare(6)
    Lists.lotto(firstValue, 0).sizeCompare(6)
  }
}

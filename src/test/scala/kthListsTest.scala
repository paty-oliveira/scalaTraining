import org.scalatest.funsuite.AnyFunSuite

class kthListsTest extends AnyFunSuite{
  test("Should return 4 as 2th element in the list"){
    assert(Lists.kthElement(List(1, 2, 4, 5), 2) == 4)
  }

  test("Should return 2 as 3th element in the list"){
    assert(Lists.kthElement(List(1, 1, 1, 2), 3) == 2)
  }

  test("Should return NoSuchElementException when list is not empty but value is higher than list size "){
    assertThrows[NoSuchElementException]{
      Lists.kthElement(List(1, 2, 3, 4), 10)
    }
  }

  test("Should return NoSuchElementException when list is not empty but value is less than 1"){
    assertThrows[NoSuchElementException]{
      Lists.kthElement(List(1, 3, 4), -1)
    }
  }

  test("Shoulf return 1 as 0th element in the list"){
    assert(Lists.kthElement(List(1, 3, 4), 0) == 1)
  }

  test("Should throw NoSuchElementException when list is empty and value is positive"){
    assertThrows[NoSuchElementException]{
      Lists.kthElement(List(), 1)
    }
  }

  test("Should throw NoSuchElementException when list is empty and value is negative"){
    assertThrows[NoSuchElementException]{
      Lists.kthElement(List(), -1)
    }
  }
}

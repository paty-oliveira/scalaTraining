import org.scalatest.funsuite.AnyFunSuite

class KthListsTest extends AnyFunSuite{

  test("Should return 4 as 2th element in the list"){
    val inputList = List(1, 2, 4, 5)
    val expectedResult = 4

    assert(Lists.kthElement(inputList, 2) == expectedResult)
  }

  test("Should return 2 as 3th element in the list"){
    val inputList = List(1, 1, 1, 2)
    val expectedResult = 2

    assert(Lists.kthElement(inputList, 3) == expectedResult)
  }

  test("Shoulf return 1 as 0th element in the list"){
    val inputList = List(1, 3, 4)
    val expectedResult = 1

    assert(Lists.kthElement(inputList, 0) == 1)
  }

  test("Should return NoSuchElementException when list is not empty but value is higher than list size "){
    val inputList = List(1, 2, 3, 4)

    assertThrows[NoSuchElementException]{
      Lists.kthElement(inputList, 10)
    }
  }

  test("Should return NoSuchElementException when list is not empty but value is less than 1"){
    val inputList = List(1, 3, 4)

    assertThrows[NoSuchElementException]{
      Lists.kthElement(inputList, -1)
    }
  }

  test("Should throw NoSuchElementException when list is empty and value is positive"){
    val inputList = List()

    assertThrows[NoSuchElementException]{
      Lists.kthElement(inputList, 1)
    }
  }

  test("Should throw NoSuchElementException when list is empty and value is negative"){
    val inputList = List()

    assertThrows[NoSuchElementException]{
      Lists.kthElement(inputList, -1)
    }
  }
}

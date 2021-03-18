object Lists {
  def last(list: List[Int]): Int = {
     if (list.isEmpty){
       throw new NoSuchElementException
     }
    list.last
  }

  def penultimate(list: List[Int]): Int = {
    if (list.isEmpty){
      throw new NoSuchElementException
    }
    list.dropRight(1).last
  }

  def kthElement(list: List[Int], element: Int): Int = {
    if (list.nonEmpty && element <= list.length && element >= 0) {
      list(element)
    }
    else{
      throw new NoSuchElementException
    }
  }

  def length(list: List[Int]): Int = {
    list.length
  }

  def reverse(list: List[Int]): List[Int] = {
    list.reverse
  }

  def isPalindrome(list: List[Int]): Boolean = {
    list == reverse(list)
  }

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case nestedList: List[Any] => flatten(nestedList)
    case element => List(element)
  }
}

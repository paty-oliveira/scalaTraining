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
}

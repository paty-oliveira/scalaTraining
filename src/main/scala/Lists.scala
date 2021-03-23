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

  def compress(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case head :: tail => head :: compress(tail.dropWhile(_ == head))
  }

  def pack(list: List[Symbol]): List[List[Symbol]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list span { _ == list.head}
      if (next == Nil) List(packed)
      else {packed :: pack(next)}
    }
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    pack(list) map{ char =>
      (char.length, char.head)
    }
  }

  def encodeModified(list: List[Symbol]): List[Any] = {
    encode(list) map{ char =>
      if (char._1 == 1) char._2 else char
    }
  }

  def decode(list: List[(Int, Symbol)]): List[Symbol] = {
    list flatMap(char => List.fill(char._1)(char._2)
      )
  }

  def duplicate(list: List[Symbol]): List[Symbol] = {
    encode(list) flatMap(char => List.fill(char._1*2)(char._2))
  }

  def duplicateN(list: List[Symbol], value: Int): List[Symbol] = {
    if (value > 0){
      encode(list) flatMap(char => List.fill(char._1 * value)(char._2))
    }
    else {
      throw new ArithmeticException("Value needs to be high than 0")
    }
  }

  def drop(list: List[Symbol], value: Int): List[Symbol] = {
    if (list.isEmpty) throw new IllegalArgumentException
    else {
      val (prefix, suffix) = list.splitAt(value - 1)
      prefix ++ suffix.grouped(value).flatMap(_.drop(1))
    }
  }

  def split(list: List[Symbol], value: Int): (List[Symbol], List[Symbol]) = {
    if (list.isEmpty) (List(), List())
    else list.splitAt(value)
  }
}

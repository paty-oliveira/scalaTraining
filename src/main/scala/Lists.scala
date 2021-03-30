

object Lists {
  def last(list: List[Int]): Int = {
    if (list.isEmpty) throw new NoSuchElementException
    list.last
  }

  def penultimate(list: List[Int]): Int = {
    if (list.isEmpty) throw new NoSuchElementException
    list.dropRight(1).last
  }

  def kthElement(list: List[Int], index: Int): Int = {
    if (list.nonEmpty && index <= list.length && index >= 0) {
      list(index)
    }
    else throw new NoSuchElementException
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
    pack(list) map{ char => (char.length, char.head)
    }
  }

  def encodeModified(list: List[Symbol]): List[Any] = {
    encode(list) map{ char => if (char._1 == 1) char._2 else char
    }
  }

  def decode(list: List[(Int, Symbol)]): List[Symbol] = {
    list flatMap(char => List.fill(char._1)(char._2))
  }

  def duplicate(list: List[Symbol]): List[Symbol] = {
    encode(list) flatMap(char => List.fill(char._1*2)(char._2))
  }

  def duplicateN(list: List[Symbol], number: Int): List[Symbol] = {
    if (number > 0){
      encode(list) flatMap(char => List.fill(char._1 * number)(char._2))
    }
    else throw new ArithmeticException("Value needs to be high than 0")
  }

  def drop(list: List[Symbol], index: Int): List[Symbol] = {
    if (list.isEmpty) throw new IllegalArgumentException
    else {
      val (prefix, suffix) = list.splitAt(index - 1)
      prefix ++ suffix.grouped(index).flatMap(_.drop(1))
    }
  }

  def split(list: List[Symbol], length: Int): (List[Symbol], List[Symbol]) = {
    if (list.isEmpty) (List(), List())
    else list.splitAt(length)
  }

  def slice(list: List[Symbol], firstIndex: Int, secondIndex: Int): List[Symbol] = {
    if (list.nonEmpty && firstIndex >=0 && secondIndex > 0){
      list.slice(firstIndex, secondIndex)
    }
    else throw new IllegalArgumentException
  }

  def rotate(list: List[Symbol], startIndex: Int): List[Symbol] = {
    if (list.isEmpty) List()
    val index  = if (startIndex < 0) list.size + startIndex else startIndex
    val (start, end) = list.splitAt(index)
    end ++ start
  }

  def removeAt(list: List[Symbol], index: Int): (List[Symbol], Symbol) =
    list.splitAt(index) match {
      case (Nil, _) if index < 0 => throw new NoSuchElementException
      case (start, index :: end) => (start ::: end, index)
      case (_, Nil) => throw new NoSuchElementException
  }

  def insertAt(list: List[Symbol], index: Int, element: Symbol): List[Symbol] = {
    if (index < 0) throw new Exception("The index should be a positive value")
    else{list.splitAt(index) match {
      case (start, end) => start ::: element :: end
    }
    }
  }

  def range(firstValue: Int, endValue: Int): List[Int] = {
    List.range(firstValue, endValue + 1)
  }

  def randomSelect(list: List[Symbol], numberElements: Int): List[Symbol] = {
    util.Random.shuffle(list).take(numberElements)
  }
}
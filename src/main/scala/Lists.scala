object Lists {
  def last(list: List[Int]): Int = {
     if (list.isEmpty){
       throw new NoSuchElementException
     }
    list.last
  }
}

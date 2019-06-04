class Shop(val name: String) extends AnyRef with Enumerable[Staff] with Namable {
  private[this] val staffs: List[Staff] = List(new Staff("taro", 10), new Staff("hanako", 18))

  override def foreach[B](f: Staff => B): Unit = staffs.foreach(f)
}

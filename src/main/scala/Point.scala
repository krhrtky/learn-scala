/**
  * 以下のコードと同義.
  *
  * class Point(val x: Int, val y: Int) {
  *   override def hashCode(): Int = x + y
  *
  *   override def equals(that: Any): Boolean = that match {
  *     case that: Point => x == that.x && y == that.y
  *     case _ => false
  *   }
  *
  *   override def toString: String = "Point( " + x + ", " + y + ")"
  * }
  *
  * /**
  *   * コンパニオンオブジェクト.
  *   */
  * object Point {
  *   def apply(x: Int, y: Int): Point = new Point(x, y)
  * }
  */
case class Point(x: Int, y: Int)

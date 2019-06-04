class MyString(val content: String) {
  /**
    * 前置演算子.(!, +, -, ~)
    * usage:
    * val s = new MyString("content")
    * !s // !content
    * @return
    */
  def unary_! : String = "!" + content
}

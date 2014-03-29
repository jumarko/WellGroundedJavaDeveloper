package example

class Wrapper(val underlying: Int) extends AnyVal {
  def foo: Wrapper = new Wrapper(underlying * 19)
  def print = println(underlying)
}
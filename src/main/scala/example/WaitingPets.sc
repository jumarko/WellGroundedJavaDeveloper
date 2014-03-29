class Pet(name : String)
case class Cat(name : String) extends Pet(name : String)
class Dog(name : String) extends Pet(name : String)
class BengalKitten(name : String) extends Cat(name : String)

class Queue[T](elts : T*) {
  var elems = List[T](elts : _*)

  def enqueue(elem : T) = elems ::: List(elem)

  def dequeue = {
    val result = elems.head
    elems = elems.tail
    result
  }
}

def examine(q : Queue[Cat]) {
  println(s"Examining ${q.dequeue}")
}

val cats = new Queue(new Cat("Kitty"), new Cat("Mikky"), new BengalKitten("Benga-Benga!"))
// following does not work: "BengalKitten <: Cat, but class Queue is invariant in type T."
// val cats = new Queue(new BengalKitten("Benga-Benga!"))
examine(cats)


// but following works OK
examine(new Queue(new BengalKitten("Benga-Benga!")))


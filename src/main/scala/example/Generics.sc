// compiler error - type List takes parameters => no raw types as in java allowed
//def junk(x : List) = println("hi")
def junk(x : List[Int]) = println("hi")
junk(List(1))

val numbers = List(1, 2, 3)
val strings = List("cat", "dog", "bird")
numbers :: strings // res1: List[Object] = List(List(1, 2, 3), cat, dog, bird)
numbers ::: strings // res2: List[Any] = List(1, 2, 3, cat, dog, bird)

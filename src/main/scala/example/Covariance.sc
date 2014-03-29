
class Pet(name : String)
case class Cat(name : String) extends Pet(name : String)
class Dog(name : String) extends Pet(name : String)
class BengalKitten(name : String) extends Cat(name : String)

// In Scala things are different than in Java - List[BengalKitten] is a subtype of List[Cat]
var cats : List[Cat]  = List(Cat("Cat"), Cat("Cat2"))
var bengalCats : List[BengalKitten]  = List(new BengalKitten("Benga"), new BengalKitten("Benga-Benga"))

cats = bengalCats

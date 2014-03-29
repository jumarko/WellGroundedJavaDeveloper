import java.util
import scala.collection.mutable
import scala.collection.JavaConversions._

object ListExamples {
  def main(args: Array[String]) {
    var list = List(1,2,3)
    list = list :+ 4
    println(list)

    val linkList = mutable.LinkedList(1,2,3)
    linkList.append(mutable.LinkedList(4))
    println(linkList)

    val jlist = new util.ArrayList[String]()
    jlist.add("Foo")
    println(jlist)
    println(jlist.toList)
  }
}
ListExamples.main(Array())




val x = 2 :: 3 :: Nil
val y = List(2,3)
1 :: x








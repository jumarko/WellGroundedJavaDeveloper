/**
 * Usage of implicit classes - based on http://docs.scala-lang.org/overviews/core/implicit-classes.html
 */
object Helpers {
  implicit class IntWithTimes(x: Int) {
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit =
        if(current > 0) {
          f
          loop(current - 1)
        }
      loop(x)
    }
  }
}

import Helpers._
5 times println("HI")
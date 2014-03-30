/**
 * See following resources:
 * * http://doc.akka.io/docs/akka/2.3.1/intro/what-is-akka.html
 * * http://docs.scala-lang.org/overviews/core/actors-migration-guide.html
 */

import akka.actor.Actor
import akka.actor.Props
import akka.event.Logging

class MyActor extends Actor {
  val log = Logging(context.system, this)
  def receive = {
    case "test" ⇒ log.info("received test")
    case _      ⇒ log.info("received unknown message")
  }
}

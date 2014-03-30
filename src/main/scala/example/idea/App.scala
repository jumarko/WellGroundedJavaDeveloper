package example.idea

/**
 * Created by home on 30. 3. 2014.
 */
object App {
  def main(args: Array[String]) {
    println("Hello, World")
    val user = User("john.deo@example.com")
    val nullable : Option[User]  = Some(user)
    nullable.map( user => {
      println(s"Found user $user")
    })
  }
}

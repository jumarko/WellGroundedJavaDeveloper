package example.idea

/**
 * Created by home on 30. 3. 2014.
 */
case class User(val email : Email) {
  override def toString: String = s"[Email: ${email.address}]"
}

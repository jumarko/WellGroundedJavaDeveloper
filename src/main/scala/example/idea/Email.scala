package example.idea

import java.util.regex.Matcher

/**
 * Represents a __valid__ email address
 * @param address valid email address
 */
case class Email(val address : String) {
  val addressMatcher: Matcher = """([\w\.]+)@([\w\.])+""".r.pattern.matcher(address)
  if (!addressMatcher.matches()) {
    throw new IllegalArgumentException(s"Email address $address is invalid!")
  }

}
object Email {
  implicit def stringToEmail(email : String) = Email(email)
}

package example.idea

import org.scalatest.FunSuite

/**
 * Created by home on 30. 3. 2014.
 */
class EmailTest extends FunSuite {
  test("Email with valid address") {
    val email = Email("john@example.com")
    assert(email != null)
  }

  test("Email with invalid address") {
    intercept[IllegalArgumentException] {
      Email("john.example")
    }
  }
}

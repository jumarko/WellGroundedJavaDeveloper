import scala.language.dynamics
/**
 * Extends Dynamic to provide dynamic features such as selection of nonexisten field.
 * See http://stackoverflow.com/questions/15799811/how-does-type-dynamic-work-and-how-to-use-it.
 * @param street
 * @param city
 */
case class House(street: String, city: String) extends Dynamic {
  def selectDynamic(name: String) = name match {
    case "address" => s"$street, $city"
  }
  def applyDynamic(name: String)(args: (Any)*) =
    s"method '$name' called with arguments ${args.mkString("'", "', '", "'")}"
}
val house: House = House("Zakvasov", "Povazska Bystrica")
println(house)


println(house.address)


house.cleanUp("kitchen", "living room", "bedroom")



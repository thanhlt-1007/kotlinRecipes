data class Recipe(val title: String, val isVegetarian: Boolean)

fun main() {
  val r1 = Recipe("Thai Curry", false)
  val r2 = Recipe("Thai Curry", false)
  // Create a copy of r1,
  // alert its title property
  val r3 = r1.copy(title = "Chicken Bhuna")

  println("r1 hashCode: ${r1.hashCode()}")
  println("r2 hashCode: ${r2.hashCode()}")
  println("r3 hashCode: ${r3.hashCode()}")

  println("r1 toString: ${r1.toString()}")
  println("r2 toString: ${r2.toString()}")
  println("r3 toString: ${r3.toString()}")

  println("r1 == r2? ${r1 == r2}")
  println("r1 === r2? ${r1 === r2}")
  println("r1 == r3? ${r1 == r3}")

  val (title, isVegetarian) = r1
  println("title is $title and vegetarian is $isVegetarian")
}

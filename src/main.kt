data class Recipe(val title: String,
                  val mainIngredient: String,
                  val isVegetarian: Boolean = false,
                  val difficulty: String = "Easy")

class Mushroom(val size: Int,
               val isMagic: Boolean) {
  constructor(isMagicParam: Boolean) : this(0, isMagicParam) {
    // Code that runs when the secondary is called
  }
}

fun findRecipes(title: String = "",
                ingredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = "") : Array<Recipe> {
  // Code to find recipes
  return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
}

// These are overloaded functions
fun addNumbers(a: Int, b: Int) : Int {
  return a + b
}

fun addNumbers(a: Double, b: Double) : Double {
  return a + b
}

fun main() {
  val r1 = Recipe("Thai Curry", "Chicken")
  val r2 = Recipe(title = "Thai Curry", mainIngredient = "Chicken")
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

  val (title, mainIngredient, isVegetarian, difficulty) = r1
  println("title is $title")
  println("mainIngredient is $mainIngredient")
  println("vegetarian is $isVegetarian")
  println("difficulty is $difficulty")

  val m1 = Mushroom(6, false)
  println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")

  val m2 = Mushroom(true)
  println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

  println(addNumbers(2, 5))
  println(addNumbers(1.6, 7.3))
}

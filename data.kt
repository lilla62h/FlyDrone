// Village.kt
class Village(val name: String, val population: Int, val location: String) {
    fun getDetails(): String {
        return "Village Name: $name, Population: $population, Location: $location"
    }
}

// Farmer.kt
class Farmer(val name: String, val age: Int, val crops: List<String>) {
    fun farmDetails(): String {
        return "$name, aged $age, grows the following crops: ${crops.joinToString(", ")}"
    }
}

// Animal.kt
class Animal(val type: String, val name: String, val age: Int) {
    fun animalDetails(): String {
        return "$name is a $age-year-old $type."
    }
}

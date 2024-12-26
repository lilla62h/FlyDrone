// RuralVehicle.kt
class RuralVehicle(val type: String, val capacity: Int, val usedFor: String) {
    fun vehicleDetails(): String {
        return "This is a $type with a capacity of $capacity, primarily used for $usedFor."
    }
}

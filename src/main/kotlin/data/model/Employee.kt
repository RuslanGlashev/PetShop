package data.model

data class Employee(
    val name :String,
    val age :Int,
    val id :Int,
        val rating: Int
) {
    override fun toString(): String {
        return "id = $id, name = $name, age = $age"
    }
}
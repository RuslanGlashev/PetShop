package data.model

data class Person(
    val name :String,
    val age :Int,
    val id :Int
){
    override fun toString(): String {
        return "id = $id, name = $name, age = $age"
    }
}

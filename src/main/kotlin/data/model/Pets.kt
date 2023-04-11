package data.model

data class Pets(
    val name :String,
    val kind :String,
    val breed :String,
    val id :Int,
    val age :Int
) {
    override fun toString(): String {
        return "name = $name, kind = $kind, breed = $breed, id = $id, age = $age"
    }
}
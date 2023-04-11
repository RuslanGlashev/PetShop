package data.model

data class Shelters(
    val name :String,
    val id :Int
){
    override fun toString(): String {
        return "name = $name, id = $id"
    }
}
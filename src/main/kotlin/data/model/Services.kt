package data.model

data class Services(
    val name :String,
    val id :Int,
){
    override fun toString(): String {
        return "name = $name, id = $id"
    }
}
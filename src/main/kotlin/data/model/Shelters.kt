package data.model

/**
 * Shelters Модель описывает данные Приютов
 *
 * @property name Название
 * @property id ID
 * @property petKind Породы питомцев в приютах
 */

data class Shelters(
    val name:String,
    val id:Int,
    var petKind: List<String>
){
    override fun toString(): String {
        return "$name, id = $id"
    }
}
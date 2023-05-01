package data.model

/**
 * Services Модель описывает данные Услуг
 *
 * @property name Имя
 * @property id ID
 * @property idEmp ID работника
 * @property price Цена
 */

data class Services(
    val name :String,
    val id :Int,
    val idEmp :Int,
    val price :Int
){
    override fun toString(): String {
        return "$name, id = $id"
    }
}
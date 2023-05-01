package data.model

/**
 * Pets Модель описывает данные питомцев
 *
 * @property name Имя
 * @property kind Парода
 * @property breed Принадлежность
 * @property id ID
 * @property price Цена
 * @property age Возраст
 */

data class Pets(
    val name:String,
    val kind: String,
    val breed:String,
    val id:Int,
    val price :Int,
    val age:Int
) {
    override fun toString(): String {
        return "Имя = $name, Род = $kind, Порода = $breed, id = $id, Год(Лет) = $age"
    }
}
package data.model

/**
 * Person Модель описывает данные о клиентах
 *
 * @param name Имя
 * @param age Возраст
 * @param id ID
 * @param totalPrice Общая траты клиента
 */
data class Person(
    val name :String,
    val age :Int,
    val id :Int,
    val totalPrice :Int
){
    override fun toString(): String {
        return "id = $id, Имя = $name, Лет = $age"
    }
}

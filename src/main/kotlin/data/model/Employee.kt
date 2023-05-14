package data.model

/**
 * Employee Модель которая описывает данные о работниках.
 *
 * @param name Имя
 * @param age Возраст
 * @param id ID
 * @param rt Рейтинг
 * @param servEmp Услуга Работника
 */
data class Employee(
    val name:String,
    val age:Int,
    val id:Int,
    val rt:Int,
    var servEmp: List<String>
) {
    override fun toString(): String {
        return "id = $id, Имя = $name, Лет = $age"
    }
}
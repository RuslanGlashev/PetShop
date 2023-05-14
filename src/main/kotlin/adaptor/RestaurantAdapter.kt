package adaptor

import domain.UseCase

class RestaurantAdapter(private val useCase: UseCase) {
    fun printEmployees() {
        println("Лучший работник: ${useCase.getBestEmployee()}")
    }

    fun printPerson() {
        println("Вип гости:")
        for (person in useCase.getVipPerson()) {
            println(person)
        }
    }

    fun printCostOfServices() {
        println("Сумма всех Услуг")
        println(useCase.getCostOfServices())
    }

    fun printFindOfServicesEmp() {
        println("Введите название Услуги")
        val name = readLine().toString()
        println(useCase.getFindOfServicesEmp(name))
        println("<>")
    }

    fun printFindingShelters() {
        println("ВВедите пароду")
        val kind = readLine().toString()
        println(useCase.getFindingShelters(kind))
        println("<>")
    }
}



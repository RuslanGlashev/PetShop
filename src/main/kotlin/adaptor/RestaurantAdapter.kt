package adaptor

import domain.UseCase

class RestaurantAdapter(private val useCase: UseCase) {
    fun printEmployees() {
        for (employee in useCase.getBestEmployee()) {
            println(employee)
        }
    }

    fun printPerson() {
        for (person in useCase.getBestPerson()) {
            println(person)
        }
    }

    fun printCostOfServices() {
        for (services in useCase.getCostOfServices()) {
            println(services)
        }
    }

    fun printCostOfServicesEmp() {
        for (services in useCase.getCostOfServicesEmp()) {
            println(services)
        }
    }

    fun printFindingShelters() {
        for (shelters in useCase.getFindingShelters()) {
            println(shelters)
        }
    }
}



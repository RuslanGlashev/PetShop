package domain

import data.model.Employee
import data.model.Person
import data.model.Shelters

interface UseCase {
    fun getBestEmployee(): Employee

    fun getVipPerson(): List<Person>

    fun getCostOfServices(): Int

    fun getFindOfServicesEmp(name :String): List<Employee>

    fun getFindingShelters(kind :String): List<Shelters>
}
package domain

import data.model.Employee
import data.model.Person
import data.model.Services
import data.model.Shelters

interface UseCase {
    fun getBestEmployee(): Employee

    fun getAllEmp(): List<Employee>

    fun getBestPerson(): List<Person>

    fun getCostOfServices(): List<Services>

    fun getCostOfServicesEmp(): List<Services>

    fun getFindingShelters(): List<Shelters>
}
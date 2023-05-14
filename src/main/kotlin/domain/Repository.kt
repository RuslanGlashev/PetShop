package domain

import data.model.Employee
import data.model.Person
import data.model.Services
import data.model.Shelters

interface Repository {
    fun getBestEmployee(): List<Employee>

    fun getVipPerson(): List<Person>

    fun getCostOfServices(): List<Services>

    fun getFindOfServicesEmp(): List<Employee>

    fun getFindingShelters(): List<Shelters>
}
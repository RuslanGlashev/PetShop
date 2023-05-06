package domain

import data.model.Employee
import data.model.Person
import data.model.Services
import data.model.Shelters

class UseCaseImpl(private val repository: Repository): UseCase {
    override fun getBestEmployee(): Employee {
        return repository.getBestEmployee()
    }

    override fun getAllEmp(): List<Employee> {
        return repository.getAllEmployees()
    }

    override fun getBestPerson(): List<Person> {
        return repository.getBestPerson()
    }

    override fun getCostOfServices(): List<Services> {
        return repository.getCostOfServices()
    }

    override fun getCostOfServicesEmp(): List<Services> {
        return repository.getCostOfServicesEmp()
    }

    override fun getFindingShelters(): List<Shelters> {
        return repository.getFindingShelters()
    }
}
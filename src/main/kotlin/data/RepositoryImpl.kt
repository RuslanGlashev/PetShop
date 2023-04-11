package data

import data.model.Employee
import data.model.Person
import data.model.Services
import data.model.Shelters
import domain.Repository

class RepositoryImpl(private val dataSource: DataSource): Repository {
    override fun getBestEmployee(): List<Employee> {
        return dataSource.getEmployees()
    }

    override fun getBestPerson(): List<Person> {
        return dataSource.getPerson()
    }

    override fun getCostOfServices(): List<Services> {
        return dataSource.getServices()
    }

    override fun getCostOfServicesEmp(): List<Services> {
        return dataSource.getServices()
    }

    override fun getFindingShelters(): List<Shelters> {
        return dataSource.getShelters()
    }
}
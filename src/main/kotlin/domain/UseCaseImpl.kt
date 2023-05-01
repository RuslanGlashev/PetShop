package domain

import data.model.Constants.maxPrice
import data.model.Employee
import data.model.Person
import data.model.Shelters

class UseCaseImpl(private val repository: Repository): UseCase {
    override fun getBestEmployee(): Employee {
        return repository.getBestEmployee().maxBy {it.rt}
    }

    override fun getVipPerson(): List<Person> {
        return repository.getVipPerson().filter { it.totalPrice >= maxPrice }
    }

    override fun getCostOfServices(): Int {
        return repository.getCostOfServices().sumOf{ it.price }
    }

    override fun getFindOfServicesEmp(name :String): List<Employee> {
        return repository.getFindOfServicesEmp().filter{ it.servEmp == name.lines() }

    }
    override fun getFindingShelters(kind :String): List<Shelters> {
        return repository.getFindingShelters().filter{ it.petKind.contains ( kind )}
    }
}


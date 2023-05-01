package data

import data.model.Employee
import data.model.Person
import data.model.Services
import data.model.Shelters
import domain.Repository

class RepositoryImpl(private val dataSource: DataSource): Repository {

    // Функция возвращает лучшего работника
    override fun getBestEmployee(): List<Employee> {
        return dataSource.getEmployees()
    }

    // Функция возвращает прибыльных клиентов
    override fun getVipPerson(): List<Person> {
        return dataSource.getPerson()
    }

    // Функция возвращает общую стоимость услуг
    override fun getCostOfServices(): List<Services> {
        return dataSource.getServices()
    }

    // Функция возвращает Нахождение по названию Услуги работнико
    override fun getFindOfServicesEmp(): List<Employee> {
        return dataSource.getEmployees()
    }

    // Функция возвращает приют с нужным клиенту питоицем
    override fun getFindingShelters(): List<Shelters> {
        return dataSource.getShelters()
    }
}
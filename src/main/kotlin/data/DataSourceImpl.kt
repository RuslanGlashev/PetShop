package data

import data.model.Employee
import data.model.Services
import data.model.Shelters
import data.model.Pets
import data.model.Person
import data.model.Constants.fileNamePerson
import data.model.Constants.fileNameEmployee
import data.model.Constants.fileNamePets
import data.model.Constants.fileNameServices
import data.model.Constants.fileNameShelters
import java.nio.file.Files
import java.nio.file.Paths


class DataSourceImpl() : DataSource {

    override fun readCsvFileEmployee(): List<String> {
        val bufferedReader = Files.newBufferedReader(Paths.get(fileNameEmployee))
        val result = mutableListOf<String>()
        bufferedReader.useLines { lines ->
            for (line in lines) {
                result.add(line)
            }
        }
        return result
    }


    override fun getEmployees(): List<Employee> = readCsvFileEmployee().map {  employee ->
        val (name, age, id, rt, servEmp) = employee.split(";")
        return@map Employee(name, age.toInt(), id.toInt(),  rt.toInt(), servEmp.lines())
    }


    override fun readCsvFilePerson(): List<String> {
        val bufferedReader = Files.newBufferedReader(Paths.get(fileNamePerson))
        val result = mutableListOf<String>()
        bufferedReader.useLines { lines ->
            for (line in lines) {
                result.add(line)
            }
        }
        return result
    }

    override fun getPerson(): List<Person> = readCsvFilePerson().map { person ->
        val (name, age, id, totalPrice) = person.split(";")
        return@map Person(name, age.toInt(), id.toInt(), totalPrice.toInt())
    }

    override fun readCsvFilePets(): List<String> {
        val bufferedReader = Files.newBufferedReader(Paths.get(fileNamePets))
        val result = mutableListOf<String>()
        bufferedReader.useLines { lines ->
            for (line in lines) {
                result.add(line)
            }
        }
        return result
    }

    override fun getPets(): List<Pets> = readCsvFilePets().map { pets ->
        val (name, kind, breed, age, id) = pets.split(";")
        val (price) = pets.split(";")
        return@map Pets(name, kind, breed, age.toInt(), id.toInt(), price.toInt())
    }

    override fun readCsvFileServices(): List<String> {
        val bufferedReader = Files.newBufferedReader(Paths.get(fileNameServices))
        val result = mutableListOf<String>()
        bufferedReader.useLines { lines ->
            for (line in lines) {
                result.add(line)
            }
        }
        return result
    }

    override fun getServices(): List<Services> = readCsvFileServices().map { services ->
        val (name, id, idEmp, price) = services.split(";")
        return@map Services(name, id.toInt(), idEmp.toInt(), price.toInt())
    }

    override fun readCsvFileShelters(): List<String> {
        val bufferedReader = Files.newBufferedReader(Paths.get(fileNameShelters))
        val result = mutableListOf<String>()
        bufferedReader.useLines { lines ->
            for (line in lines) {
                result.add(line)
            }
        }
        return result
    }

        override fun getShelters(): List<Shelters> = readCsvFileShelters().map { shelters ->
            val (name, id, petKind) = shelters.split(";")
            return@map Shelters(name, id.toInt(), petKind.split(","))
        }

}

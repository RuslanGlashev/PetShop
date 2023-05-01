package data

import data.model.*
import java.nio.file.Files
import java.nio.file.Paths


class DataSourceImpl: DataSource {
    private val fileNameEmployee = "Employee.csv"
    private val fileNamePerson = "Person.csv"
    private val fileNamePets = "Pets.csv"
    private val fileNameServices = "Services.csv"
    private val fileNameShelters = "Shelters.csv"
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
        val (name, age, id) = employee.split(";")
        return@map Employee(name, age.toInt(), id.toInt())
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
        val (name, age, id) = person.split(";")
        return@map Person(name, age.toInt(), id.toInt())
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
        return@map Pets(name, kind, breed, age.toInt(), id.toInt())
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
        val (name, id) = services.split(";")
        return@map Services(name, id.toInt())
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
        val (name, id) = shelters.split(";")
        return@map Shelters(name, id.toInt())
    }
}
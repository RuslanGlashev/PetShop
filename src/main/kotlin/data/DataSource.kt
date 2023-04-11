package data

import data.model.*

interface DataSource {
    fun readCsvFileEmployee(): List<String>

    fun getEmployees(): List<Employee>

    fun readCsvFilePerson(): List<String>

    fun getPerson(): List<Person>

    fun readCsvFilePets(): List<String>

    fun getPets(): List<Pets>

    fun readCsvFileServices(): List<String>

    fun getServices(): List<Services>

    fun readCsvFileShelters(): List<String>

    fun getShelters(): List<Shelters>
}
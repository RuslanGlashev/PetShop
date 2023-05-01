package ui

import ui.di.DI

fun main(args: Array<String>) {

    val adapter = DI.injectAdapter()
    adapter.printEmployees()
    adapter.printPerson()
    adapter.printCostOfServices()
    adapter.printCostOfServicesEmp()
    adapter.printFindingShelters()
}
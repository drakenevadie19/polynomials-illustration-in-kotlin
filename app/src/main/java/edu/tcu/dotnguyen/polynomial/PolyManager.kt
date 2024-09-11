package edu.tcu.dotnguyen.polynomial


fun main() {
    val polyList = PolyList()
    while (true) {
        val input = readLine()!!.split(" ", limit = 2)
        val command = input[0].toUpperCase()

        when (command) {
            "INSERT" -> {
                val nameAndTerms = input[1].split(" ", limit = 2)
                polyList.insertPolynomial(nameAndTerms[0], nameAndTerms[1])
            }
            "DELETE" -> polyList.deletePolynomial(input[1])
            "SEARCH" -> polyList.searchPolynomial(input[1])
            "QUIT" -> break
            else -> println("Unknown command: $command")
        }
    }
}

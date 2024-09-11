package edu.tcu.dotnguyen.polynomial

fun main() {
    val polyList = PolyList()  // Create an instance of PolyList to manage polynomials.

    // Infinite loop to handle commands from the user.
    while (true) {
        // Read a command from the user.
        val input = readLine()!!.split(" ", limit = 2)
        val command = input[0].toUpperCase()

        // Determine which command was entered.
        when (command) {
            "INSERT" -> {
                val nameAndTerms = input[1].split(" ", limit = 2)
                // Insert a polynomial using its name and terms.
                polyList.insertPolynomial(nameAndTerms[0], nameAndTerms[1])
            }
            "DELETE" -> polyList.deletePolynomial(input[1])  // Delete a polynomial by its name.
            "SEARCH" -> polyList.searchPolynomial(input[1])  // Search for a polynomial by its name.
            "QUIT" -> break  // Exit the program.
            else -> println("Unknown command: $command")  // Handle unknown commands.
        }
    }
}

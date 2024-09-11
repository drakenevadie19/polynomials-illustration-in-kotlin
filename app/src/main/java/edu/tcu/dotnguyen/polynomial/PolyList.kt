package edu.tcu.dotnguyen.polynomial

class PolyList {
    // Map to store polynomials, where the key is the polynomial's name and the value is the Polynomial object.
    private val polynomials = mutableMapOf<String, Polynomial>()

    // Insert a new polynomial. Takes the name of the polynomial and a string representing the terms.
    fun insertPolynomial(name: String, termsInput: String) {
        // Check if the polynomial already exists in the map.
        if (polynomials.containsKey(name)) {
            println("POLYNOMIAL $name ALREADY INSERTED")  // Display error message if it exists.
            return
        }

        // Create a new Polynomial object with the given name.
        val polynomial = Polynomial(name)

        // Split the input string into individual terms.
        val terms = termsInput.split(" ")
        for (term in terms) {
            // Split each term into its components (coefficient, x exponent, y exponent, z exponent).
            val components = term.split(",").map { it.toInt() }

            // Create a new Term object and add it to the polynomial.
            polynomial.addTerm(Term(components[0], components[1], components[2], components[3]))
        }

        // Add the polynomial to the map.
        polynomials[name] = polynomial

        // Print the inserted polynomial.
        println("$name = $polynomial")
    }

    // Delete an existing polynomial by its name.
    fun deletePolynomial(name: String) {
        // Remove the polynomial from the map if it exists, otherwise print an error message.
        if (polynomials.remove(name) != null) {
            println("POLYNOMIAL $name SUCCESSFULLY DELETED")
        } else {
            println("POLYNOMIAL $name DOES NOT EXIST")
        }
    }

    // Search for a polynomial by its name.
    fun searchPolynomial(name: String) {
        // Retrieve the polynomial from the map and print it if found, otherwise display an error message.
        val polynomial = polynomials[name]
        if (polynomial != null) {
            println("$name = $polynomial")
        } else {
            println("POLYNOMIAL $name DOES NOT EXIST")
        }
    }
}

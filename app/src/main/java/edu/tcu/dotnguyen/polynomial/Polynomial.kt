package edu.tcu.dotnguyen.polynomial

class Polynomial(val name: String) {
    // List to store the terms of the polynomial.
    val terms = mutableListOf<Term>()

    // Method to add a term to the polynomial.
    fun addTerm(term: Term) {
        terms.add(term)   // Add the term to the list of terms.
    }

    // Override toString() to display the polynomial in a readable format.
    override fun toString(): String {
        // Join all the terms together, properly formatting the sign between terms.
        return terms.joinToString(" + ") { term ->
            term.toString().replace("+ -", "- ")   // Replace "+ -" with "-" for correct formatting.
        }
    }
}


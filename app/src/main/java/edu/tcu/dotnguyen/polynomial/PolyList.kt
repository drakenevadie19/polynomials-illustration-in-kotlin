package edu.tcu.dotnguyen.polynomial

class PolyList {
    private val polynomials = mutableMapOf<String, Polynomial>()

    fun insertPolynomial(name: String, termsInput: String) {
        if (polynomials.containsKey(name)) {
            println("POLYNOMIAL $name ALREADY INSERTED")
            return
        }

        val polynomial = Polynomial(name)
        val terms = termsInput.split(" ")
        for (term in terms) {
            val components = term.split(",").map { it.toInt() }
            polynomial.addTerm(Term(components[0], components[1], components[2], components[3]))
        }

        polynomials[name] = polynomial
        println("$name = $polynomial")
    }

    fun deletePolynomial(name: String) {
        if (polynomials.remove(name) != null) {
            println("POLYNOMIAL $name SUCCESSFULLY DELETED")
        } else {
            println("POLYNOMIAL $name DOES NOT EXIST")
        }
    }

    fun searchPolynomial(name: String) {
        val polynomial = polynomials[name]
        if (polynomial != null) {
            println("$name = $polynomial")
        } else {
            println("POLYNOMIAL $name DOES NOT EXIST")
        }
    }
}

package edu.tcu.dotnguyen.polynomial

class Polynomial(val name: String) {
    val terms = mutableListOf<Term>()

    fun addTerm(term: Term) {
        terms.add(term)
    }

    override fun toString(): String {
        return terms.joinToString(" + ") { term ->
            term.toString().replace("+ -", "- ")
        }
    }
}

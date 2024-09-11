package edu.tcu.dotnguyen.polynomial

data class Term(val coefficient: Int, val xExponent: Int, val yExponent: Int, val zExponent: Int) {
    override fun toString(): String {
        val xPart = if (xExponent == 0) "" else "(x^$xExponent)"
        val yPart = if (yExponent == 0) "" else "(y^$yExponent)"
        val zPart = if (zExponent == 0) "" else "(z^$zExponent)"
        val coefficientPart = if (coefficient == 1 && xExponent == 0 && yExponent == 0 && zExponent == 0) "1"
        else if (coefficient == -1 && xExponent == 0 && yExponent == 0 && zExponent == 0) "-1"
        else if (coefficient == 1) ""
        else if (coefficient == -1) "-"
        else "$coefficient"

        return "$coefficientPart$xPart$yPart$zPart"
    }
}
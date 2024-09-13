package edu.tcu.dotnguyen.polynomial

data class Term(
    val coefficient: Int,         // Coefficient of the term (e.g., 5 in 5x^6y^3z^2)
    val xExponent: Int,           // Exponent of x (e.g., 6 in 5x^6)
    val yExponent: Int,           // Exponent of y (e.g., 3 in 5x^6y^3)
    val zExponent: Int            // Exponent of z (e.g., 2 in 5x^6y^3z^2)
) {
    // Override toString() to display the term in a readable format.
    override fun toString(): String {
        // Format for the x part (e.g., "(x^6)"). If the exponent is 0, don't display x.
        val xPart = if (xExponent == 0) {
            ""
        } else if (xExponent == 1) {
            "(x)"
        } else {
            if (xExponent < 0) {
                "(x^($xExponent))"
            } else {
                "(x^$xExponent)"
            }
        }

        // Format for the y part (e.g., "(y^3)"). If the exponent is 0, don't display y.
        val yPart = if (yExponent == 0) {
            ""
        } else if (yExponent == 1) {
            "(y)"
        } else {
            if (yExponent < 0) {
                "(y^($yExponent))"
            } else {
                "(y^$yExponent)"
            }
        }

        // Format for the z part (e.g., "(z^2)"). If the exponent is 0, don't display z.
        val zPart = if (zExponent == 0) {
            ""
        } else if (zExponent == 1) {
            "(z)"
        } else {
            if (zExponent < 0) {
                "(z^($zExponent))"
            } else {
                "(z^$zExponent)"
            }
        }

        // Handle special cases for the coefficient (1, -1) and if the exponents are all 0.
        val coefficientPart = if (coefficient == 1 && xExponent == 0 && yExponent == 0 && zExponent == 0) "1"
        else if (coefficient == -1 && xExponent == 0 && yExponent == 0 && zExponent == 0) "-1"
        else if (coefficient == 1) ""
        else if (coefficient == -1) "-"
        else "$coefficient"

        // Combine the coefficient and the variable parts to form the final string for the term.
        return "$coefficientPart$xPart$yPart$zPart"
    }
}

package com.krenvpravo.expensenotes.models

/**
 * @author Dmitry Borodin on 2017-01-17.
 */
data class Currency(
        //ISO-4217
        val index: Int,
        val suffix: String,
        val fullName: String
) {

}

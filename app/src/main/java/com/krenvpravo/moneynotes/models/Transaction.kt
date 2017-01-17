package com.krenvpravo.moneynotes.models

/**
 * @author Dmitry Borodin on 2017-01-17.
 */
data class Transaction(
        val amoutnWithCents: Long,
        val currency: Currency,
        val description: String,
        val category: Category? = null
) {

}
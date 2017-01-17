package com.krenvpravo.expensenotes.repository

import com.krenvpravo.expensenotes.models.Transaction
import java.util.*

/**
 * @author Dmitry Borodin on 2017-01-17.
 */
object TransactionRepository{
    var transactionList : MutableList<Transaction> = ArrayList()

    fun saveTransaction(transaction: Transaction) {
        transactionList.add(transaction)
    }

    fun getTransactions() : List<Transaction> {
        return transactionList
    }

    fun cleanTransactions() {
        transactionList = ArrayList()
    }
}
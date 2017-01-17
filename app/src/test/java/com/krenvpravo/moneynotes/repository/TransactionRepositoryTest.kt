package com.krenvpravo.moneynotes.repository

import com.krenvpravo.moneynotes.models.Currency
import com.krenvpravo.moneynotes.models.Transaction
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * @author Dmitry Borodin on 2017-01-17.
 */
class TransactionRepositoryTest {

    @Before
    fun setUp() {

    }

    @After
    fun tearDown(){
        TransactionRepository.cleanTransactions()
    }

    @Test
    fun testRepositoryEmpty() {
        assertTrue(TransactionRepository.getTransactions().isEmpty())
    }

    @Test
    fun testRepositoryAdd() {
        assertTrue(TransactionRepository.getTransactions().isEmpty())
        val transaction = Transaction(
                amoutnWithCents = 10L,
                currency = Currency(1, "maney", "fullnameMoney"),
                description = "description")
        TransactionRepository.saveTransaction(transaction)

        assertTrue(TransactionRepository.getTransactions().size == 1)
        assertEquals(transaction, TransactionRepository.getTransactions().get(0))
    }

    @Test
    fun testRepositoryClean() {
        val transaction = Transaction(
                amoutnWithCents = 10L,
                currency = Currency(1, "maney", "fullnameMoney"),
                description = "description")
        TransactionRepository.saveTransaction(transaction)
        TransactionRepository.cleanTransactions()
        assertTrue(TransactionRepository.getTransactions().isEmpty())

    }

}
package com.krenvpravo.expensenotes.ui

import com.krenvpravo.expensenotes.models.Transaction

/**
 * @author Dmitry Borodin on 2017-01-19.
 */

class MainActivityContract {
    internal interface View {
        fun showTransactionsList(transactionList: List<Transaction>)
    }

    internal interface Presenter {
        fun onViewCreated()
        fun onViewDestroyed()
        fun onAddTransactionClicked()
    }
}

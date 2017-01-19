package com.krenvpravo.expensenotes.ui

import com.krenvpravo.expensenotes.models.Transaction

/**
 * @author Dmitry Borodin on 2017-01-19.
 */

class MainActivityPresenter : MainActivityContract.Presenter {

    private val transactionList: List<Transaction>? = null
    private var view: MainActivityContract.View? = null

    override fun onViewCreated() {

    }

    override fun onViewDestroyed() {
        view = null
    }

    override fun onAddTransactionClicked() {

    }
}

package com.krenvpravo.expensenotes.ui;

import com.krenvpravo.expensenotes.models.Transaction;

import java.util.List;

/**
 * @author Dmitry Borodin on 2017-01-19.
 */

public class MainActivityContract {
    interface View {
        void showTransactionsList(List<Transaction> transactionList);
    }
    interface Presenter {
        void onViewCreated();
        void onViewDestroyed();
        void onAddTransactionClicked();
    }
}

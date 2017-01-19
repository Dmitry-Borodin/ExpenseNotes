package com.krenvpravo.expensenotes.ui;

import android.support.annotation.Nullable;

import com.krenvpravo.expensenotes.models.Transaction;

import java.util.List;

/**
 * @author Dmitry Borodin on 2017-01-19.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private List<Transaction> transactionList;
    @Nullable
    private MainActivityContract.View view;

    @Override
    public void onViewCreated() {

    }

    @Override
    public void onViewDestroyed() {
        view = null;
    }

    @Override
    public void onAddTransactionClicked() {

    }
}

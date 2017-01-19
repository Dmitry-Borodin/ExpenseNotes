package com.krenvpravo.expensenotes.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.RecyclerView

import com.krenvpravo.expensenotes.R

import butterknife.BindView
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {

    internal val presenter: MainActivityContract.Presenter? = null;

    @BindView(R.id.transactions_list)
    internal var transactionsRecyclerView: RecyclerView? = null
    @BindView(R.id.main_activity_fab)
    internal var fab: FloatingActionButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        fab?.setOnClickListener { presenter?.onAddTransactionClicked() }
    }
}

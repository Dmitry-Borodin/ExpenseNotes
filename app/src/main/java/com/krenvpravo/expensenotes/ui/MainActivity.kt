package com.krenvpravo.expensenotes.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView

import com.krenvpravo.expensenotes.R

import butterknife.BindView
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {

    @BindView(R.id.transactions_list)
    internal var transactionsRecyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
    }
}

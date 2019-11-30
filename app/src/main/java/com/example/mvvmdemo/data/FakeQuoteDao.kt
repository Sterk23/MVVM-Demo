package com.example.mvvmdemo.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    //This project wont focus on database but only mvvm pattern so we will mock this part

    //Create fake db
    private val quoteList = mutableListOf<Quote>()

    // MutableLiveData is from the Architecture Components Library
    // LiveData can be observed for changes
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote){
        quoteList.add(quote)
        // After adding a quote to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        quotes.value = quoteList
    }
    fun getQuotes() = quotes as LiveData<List<Quote>>

}
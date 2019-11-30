package com.example.mvvmdemo.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvmdemo.data.Quote
import com.example.mvvmdemo.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuote(quote:Quote) = quoteRepository.addQuote(quote)
}
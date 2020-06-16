package com.example.mvvm_practice1.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    // A fake database table
    private val quoteList = mutableListOf<Quote>()

    // MutableLiveData is from the Architecture Components Library
    // LiveData can be observed for changes
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value=quoteList
    }

    fun addQuote(quote: Quote){
        quoteList.add(quote)
        quotes.value=quoteList
    }

    fun getQuotes() = quotes as LiveData<List<Quote>>
}
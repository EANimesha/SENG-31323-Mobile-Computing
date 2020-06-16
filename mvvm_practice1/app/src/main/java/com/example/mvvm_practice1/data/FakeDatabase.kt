package com.example.mvvm_practice1.data

// private constructor()==>>  Private primary constructor inaccessible from other classes
class FakeDatabase private constructor(){
    var quoteDao = FakeQuoteDao()
        private set

    companion object{
        // @Volatile - Writes to this property are immediately visible to other threads
        @Volatile private var instance:FakeDatabase?=null

        fun getInstance()= instance?: synchronized(this){
            // If it's still not instantiated, finally create an object
            // also set the "instance" property to be the currently created one
            instance ?: FakeDatabase().also { instance = it }
        }
    }
}
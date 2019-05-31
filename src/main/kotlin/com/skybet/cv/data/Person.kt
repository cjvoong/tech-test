package com.skybet.cv.data

import com.google.gson.GsonBuilder

data class Person(
    val firstname:String,
    val lastname:String
) {

    override fun toString():String {
        val gson = GsonBuilder().setPrettyPrinting().serializeNulls().create()
        return gson.toJson(this)
    }
}

data class Persons(val personList:List<Person>)
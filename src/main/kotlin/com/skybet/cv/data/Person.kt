package com.skybet.cv.data

import com.google.gson.GsonBuilder

data class Person(
    var firstname:String?="",
    var lastname:String?=""
) {

    override fun toString():String {
        val gson = GsonBuilder().setPrettyPrinting().serializeNulls().create()
        return gson.toJson(this)
    }
}

data class Persons(var personList:List<Person>?= mutableListOf()) {
    override fun toString():String{
        val gson = GsonBuilder().setPrettyPrinting().serializeNulls().create()
        return gson.toJson(personList)
    }
}
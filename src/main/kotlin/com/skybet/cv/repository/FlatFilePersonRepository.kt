package com.skybet.cv.repository

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.skybet.cv.data.Person
import com.skybet.cv.data.Persons
import org.springframework.stereotype.Repository
import java.io.File

@Repository
class FlatFilePersonRepository : PersonRepository{

    val filename = "data.txt"

    //write to file as a json string
    override fun update(persons: Persons){
        println("in update repo")
        File(filename).writeText(persons.toString())
    }

    //read local json string from file and deserialise
    override fun load():Persons {
        val gson = Gson()
        val listType = object : TypeToken<List<Person>>() { }.type

        return Persons(gson.fromJson<List<Person>>(File(filename).readText(),listType))
    }
}
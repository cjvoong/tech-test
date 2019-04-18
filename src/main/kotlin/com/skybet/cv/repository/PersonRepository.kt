package com.skybet.cv.repository

import com.skybet.cv.data.Person

interface PersonRepository{

    fun update(persons:List<Person>)
    fun load():List<Person>
}
package com.skybet.cv.repository

import com.skybet.cv.data.Persons

interface PersonRepository{

    fun update(persons:Persons)
    fun load():Persons
}
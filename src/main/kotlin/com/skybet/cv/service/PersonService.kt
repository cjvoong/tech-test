package com.skybet.cv.service

import com.skybet.cv.data.Person
import com.skybet.cv.data.Persons
import com.skybet.cv.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(val flatFilePersonRepository: PersonRepository){

    fun update(persons: Persons)=flatFilePersonRepository.update(persons)
    fun load()=flatFilePersonRepository.load()
}
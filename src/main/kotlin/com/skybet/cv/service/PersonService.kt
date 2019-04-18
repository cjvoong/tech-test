package com.skybet.cv.service

import com.skybet.cv.data.Person
import com.skybet.cv.repository.FlatFilePersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(val personRepository: FlatFilePersonRepository){

    fun update(persons:List<Person>)=personRepository.update(persons)
    fun load()=personRepository.load()
}
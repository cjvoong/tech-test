package com.skybet.cv.service

import com.skybet.cv.data.Person
import com.skybet.cv.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(val flatFilePersonRepository: PersonRepository){

    fun update(persons:List<Person>)=flatFilePersonRepository.update(persons)
    fun load()=flatFilePersonRepository.load()
}
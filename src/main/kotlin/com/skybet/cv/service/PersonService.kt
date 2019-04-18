package com.skybet.cv.service

import com.skybet.cv.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(val personRepository: PersonRepository){

    fun update()=personRepository.update()
}
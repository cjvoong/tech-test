package com.skybet.cv.controller

import com.skybet.cv.service.PersonService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController (val personService: PersonService){
    @PostMapping
    fun update() = personService.update()

}

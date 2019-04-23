package com.skybet.cv.controller

import com.skybet.cv.data.Person
import com.skybet.cv.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController (val personService: PersonService){


    //receives a list of people from a html form and puts them into a database
    @PostMapping("update")
    fun update(@RequestBody persons:List<Person>) = personService.update(persons)

    @GetMapping("load")
    fun load() = personService.load()
}

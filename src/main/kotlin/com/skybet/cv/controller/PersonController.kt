package com.skybet.cv.controller

import com.skybet.cv.data.Person
import com.skybet.cv.service.PersonService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class PersonController (val personService: PersonService){


    //receives a list of people from a html form and puts them into a database
    @GetMapping("update")
    fun update(@RequestParam("people[][firstname]") firstnames:List<String>,
               @RequestParam("people[][surname]") lastnames:List<String>) {
        val persons = firstnames.zip(lastnames).map{Person(it.first,it.second)}
        personService.update(persons)
    }

    @GetMapping("load")
    fun load() = personService.load()
}

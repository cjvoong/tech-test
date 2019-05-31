package com.skybet.cv.controller

import com.skybet.cv.data.Person
import com.skybet.cv.data.Persons
import com.skybet.cv.service.PersonService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class PersonController (val personService: PersonService){

    //receives a list of people from a html form and puts them into a database
    @PostMapping("update")
    fun update(@ModelAttribute persons: Persons, model:Model):String {
        println("in update controller")
        personService.update(persons)
        model.addAttribute("persons",personService.load())
        return "markup"
    }

    @GetMapping("load")
    fun load(model:Model):String {
        model.addAttribute("persons",personService.load())
        return "markup"
    }

}

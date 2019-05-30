package com.skybet.cv.controller

import com.skybet.cv.data.Person
import com.skybet.cv.service.PersonService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class PersonController (val personService: PersonService){

    @Value("\${welcome.message}")
    private lateinit var message:String

    private val tasks = listOf("a","b","c","d","e")

    //receives a list of people from a html form and puts them into a database
    @GetMapping("update")
    fun update(@RequestParam("people[][firstname]") firstnames:List<String>,
               @RequestParam("people[][surname]") lastnames:List<String>) {
        val persons = firstnames.zip(lastnames).map{Person(it.first,it.second)}
        personService.update(persons)
    }

    @GetMapping("load")
    fun load() = personService.load()

    @GetMapping("hello")
    fun welcomeExample(@RequestParam(name = "name", required = false, defaultValue = "") name:String,  model:Model):String {
        model.addAttribute("message", name)
        return "welcome" //view
    }

    @GetMapping("/")
    fun welcome(model:Model):String {
        model.addAttribute("message",message)
        model.addAttribute("tasks",tasks)
        return "welcome"
    }
}

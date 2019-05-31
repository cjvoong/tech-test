package com.skybet.cv.service

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import com.skybet.cv.data.Person
import com.skybet.cv.data.Persons
import com.skybet.cv.repository.FlatFilePersonRepository
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested

@DisplayName("Person Service")
class PersonServiceTest{

    private lateinit var underTest:PersonService
    private lateinit var repo: FlatFilePersonRepository

    @BeforeEach
    fun beforeEach(){
        repo = mock()
        underTest = PersonService(repo)
    }

    @Nested
    inner class `Given the person service` {

        @Nested
        inner class `When I update the list of persons` {
            @Test
            fun `Then it should update the list of persons`() {
                //whenever(repo.update(any())).thenReturn()
                //assert(1==2)
            }
        }

        @Nested
        inner class `When I try to load persons` {
            @Test
            fun `Then I should get the list of persons returned`() {
                val persons = Persons(listOf(Person("Johnny","Bravo"), Person("Ace","Ventura")))
                whenever(repo.load()).thenReturn(persons)

                val result = underTest.load()

                assert(persons == result)
            }
        }
    }
}
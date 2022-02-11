package com.makenshi.fundamentosjunit

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class AssertionsUserAdultTest {
    private lateinit var bot: User
    private lateinit var juan: User

    @get:Rule
    val locationESRule = LocationESRule()

    @Before
    fun setUp() {
        bot = User(name = "Juan", age = 18, true)
        juan = User(name = "Juan", age = 18)
    }

    @After
    fun tearDown() {
        bot = User()
        juan = User()
    }

    @Test
    fun isAdultTest() {
        /*val assertions = Assertions()
        assertions.setLocation("ES")
        assertTrue(assertions.isAdult(juan))
        assertTrue(assertions.isAdult(bot))*/

        assertEquals(true, locationESRule.assertions?.isAdult(juan))
        assertEquals(true, locationESRule.assertions?.isAdult(bot))
    }
}
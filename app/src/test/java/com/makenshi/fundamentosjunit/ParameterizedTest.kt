package com.makenshi.fundamentosjunit

import org.junit.AfterClass
import org.junit.Assert.assertEquals
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(var currentValue: Boolean,
                        var currentUser: User) {

    @get:Rule
    val locationESRule = LocationESRule()

    companion object {

        var assertions: Assertions? = null

        @BeforeClass @JvmStatic
        fun setUpCommon() {
            assertions = Assertions()
        }

        @AfterClass @JvmStatic
        fun tearDown() {
            assertions = null
        }

        @Parameterized.Parameters @JvmStatic
//        fun getUsersUS() = arrayOf(
//            arrayOf(false, User("Pedro", 12)),
//            arrayOf(true, User("Clara", 34)),
//            arrayOf(true, User("bot21", 4, false)),
//            arrayOf(false, User("Alex", 18)))
        fun getUsersES() = arrayOf(
            arrayOf(true, User("Pedro", 19)),
            arrayOf(false, User("Clara", 14)),
            arrayOf(true, User("bot21", 4, false)),
            arrayOf(true, User("Alex", 18)))
    }

    @Test
    fun isAdultTest() {
        //assertEquals(currentValue, assertions?.isAdult(currentUser))
        assertEquals(currentValue, locationESRule.assertions?.isAdult(currentUser))
    }
}
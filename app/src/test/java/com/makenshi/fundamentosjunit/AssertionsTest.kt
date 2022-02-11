package com.makenshi.fundamentosjunit

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class AssertionsTest {
    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        val array = arrayOf(21, 117) //valor esperado
        assertArrayEquals("mensaje personalziado de error en testing", array, assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest() {
        val assertions = Assertions()
        val name = "Alain"
        val otherName = "Max"
        assertEquals(name, assertions.getName())
        assertNotEquals(otherName, assertions.getName())
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        val bot = User(name = "8Bit", age = 1, false)
        val juan = User(name = "Juan", age = 18)

        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
    }

    @Test
    fun checkNullUserTest() {
        val user = null
        val assertions = Assertions()

        assertNull(user)
        assertNull(assertions.checkHuman(user))
        assertNotNull(user)
    }

    @Test
    fun checkNotNullUserTest() {
        val juan = User(name = "Juan", age = 18)
        assertNotNull(juan)
    }

    @Test
    fun checkNotSameUsersTest() {
        val bot = User(name = "8Bit", age = 1, false)
        val juan = User(name = "Juan", age = 18)

        assertNotSame(bot, juan)
    }

    @Test
    fun checkSameUsersTest() {
        val bot = User(name = "Juan", age = 18, true)
        val juan = User(name = "Juan", age = 18)
        val copyJuan = juan

        assertSame(copyJuan, juan)
    }

    @Test(timeout = 1_000)
    fun getCitiesTest() {
        val cities = arrayOf("México", "Perú", "Argentina")
        Thread.sleep(Random.nextLong(200, 1_100))
        //Thread.sleep(Random.nextLong(950, 1_050))
        assertEquals(3, cities.size)
    }
}
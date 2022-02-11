package com.makenshi.fundamentosjunit

import org.junit.*
import org.junit.Assert.*

class AssertionsUsersTest {
    private lateinit var bot: User

    companion object {
        private lateinit var juan: User

        @BeforeClass
        @JvmStatic
        fun setupCommon() {
            juan = User(name = "Juan", age = 18)
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon() {
            juan = User()
        }
    }

    @Before
    fun setup() {
        bot = User(name = "8Bit", age = 1, false)
    }

    @After
    fun tearDown() {
        bot = User()
    }

    @Test
    fun chekHumanTest() {
        val assertions = Assertions()

        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
    }

    @Test
    fun checkNotNullUserTest() {
        assertNotNull(juan)
    }

    @Test
    fun checkNotSameUsersTest() {
        assertNotSame(bot, juan)
    }

    @Test
    fun checkSameUsersTest() {
        val copyJuan = juan
        assertSame(copyJuan, juan)
    }
}
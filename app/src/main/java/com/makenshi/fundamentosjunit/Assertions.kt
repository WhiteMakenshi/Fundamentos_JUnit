package com.makenshi.fundamentosjunit

class Assertions {
    private val user = User("Alain", 31)
    private var location = "US"

    fun setLocation(location: String) {
        this.location = location
    }

    fun getLuckyNumbers() : Array<Int> {
        return arrayOf(21, 117)
    }

    fun getName() : String {
        return user.name
    }

    fun checkHuman(user: User) = user.isHuman

    fun checkHuman(user: User? = null) : Boolean? {
        return user?.isHuman ?: return null
    }

    fun isAdult(user: User) : Boolean {
        if(!user.isHuman) return true

        return if (location == "US") user.age>= 21
            else return user.age >= 18
    }
}
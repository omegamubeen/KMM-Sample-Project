package com.mubeen.mykmm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hi, ${platform.name}!"
    }
}
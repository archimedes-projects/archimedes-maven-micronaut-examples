package io.archimedesfw.maven.micronaut.example.todo


import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        val applicationContext = Micronaut.run(Application::class.java)
    }

}

package tid.intro.example5

import tid.intro.Example
import java.util.Collections

data class PersonalInfo(val name: String, val surname: String?, val phone: String?)

data class User(val id: String, val email: String, val personalInfo: PersonalInfo?)

// class as example of the final result data
data class Output(val email: String?, val name: String, val surname: String)

class Example5(val users: List<User>) : Example {

    override fun execute() {
        println("${this.javaClass.name} parseData1: ${parseData1()}")
        printPersonalInfo()
    }

    fun parseData1(): String = users.filter {
        it.personalInfo?.surname != null
    }.map {
        Output(it.email,
                it.personalInfo!!.name,
                it.personalInfo.surname!!)
    }.toString()

    fun printPersonalInfo() =
        users.stream().forEach{
            it.personalInfo?.let {
                println(Output(null,
                        it.name,
                        it.surname?.let { it }.orEmpty() ).toString())
            }
        }




}
package tid.intro

import tid.intro.example1.Example1
import tid.intro.example2.Example2
import tid.intro.example3.Example3
import tid.intro.example4.Example4
import tid.intro.example4.Request
import tid.intro.example5.Example5
import tid.intro.example5.PersonalInfo
import tid.intro.example5.User


/* enum example
enum class ExampleType {
    BASIC, INHERITANCE, CONSTRUCTORS, CONSTRUCTORS_SECONDARY, NULL, NULL_EXCEPTION, FUNCTIONS
}*/

class ExampleFactory {

    fun createExample(exampleType: Int) =
            when (exampleType) {
                1 -> Example1()
                2 -> Example2()
                3 -> Example3("Alice")
                31 -> Example3("Alice", "Bob")
                4 -> Example4(Request("Arquiñano", null, null))
                41 -> Example4(Request(null, null, null))
                5 -> {
                    Example5(createUserList())
                }
                else -> throw IllegalArgumentException("Invalid example type")
            }

    private fun createUserList(): List<User> = arrayListOf(
            User("aa2d3g6k",
                    "example@tid.es",
                    PersonalInfo("Frodo", "Bolson", null)),

            User("bb2d3g12",
                    "example2@tid.es",
                    PersonalInfo("Gandalf", null, null)))


}
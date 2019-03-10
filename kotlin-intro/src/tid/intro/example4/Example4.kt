package tid.intro.example4

import tid.intro.Example

class Example4(val request: Request) : Example {

    override fun execute() = println("${this.javaClass.name} ${getData()}")

    fun getData(): String {
        val dataN = request.name!!.get(0)
        val dataS = request.surname?.get(0) ?: "X"
        val dataP = request.phone?.get(0)
        return "$dataN $dataS $dataP"
    }

}
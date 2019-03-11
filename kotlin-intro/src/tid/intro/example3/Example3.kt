package tid.intro.example3

import tid.intro.Example

class Example3 constructor(var name: String) : Example {

    init {
        name = "$name $SUFFIX"
    }

    constructor(name: String, surname: String) : this(name) {
        this.name = "${this.name} $surname"
    }

    override fun execute() = println("${this.javaClass.name} $name")

    companion object {
        const val SUFFIX = "third example"
    }
}
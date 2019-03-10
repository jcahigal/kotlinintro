package tid.intro.example2

import tid.intro.Example

class Example2: ExampleFather(), Example {

    override fun execute() {
        println("this is ${this.javaClass.name} and my father is ${this.javaClass.genericSuperclass.typeName}")
    }

     override fun execute2() {
        TODO("not implemented")
    }

}
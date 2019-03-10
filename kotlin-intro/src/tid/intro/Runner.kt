package tid.intro


fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide a example type")
        return
    }
    val ex = ExampleFactory().createExample(args[0].toInt())
    ex.execute()
}



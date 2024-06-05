fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    // println("Program arguments: ${args.joinToString()}")

    // hello("Mary", 20)
    // basicTypes()
    // whenButton()
    // refactorPizza()
    // fizzbuzz()
    // startsWithL()

//    val p1 = circleArea(2)
//    println(p1)

//    val p2: List<Int> = listOf(
//        intervalInSeconds(1, 20, 15),
//        intervalInSeconds(minutes = 1, seconds = 25),
//        intervalInSeconds(hours = 2),
//        intervalInSeconds(minutes = 10),
//        intervalInSeconds(hours = 1, seconds = 1)
//    )
//    println(p2)

    lambda1()

    repeatN(5) {
        println("Hello")
    }
}

fun hello(name: String, age: Int) {
    println("$name is $age years old")
    return
}

fun basicTypes() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

    println(3.14F)
}

fun whenButton() {
    val button = "A"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}

fun refactorPizza() {
    var pizzaSlices = 0

    pizzaSlices++

    while (pizzaSlices < 8) {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun fizzbuzz() {
    var n = 1

    while (n <= 100) {
        var word: String = ""

        if (n % 3 === 0) word += "fizz"
        if (n % 5 === 0) word += "buzz"
        if (word.length !== 0) println(word)

        n++
    }
}

fun startsWithL() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for (word in words) {
        if (word[0] === 'l') println(word)
    }
}
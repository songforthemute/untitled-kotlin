package functional

/**
 * 고차 함수: 다른 함수를 매개변수로 받거나, 함수를 반환하는 함수
 */

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun doHigherOrderFunction() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumReulst $sumResult, mulResult $mulResult")
}

fun square(x: Int) = x * x
fun operation(): (Int) -> Int {
    return ::square
}

fun doReturningFunction() {
    val func = operation()
    println(func(2))
}


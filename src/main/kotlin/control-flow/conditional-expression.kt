package `control-flow`

/**
 * 코틀린에는 삼항 연산자 대신,
 * 조건문이 따로 있음
 */

fun do_conditional_expression() {
    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(99, -42)) // 99
}
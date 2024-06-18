package `control-flow`

/**
 * `==` 구조 비교
 * `===` 참조 비교
 *
 * `a == b`의 경우,
 *  정확히는 `a.equals(b)`로 컴파일됨
 */

fun do_equality_checks() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // true
    println(authors === writers) // false
}
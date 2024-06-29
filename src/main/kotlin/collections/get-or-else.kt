package collections

/**
 * getOrElse 함수는 컬렉션의 요소에 대한 안전한 접근을 제공
 * 인덱스와, 인덱스가 Out of Bound인 경우 기본값을 제공하는 함수를 받음
 */

val list = listOf(0, 10, 20)

fun doGetOrElse() {
    println(list.getOrElse(1) { 42 }) // 10
    println(list.getOrElse(10) { 42 }) // 42
}

private val maps = mutableMapOf<String, Int?>()

fun doGetOrElse2() {
    println(maps.getOrElse("x") { 1 }) // 1

    maps["x"] = 3
    println(maps.getOrElse("x") { 1 }) // 3

    maps["x"] = null
    println(maps.getOrElse("x") { 1 }) // 1
}
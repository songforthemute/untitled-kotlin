package collections

/**
 * minOrNull, maxOrNull 함수는 컬렉션의 가장 작은 요소 및 가장 큰 요소 반환
 * 컬렉션이 비어 있는 경우 null 반환
 */

private val nums = listOf(1, 2, 3)
private val empty = emptyList<Int>()
val only = listOf(3)

fun doMinMaxOrNull() {
    println("Numbers: $nums, min = ${nums.minOrNull()} max = ${nums.maxOrNull()}") // 1
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")        // 2
    println("Only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")
}

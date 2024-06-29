package collections

import kotlin.math.abs

/**
 * sorted는 자연 정렬 순서(오름차순)에 따라 정렬된 컬렉션 요소의 목록 반환
 * sortedBy는 지정된 선택자 함수에 의해 반환된 값의 자연 정렬 순서에 따라 요소 정렬
 */

val shuffled = listOf(5, 4, 2, 1, 3, -10)
val natural = shuffled.sorted()
val inverted = shuffled.sortedBy { -it }
val descending = shuffled.sortedDescending()
val descendingBy = shuffled.sortedByDescending { abs(it) }

fun doSorted() {
    println("shuffled: $shuffled")
    println("natural: $natural") // [-10, 1, 2, 3, 4, 5]
    println("inverted: $inverted") // [5, 4, 3, 2, 1, -10]
    println("descending: $descending") // [5, 4, 3, 2, 1, -10]
    println("descendingBy: $descendingBy") // [-10, 5, 4, 3, 2, 1]
}
package collections

/**
 * partition 함수는 주어진 predicate를 사용해 원래 컬렉션을 한 쌍의 리스트로 분할
 * 1. predicate가 참인 요소들
 * 2. predicate가 거짓인 요소들
 */

fun doPartition() {
    val nums = listOf(1, -2, 3, -4, 5, -6)

    val evenOdd = nums.partition { it % 2 == 0 }
    val (positives, negatives) = nums.partition { it >= 0 }

    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")
    println("Odd numbers: ${evenOdd.second}")
    println("Positive numbers: $positives")
    println("Negative numbers: $negatives")
}
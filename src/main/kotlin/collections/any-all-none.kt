package collections

/**
 * any 함수: 컬렉션에 일치하는 요소가 하나 이상 포함되어 있을 때 true 반환
 */

private val numbers2 = listOf(1, -2, 3, -4, 5, -6)
private val anyNegative = numbers2.any { it < 0 }
private val anyGT6 = numbers2.any { it > 6 }

/**
 * all 함수: 컬렉션의 모든 요소가 지정된 요소와 일치하면 true를 반환
 */

private val numbers3 = listOf(1, -2, 3, -4, 5, -6)
private val allEven = numbers.all { it % 2 == 0 }
private val allLess6 = numbers.all { it < 6 }

/**
 * none 함수: 컬렉션에 지정된 요소와 일치하는 요소가 없는 경우 true 반환
 */

private val numbers4 = listOf(1, -2, 3, -4, 5, -6)
private val allOdd = numbers.none { it % 2 == 1 }
private val allLess2 = numbers.none { it < 2 }


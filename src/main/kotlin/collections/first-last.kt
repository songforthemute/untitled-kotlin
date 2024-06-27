package collections

/**
 * first, last
 * 컬렉션의 첫 번째 요소 및 마지막 요소를 각각 반환
 * predicate 함수와 함께 사용할 수도 있으며, 이 경우 해당 요소와 일치하는 첫 번째 및 마지막 요소를 반환
 * 빈 컬렉션 혹은 일치하는 요소가 없는 경우 NoSuchElementException을 발생시킴
 */

private val nums = listOf<Int>(1, 2, 3, 4, 5, -6)

private val first = nums.first()
private val last = nums.last()

private val firstEven = nums.first { it % 2 == 0 }
private val lastOdd = nums.last { it % 2 != 0 }

/**
 * firstOrNull, lastOrNull
 * 거의 동일한 방식으로 동작하지만, 일치하는 요소가 없을 경우 null 반환
 */

private val words = listOf("foo", "bar", "baz", "faz")
private val empty = emptyList<String>()

private val firstEmpty = empty.firstOrNull()
private val lastEmpty = empty.lastOrNull()

private val firstF = words.firstOrNull { it.startsWith('f') }
private val firstZ = words.firstOrNull { it.startsWith('z') }
private val lastF = words.lastOrNull { it.endsWith('f') }
private val lastZ = words.lastOrNull { it.endsWith('z') }
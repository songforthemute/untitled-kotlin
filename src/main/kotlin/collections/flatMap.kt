package collections

/**
 * flatMap 함수는 컬렉션의 각 요소를 이터러블 객체로 변환하고,
 * 변환 결과의 싱글 리스트를 생성.
 *
 * 변환은 사용자가 정의.
 */

val fruitsBag = listOf("apple", "orange", "banana", "grapes")
val clothesBag = listOf("shirts", "pants", "jeans")
val cart = listOf(fruitsBag, clothesBag)
val mapBag = cart.map { it }
val flatMapBag = cart.flatMap { it }
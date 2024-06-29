package collections

/**
 * getValue 함수는 주어진 키에 해당하는 기존 값을 반환하거나,
 * 키를 찾을 수 없는 경우 예외를 반환
 *
 * withDefault 함수로 만든 맴의 경우,
 * getValue는 예외를 발생시키는 대신 기본값을 반환
 */

val map = mapOf("key" to 42)

val value1 = map["key"] // 42
val value2 = map["key2"] // null

val value3: Int = map.getValue("key") // 42

val mapWithDefault = map.withDefault { k -> k.length }
val value4 = mapWithDefault.getValue("key2") // 4, 위에서 key2의 길이로 설정됨

fun doMapElementAccess() {
    println(value1)
    println(value2)
    println(value3)
    println(value4)

    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message: $e") // Message: java.util.NoSuchElementException: Key anotherKey is missing in the map.
    }
}
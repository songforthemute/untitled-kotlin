package delegation

/**
 * 프로퍼티 위임은 속성을 저장하는 데 사용할 수 있음
 * JSON 구문 분석이나 기타 '동적' 작업과 같은 작업에 유용
 *
 * 변경 가능한 속성을 맵에 위임할 수도 있음
 * 이 경우 프로퍼티가 할당되면 맵이 수정됨(MutableMap이 필요함)
 */

class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun doStoringPropertiesInMap() {
    val user = User(
        mapOf(
            "name" to "John Doe",
            "age" to 25
        )
    )

    println("name = ${user.name}, age = ${user.age}")
}
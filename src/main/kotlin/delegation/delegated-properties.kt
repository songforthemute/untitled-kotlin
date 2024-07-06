package delegation

import kotlin.reflect.KProperty

/**
 * 코틀린은 프로퍼티 집합 및 get 메서드의 호출을
 * 특정 객체에 위임할 수 있는 위임된 속성 메커니즘 제공
 * 이 경우, 델리게이트 객체에는 getValue 메서드가 있어야 함
 * 변경 가능한 속성의 경우 setValue도 필요함
 */

class Example {
    val p: String by Delegate()

    override fun toString() = "Example Class"
}

class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun doDelegatedProperties() {
    /**
     * String 타입의 속성 p를 Delegate 클래스의 인스턴스로 위임
     * 델리게이트 객체는 by 키워드 뒤에 정의됨
     * 불변 프로퍼티의 경우 getValue만 필요함
     */
    val e = Example()
    println(e.p)
    // e.p = "NEW" // Error!
}
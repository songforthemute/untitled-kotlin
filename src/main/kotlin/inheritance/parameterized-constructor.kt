package inheritance

/**
 * 서브 클래스를 생성할 때, 슈퍼클래스의 매개변수화된 생성자를 사용하려면
 * 서브 클래스 선언에 생성자 인수 제공
 */

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

fun parameterizedConstructor() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello() // A tiger from Siberia says: grrhhh!
}
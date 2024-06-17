package inheritance

/**
 * name은 변수도, 값도 아닌 생성자 인자로서,
 * 그 값은 슈퍼클래스 Lion의 name 프로퍼티로 전달됨
 *
 * Rufo라는 이름의 Asiatic 인스턴스를 생성하면,
 * 이 호출은 인자 Rufo, India를 사용하여 Lion 생성자를 호출
 */

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin, says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun passingConstructor() {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello() // Rufo, the lion from India, says: graoh!
}
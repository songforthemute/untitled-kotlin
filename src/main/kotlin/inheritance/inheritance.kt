package inheritance

/**
 * 코틀린 클래스는 기본적으로 final
 * 클래스 상속을 허용하려면 클래스에 open 수정자를 표기해야 함
 *
 * 코틀린 메서드도 기본적으로 final
 * 클래스와 마찬가지로 open 수정자를 사용하면 메서드 재정의 가능
 *
 * 클래스 이름 쉬에 : SuperclassName()을 지정하면 클래스가 슈퍼클래스를 상속
 *
 * 빈 괄호는 슈퍼클래스 기본 생성자의 호출을 의미함
 * 메서드나 속성을 재정의하려면 override 수정자가 필요
 */

open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

fun inheritance() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}
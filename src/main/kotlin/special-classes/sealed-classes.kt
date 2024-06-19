package `special-classes`

/**
 * sealed 클래스는 상속의 사용을 제한할 수 있음
 *
 * sealed 클래스를 선언하면 sealed 클래스가 선언된 패키지 내부에서만 하위 클래스를 지정할 수 있음
 * sealed 클래스가 선언된 패키지 외부에서는 하위 클래스를 선언할 수 없음
 */

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're woking as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun doSealedClasses() {
    println(greetMammal(Cat("Snowy"))) // Hello Snowy
}
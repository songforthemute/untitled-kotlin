/**
 * 이터레이터
 *
 * 클래스에서 이터레이터 연산자를 구현해 자신만의 이터레이터 정의 가능
 *
 * 1. 클래스에서 이터레이터 정의
 *      이터레이터의 이름은 `iterator`이고, `operator fun`으로 정의해야 함
 * 2. 다음 메서드 요구 사항을 충족하는 이터레이터를 반환
 *      `next()`: 다음 요소 반환
 *      `hasNext()`: 다음 요소가 존재하는지 여부 확인
 * 3. 사용자 정의 이터레이터로 반복
 *
 * 이터레이터는 타입으로 선언하고나, 확장 함수로 선언 가능
 */

class Animal(val name: String)
class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun doIterators() {
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}
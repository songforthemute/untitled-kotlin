package functions

/**
 * 단일 매개변수가 있는 멤버 함수와 확장은 인픽스 함수로 전환 가능
 * 인픽스 표기법은 멤버 함수(메서드)에서도 작동
 * 이 경우, 포함하는 클래스가 첫 번째 매개변수가 됨
 */
fun infixes() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ") // "Bye Bye "

    val pair = "Ferrari" to "Katrina"
    println(pair) // (Ferrari, Katrina)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair) // (McLaren, Lucas)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia // Calls the likes method, using the infix notation
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}